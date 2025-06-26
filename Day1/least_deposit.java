//Problem Statement
//Consider the group of deposits done by bank today with numbers and manager wants to find out the least deposit. 
//so assist the manager by providing solution to identify the least deposit.

//Algorithm
//1.Take the number of tokens as input.
//2. Accept deposite amounts for each token
//3.Find and print the least deposit value

import java.util.Scanner;

public class least_deposit 
{
    public static void main(String[] args) 
    {

        //initialization
        int token = 0;  
        int cash = 0; 
        int least = Integer.MAX_VALUE; 

        //Get input from the user
        Scanner sc = new Scanner(System.in); 
        System.out.print("Tell us how many tokens are distributed for deposits: ");
        token = sc.nextInt(); 

        //repeat get deposits from specified tokens
        while(token>0) 
        { 
            System.out.println("Tell us the amount to be deposited ");
            cash = sc.nextInt(); 
            
            //To find the least deposit
            if(cash <= least)
            least = cash; 
            token--;
        }

        //print the least deposit
        System.out.println("Least deposited value is "+least);
        sc.close();
    }
}

// Time Complexity: 
// --> Input loop runs n times, where n = number of tokens
// --> big 'O' of n [O(n)]

//Space Complexity:
// --> Token, cash, least [3]