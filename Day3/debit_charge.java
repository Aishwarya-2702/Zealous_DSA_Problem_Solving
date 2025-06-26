// 1. Find and apply charges of 20 each extra debit more than 3 in last 10 transaction of your account which has credit and debit combination

// Example:
// Input:
// 900,1200,5600,120,450,670,100,10000,400,120
// Output:
// 900,1200,5600,120,450,670,100,10000,400,100

import java.util.Scanner;

public class debit_charge{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int currentBalance = 0;
        int oldBalance = 0;
        int debitCount = 0;

        for(int transaction=1; transaction<=10; transaction++){
            System.out.println("Enter the current balance: ");
            currentBalance = sc.nextInt();
            if(currentBalance<oldBalance){
                debitCount++;
            }
            oldBalance = currentBalance;
        }

        debitCount -= 3;
        if(debitCount>0){
            currentBalance -= (debitCount*20);
            System.out.println(debitCount*20+" has been deduced");
        }
        System.out.println("currentBalance: "+currentBalance);
        sc.close();
        }
    }