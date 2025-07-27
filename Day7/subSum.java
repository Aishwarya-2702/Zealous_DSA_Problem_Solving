// Consider the following array is account balance of last 7 transactions, find the period of time (subSum) where the max amount kept in the account.
// (max sub array where sum is max)

// eg:
// Input: 2, -4, 1, 9, -6, 7, -3
// output: 11

// Input: 2, -4, 1, 9, -6, -3
// Output: 10

// 0   1   2  3   4  5  6
// 2, -4, 1, 9, -6, 7, -3

// 0  1 2 3
// 2,-4,1,9
// 0   1
// 2, -4
// ls>>2, rs>>-4, cs>>-2

// 2,3
// 1,9
// ls>>1, rs>>9, cs>> 10

// backtrack:
// 0 to 3
// 0 1  2 3  >> s>>0,m>>1,e>>3
// 2,-4,1,9

// ls>>m to s >> total>=ls >> ls=total
//        1 to 0  >> -2    >> ls
// rs>> m+1 to e >> total>rs >> rs=total
// 	2 to 3 >> 10   >> rs
// cs >> -2+10>> 8


// divide
// 4, 5, 6
// -6,7,-3

// 4, 5
// -6,7

// ls>>-6, rs>>7, cs>>1

// backtrack:
// 4 to 6

// 4, 5, 6
// -6,7,-3

// ls>>m to s >> total>=ls >> ls=total
//        5 to 4 >> 1>>ls
// rs>> m+1 to e >> total>rs >> rs=total
// 	6		>> -3
// cs>> -2

// backtrack:
// 0 to 6

// ls>>m to s >> total>=ls >> ls=total
//        3  to 0  >> 10>> ls
// rs>> m+1 to e >> total>rs >> rs=total
//         4     to 6 >> 1>>rs

// cs>> 11

package Day7;

import java.util.Scanner;

public class subSum {
    public static int findMaxSubCluster(int[] arr, int start, int end){
        if(start == end)
        return arr[start];
        int mid = start+(end-start)/2;
        int leftSum = findMaxSubCluster(arr, start, mid);
        int rightSum = findMaxSubCluster(arr, mid+1, end);
        int crossSumValue = crossSum(arr, start, mid, end);
        return Math.max(Math.max(leftSum,rightSum), crossSumValue);
    }

    public static int crossSum(int[] arr, int start, int mid, int end){
        int leftSum = Integer.MIN_VALUE;
        int rightSum = Integer.MIN_VALUE;
        int totalSum = 0;
        for(int index = mid; index>=start; index--){
            totalSum+=arr[index];
            if(totalSum>leftSum){
                leftSum=totalSum;
            }
        }
        totalSum=0;
        for(int index = mid+1;index<=end;index++){
            totalSum+=arr[index];
            if(totalSum>rightSum){
                rightSum=totalSum;
            }
        }
        return leftSum+rightSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements of an array: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(findMaxSubCluster(arr, 0, size-1));
        sc.close();
    }
}
