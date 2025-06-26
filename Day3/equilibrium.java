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
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of an array: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

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
        sc.close();
    }
}