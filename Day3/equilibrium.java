// 3. Equilibrium index:

// Example:
// Input:
// -7, 1, 5, 2, -4, 3, 0
// Output:
// 3

// Input:
// 0,-3,5,-4,-2,3,1,0
// Output:
// 0

import java.util.Scanner;

public class equilibrium{
    public static void main(String[] args){
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        int totalSum = 0;
        for(int each : arr){
            totalSum+=each;
        }

        int partSum = 0;
        for(int index=0; index<arr.length; index++){
            totalSum-=arr[index];
            if(totalSum==partSum){
                System.out.println(index);
                return;
            }
            else{
                partSum+=arr[index];
            }
        }
    }
}