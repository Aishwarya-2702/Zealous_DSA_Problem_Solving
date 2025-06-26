// using recursion find inversion count
// Using recursion find the inversion of count
// You are working for an e-commerce company that deals with a large volume of customer orders. The company wants to optimize its warehouse operations by analyzing the efficiency of order processing.
// The goal is to count the number of inversion pairs in the order processing times to identify potential inefficiencies. An inversion pair in this context is defined as a situation where a later order (in terms of processing sequence) took less time to process than an earlier order. By identifying these inversions, you can pinpoint areas where the warehouse team may need to improve their workflow or processes.
// Input
// An array P[] of n integers representing the processing times of orders, in the order they were processed.
// Output
// The count of inversion pairs in the array.

// Example
// Input:
// P[] = [30, 45, 25, 60, 20]
// Output:
// The inversion count is 6
// Explanation: There are 5 inversion pairs in the array:
// (45, 25) where 45 > 25 and 
// (45, 20) where 45 > 20 and 
// (30, 25) where 30 > 25 and 
// (30, 20) where 30 > 20 and 
// (60, 20) where 60 > 20 and 
// (25, 20) where 25 > 20

import java.util.Scanner;

public class Inversion {
    public static int mergeAndCount(int[] src, int[] swap, int start, int mid, int end){
        int inversionCount = 0;
        int leftIndex = start, rightIndex = mid+1, current = start;
        while (leftIndex<=mid&&rightIndex<=end) {
            if(src[leftIndex]>=src[rightIndex]){
                swap[current] = src[rightIndex];
                rightIndex++;
                inversionCount += (mid-leftIndex+1);
            }           
            else{
                swap[current]=src[leftIndex];
                leftIndex++;
            }
            current++;
        }

        while(leftIndex<=mid){
            swap[current]=src[leftIndex];
            leftIndex++;
        }
        while(rightIndex<=end){
            swap[current]=src[rightIndex];
            rightIndex++;
        }

        //replace soreted elements into original array
        for(int index = start; index<=end; index++){
            src[index] = swap[index];
        }

        return inversionCount;
    }

    public static int divide(int[] src, int[] swap, int start, int end){
        int inversion = 0;
        if(start<end){
            int mid = start+(end-start)/2;
            inversion+= divide(src, swap, start, mid);
            inversion+=divide(src, swap, mid+1, end);
            inversion+=mergeAndCount(src, swap, start, mid, end);
        }
        return inversion;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements of an array: ");
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        int[] temp = new int[size];
        System.out.println(divide(arr, temp, 0, size-1));
        sc.close();
    }
}
