// Merge Sort

import java.util.Scanner;
import java.util.Arrays;

public class MergeSort{
    public static void merge(int[] arr, int start, int mid, int end){
        int lengthLeft = mid-start+1;
        int lengthRight= end-mid;

        int[] gotLeft=new int[lengthLeft];
        int[] gotRight=new int[lengthRight];

        for(int indexLeft = 0; indexLeft<lengthLeft; indexLeft++){
            gotLeft[indexLeft]=arr[start+indexLeft];
        }

        for(int indexRight = 0; indexRight<lengthRight; indexRight++){
            gotRight[indexRight]=arr[mid+1+indexRight];
        }

        //compare gotLeft and gotRight and store into original
        int indexLeft=0, indexRight=0, indexOrigin=start;

        while(indexLeft<lengthLeft&&indexRight<lengthRight){
            if(gotLeft[indexLeft]<gotRight[indexRight]){
                arr[indexOrigin]=gotRight[indexRight];
                indexRight++;
            }
            else{
                arr[indexOrigin]=gotLeft[indexLeft];
                indexLeft++;
            }
            indexOrigin++;
        }

        while(indexLeft<lengthLeft){
            arr[indexOrigin]=gotLeft[indexLeft];
            indexLeft++;
            indexOrigin++;
        }

        while(indexRight<lengthRight){
            arr[indexOrigin]=gotRight[indexRight];
            indexRight++;
            indexOrigin++;
        }
    }
    
    public static void sortByDivide(int[] arr, int start, int end){
        if(start<end){
            int mid = start+(end-start)/2;
            sortByDivide(arr, start, mid);
            sortByDivide(arr, mid+1, end);
            merge(arr, start, mid, end);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of an array: ");
        for(int i =0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        sortByDivide(arr, 0, size-1);
        System.out.println(Arrays.toString(arr));
    }
}