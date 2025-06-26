// 2. Given an array nums of positive integers of size N. Find all distinct digits present in nums.

// Example 1:
// Input: nums = [131, 11, 48]
// Output: 1 3 4 8
// Explanation: 1, 3, 4, and 8 are only distinct
// digits that can be extracted from the numbers
// of the array.

// Example 2:
// Input: nums = [111, 222, 333, 4444, 666]
// Output: 1 2 3 4 6
// Explanation: 1, 2, 3, 4, and 6 are only distinct
// digits that can be extracted from the numbers
// of the array.

import java.util.Scanner;

public class distinct{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the elements of an array: ");
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        boolean[] digits = new boolean[10];
        int remainder = 0;
        for(int each : numbers){
            while(each>0){
                remainder = each%10;
                digits[remainder]=true;
                each/=10;
            }
        }
        for(int index =0; index<digits.length; index++){
            if(digits[index])
            System.out.print(index+" ");
        }
        sc.close();
    }
}