// 1. In the super market end of each day finding the raised bills to customer with invoice number, now find the missing invoice of the day.

// Example:
// Input:
// 8,10,3,1,4,2,5
// Output:
// 6

// Input:
// 45,91,90,92,46
// Output:
// 47

// Input:
// 0,1,2,4,5,6,7
// Output:
// 3

import java.util.Scanner;

public class missing_number{
    public static boolean isMatched(int[] arr, int temp){
        for(int num : arr){
            if(temp==num)
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();

        int[] invoices = new int[size];

        System.out.println("Enter the elements of an array: ");
        for(int i = 0; i < size; i++){
            invoices[i] = sc.nextInt();
        }

        int missing = invoices[0];

        for(int each : invoices){
            if(missing>=each)
            missing=each;
        }

        while(true){
            int temp = missing+1;
            if(isMatched(invoices, temp)){
                missing = temp;
            }
            else{
                System.out.println("The missing number is: ");
                System.out.println(temp);
                break;
            }
        }
    }
}

