// Rotating clock wise and anti clock wise

// example:
// [111, 222, 333, 4444, 666]
// 2
// clock:
// [4444, 666, 111, 222, 333]
// anticlock:
// [333, 4444, 666, 111, 222]

import java.util.Scanner;
import java.util.Arrays;

public class ClockAntiClock {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of an array: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        int[] anti = new int[size];
        int[] clock = new int[size];
        int rotIndex = 0;

        System.out.println("Enter the shift value: ");
        int shift = sc.nextInt();

        //clock
        for(int index = 0; index<size; index++){
            rotIndex = (index - shift + size)%size;
            anti[index] = arr[rotIndex];
        }
        System.out.println(Arrays.toString(anti));

        //anti clock
        for(int index = 0; index<size; index++){
            rotIndex = (index + shift + size)%size;
            clock[index] = arr[rotIndex];
        }
        System.out.println(Arrays.toString(clock));
        sc.close();
    }
}
