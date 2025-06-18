//Problem Statement
// In the given list contains the 10 tax payers of financial year 2024-2025, among the auditor wants to find the first and second highest tax payer. 
// so find the solution to support the auditor.

// Algorithm
// 1. Accept 10 income entries
// 2. compares the values during input
// 3. Determines and displays the top two highest incomes.

import java.util.Scanner;

public class max_payers
{
    public static void main(String[] args) 
    {
        //initialization
        double income = 0.0;
        double firstMax = Integer.MIN_VALUE;
        double secondMax = Integer.MIN_VALUE;

        //get input from the user
        Scanner sc = new Scanner(System.in);

        for(int payers = 1; payers<=10; payers++)
        {
            System.out.println("Tell us the income");
            income = sc.nextDouble();
            if(firstMax<=income){
                secondMax = firstMax;
                firstMax = income;
            }
            else if(secondMax <= income && income == firstMax){
                secondMax = income;
            }
        }

        //print the highest two tax payers
        System.out.println("Highest tax payers are "+firstMax+ " and "+secondMax);
    }
}

// Time Complexity
// --> O(n)

// Space Complexity
// --> 4