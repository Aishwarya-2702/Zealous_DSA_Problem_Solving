// Sliding Window Maximum
// Heart Rate Monitoring in Healthcare:
// A wearable health device monitors a user's heart rate during exercise. To provide health insights, the device must track the highest heart rate over every 1-minute interval.
// Problem Statement: Given an array heartRates[] and an integer k, find the maximum heart rate for each sliding window of size k.
// Input1:
// heartRates = [72, 80, 75, 90, 85, 92, 88]
// k = 3
// Output1:
// Maximum heart rates for each sliding window:
// [80, 90, 90, 92, 92]

// heartRates = [70, 85, 60, 95, 82, 74, 90]
// k = 2
// Maximum heart rates for each sliding window:
// [85, 85, 95, 95, 82, 90]
// Window [70, 85] → max = 85
// Window [85, 60] → max = 85
// Window [60, 95] → max = 95
// Window [95, 82] → max = 95
// Window [82, 74] → max = 82
// Window [74, 90] → max = 90

package Day11;

import java.util.ArrayList;
import java.util.List;

public class MaxSlidingWindow {
    public static List<Integer> findSubSum(int[] arr, int window){
        List<Integer> foundElements = new ArrayList<>();
        int maxSum = 0;
        int currentSum = 0;

        // initializing elements with first window size from array
        for(int index = 0; index<window; index++){
            currentSum += arr[index];
        }
        maxSum = currentSum;
        int index, start=0;
        for(index = window; index<arr.length;index++){
            currentSum += arr[index] - arr[index-window];
            // System.out.println(currentSum);
            if(currentSum>=maxSum){
                maxSum = currentSum;
                start = index- window+1;
            }
        }
        System.out.println("Max Sum "+maxSum);
        
        for(index = 0;index<window;index++){
            foundElements.add(arr[start+index]);
        }

        return foundElements;
    }
    public static void main(String[] args) {
        int[] transactions = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int windowSize = 3;
        System.out.println(findSubSum(transactions, windowSize));
    }
}
