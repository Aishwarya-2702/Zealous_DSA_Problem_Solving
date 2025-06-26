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

        int[] tickets = new int[size];

        System.out.println("Enter the elements of an Array: ");
        for(int i = 0; i < size; i++){
            tickets[i] = sc.nextInt();
        }

        int start = 0, current = 0, end = size - 1;

        while(current<=end){
            if(tickets[current]==0){
                //swap b/w current and start
                tickets[current]+=tickets[start];
                tickets[start]=tickets[current]-tickets[start];
                tickets[current]-=tickets[start];
                start++;
                current++;
            }
            else if(tickets[current]==1){
                current++;
            }
            else{
                //swap b/w current and end
                tickets[end]+=tickets[current];
                tickets[current]=tickets[end]-tickets[current];
                tickets[end]-=tickets[current];
                end--;
            }
        }
        System.out.println(Arrays.toString(tickets));
        sc.close();
    }
}