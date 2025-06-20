// IPL Bowlers stats of every over how many runs he has given to opposite team, now find the maiden overs at the last of his stats.

// example:
// Input:
// 20,0,19,5,0,3,10,0,2
// Output:
// 20,19,5,3,10,2,0,0,0

// Input:
// 3,0,0,1,0,5,0,6,0
// Output:
// 3,1,5,6,0,0,0,0,0

import java.util.Scanner;
import java.util.Arrays;

public class ipl{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an Array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elemnts of an array: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        int index = 0, valid = 0;

        while(index<size){
            if(arr[index] != 0){
                arr[valid] = arr[index];
                valid++;
            }
            index++;
        }

        Arrays.fill(arr, valid, size, 0);
        System.out.println(Arrays.toString(arr));
    }
}