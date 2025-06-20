// Assume that your are part of support team in IRCTC app where customers would raise issue and it will be considered priority ticket such as 0, 1 and 2. now today tickets are in the bucket and you need to arrange it by priority

// Example:
// Input:
// 2,0,0,1,0,2,0,1
// Output:
// 0,0,0,0,1,1,2,2

import java.util.Scanner;
import java.util.Arrays;

public class IRCTC{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();

        int[] issue = new int[size];

        System.out.println("Enter the elements of an Array: ");
        for(int i = 0; i < size; i++){
            issue[i] = sc.nextInt();
        }

        Arrays.sort(issue);

        System.out.println("Sorted Array: ");
        System.out.println(Arrays.toString(issue));
    }
}