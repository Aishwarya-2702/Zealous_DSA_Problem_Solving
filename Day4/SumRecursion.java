// Assume that grocery shop generating bills with different amount, now the shopkeeper wants to cumulate the bills. so help him to find total revenue by using recursion

// Example:
// Input:
// [900,20,450,210,60]
// Output:
// 1640

package Day4;

import java.util.Scanner;

public class SumRecursion {
    public static int findSum(int[] data, int current){
        if(current>=data.length)
        return 0;
        else
        return data[current]+findSum(data, current+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of an array: ");
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(findSum(arr,0));
        sc.close();
    }
}
