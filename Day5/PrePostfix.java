// Using recursion find prefix and postfix sum
// Input:
// 23,12,98,45,18,45,12,98
// Output:
// Prefix Sum: [23, 35, 133, 178, 196, 241, 253, 351]                         
// Postfix Sum: [351, 328, 316, 218, 173, 155, 110, 98]

import java.util.Arrays;
import java.util.Scanner;

public class PrePostfix { 
    public static void preSum(int[] arr, int[] pre, int index){
        if(index==0)
        pre[0]=arr[0];
        else{
            preSum(arr, pre, index-1);
            pre[index] = pre[index-1]+arr[index];
        }
    }
    
    public static void postSum(int[] arr, int[] post,int index){
        if(index==arr.length-1)
        post[arr.length-1]=arr[arr.length-1];
        else{
            postSum(arr, post, index+1);
            post[index] = post[index+1]+arr[index];
        }
    }      
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();

        int nums[] = new int[size];

        System.out.println("Enter the elements of an array: ");
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }

        int[] preSum=new int[size];
        int[] postSum = new int[size];
        preSum(nums, preSum, size-1);
        System.out.println(Arrays.toString(preSum));
        postSum(nums,postSum,0);
        System.out.println(Arrays.toString(postSum));
    }
}
