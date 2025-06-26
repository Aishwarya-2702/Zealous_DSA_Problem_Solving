// Find Factorial using recursion

// Example:
// Input: 5 
// Output: 120

package Day4;

import java.util.Scanner;

public class Factorial {
    public static int fact(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int input = sc.nextInt();

        if(input<0){
            System.out.println("Factorial is not defined for negative numbers");
        }
        else{
            int result = fact(input);
            System.out.println("Factorial of "+input+ " is " + result);
        }
        sc.close();
    }
}
