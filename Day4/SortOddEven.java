// Given an array arr[] of positive integers. Your task is to sort them so that the first part of the array contains odd numbers sorted in descending order, and the rest of the portion contains even numbers sorted in ascending order.

// Examples:
// Input: arr[] = [1, 2, 3, 5, 4, 7, 10]
// Output: [7, 5, 3, 1, 2, 4, 10]
// Explanation: 7 5 3 1 are odds in descending order and 2 4 10 are evens in ascending order.

// Input: arr[] = [0, 4, 5, 3, 7, 2, 1]
// Output: [7, 5, 3, 1, 0, 2, 4]
// Explanation: 7 5 3 1 are odds in descending order and 0 2 4 are evens in ascending order.

package Day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();

        int[] source = new int[size];

        System.out.println("Enter the elements of an array: ");
        for(int i=0;i<size;i++){
            source[i] = sc.nextInt();
        }

        //odd
        List<Integer> oddList = new ArrayList<>();
        //even
        List<Integer> evenList = new ArrayList<>();
        //split and save odd and even
        for(int each : source){
            if(each%2 != 0)
            oddList.add(each);
            else
            evenList.add(each);
        }
        //sort odd into reverse and even into ascending
        oddList.sort(Collections.reverseOrder());
        Collections.sort(evenList);
        //replace original with odd and even
        for(int index = 0; index < size; index++){
            if(index<oddList.size())
            source[index] = oddList.get(index);
            else
            source[index] = evenList.get(index-evenList.size()-1);
        }
        System.out.println(Arrays.toString(source));
        sc.close();
    }
}
