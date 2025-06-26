// Find Max in array using recursion
// Example:
// Input: 0, 4, 5, 3, 7, 2, 1
// Output: 7

package Day4;

import java.util.Scanner;

public class FindMaxviaRecursion {
    public static int findMax(int[] arr,int current) {
        if(current == arr.length-1)
        return arr[current];
        else{
            int currentMax = findMax(arr, current+1);
            return Math.max(arr[current], currentMax);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements of an array: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findMax(arr, 0));
        sc.close();
    }
}