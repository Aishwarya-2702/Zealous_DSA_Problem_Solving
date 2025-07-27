// quick sort

package Day9;

import java.util.Arrays;

public class QuickSort {
    public static int sortAndFindPivotal(char[] arr, int start, int end){
        char pivotalData = arr[end];
        int init = start-1;

        for(int current = start; current<end; current++){
            if(arr[current]>=pivotalData){
                init++;
                char third = arr[current];
                arr[current] = arr[init];
                arr[init] = third;
            }
        }

        char third = arr[init+1];
        arr[init+1] = arr[end];
        arr[end] = third;

        return init+1;
    }
    //recursion for divide
    public static void sortbyQuick(char[] arr, int start, int end){
        if(start<end){
            int pivotalPoint = sortAndFindPivotal(arr, start, end);
            sortbyQuick(arr, start, pivotalPoint-1);
            sortbyQuick(arr, pivotalPoint+1, end);
        }
    }
    public static void main(String[] args) {
        char[] word = {'h','o', 'r', 's', 'e'};
        sortbyQuick(word, 0, word.length-1);
        System.out.println(Arrays.toString(word));
    }
}
