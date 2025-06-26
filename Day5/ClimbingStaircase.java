// This is one of the most popular coding problems which can be solved using the Dynamic Programming technique. In this problem we gonna find via recursion i.e divide and conquer, you are climbing a staircase. It takes n steps to reach the top. Each time you can either climb 1 or 2 steps. The question is, in how many distinct ways can you climb to the top?
// Note: Given n will be a positive integer.

// Example 1:
// Input: 2
// Output: 2
// Explanation: There are two ways to climb to the top.
// 1. 1 step + 1 step
// 2. 2 steps

// Example 2:
// Input: 3
// Output: 3
// Explanation: There are three ways to climb to the top.
// 1. 1 step + 1 step + 1 step
// 2. 1 step + 2 steps
// 3. 2 steps + 1 step.

// Example 3:
// Input: 5
// Output: 8
import java.util.Scanner;

public class ClimbingStaircase{
    public static int climb(int number){
        if(number<=0){
            return 0;
        }
        else if(number==1){
            return 1;
        }
        else if(number==2){
            return 2;
        }
        else{
            return climb(number-1)+climb(number-2);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println(climb(num));
        sc.close();
    }
}