//Consider you are going to inquire about top kth package from placement history of past year companies oggered. NOTE: USING QUICK SORT

// Example:
// Input: [14, 23, 7, 15,20]
// k=2
// Output:20

// k=1
// Output:23

// k=5
// Output:7

package Day10;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class QuickSelect {
    public static void main(String[] args) {
        Integer arr[] ={14, 23, 7, 15, 20};
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position: ");
        int index = sc.nextInt();

        if(index>0 && index<=arr.length){
            int value = arr[index-1];
            System.out.println(value);
        }
        else{
            System.out.println("Invalid Index");
        }
        sc.close();
    }
}
