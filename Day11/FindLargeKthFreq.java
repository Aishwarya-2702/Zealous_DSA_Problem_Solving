package Day11;

import java.util.HashMap;
import java.util.Map;

public class FindLargeKthFreq {
    public static void find(int[] arr, int kth){
        Map<Integer, Integer> freq = new HashMap<>();
        for(int each:arr){
            freq.put(each, freq.getOrDefault(each, 0)+1);
        }
        freq.entrySet().stream().sorted(
            (a,b)->b.getValue().compareTo(a.getValue())
            ).limit(kth)
            .forEach(entry->System.out.print(entry.getKey()+" "));
        System.out.println();
    }
    public static void main(String[] args) {
        int[] nums = {8,8,7,7,7,10,10,10,10,9,9,9};int kth = 3;
        find(nums, kth);
        nums = new int[] {4,4,4,6,6,6,6,3,3,3,3,3};kth = 2;
        find(nums, kth);
        nums = new int[] {1};kth = 1;
        find(nums, kth);
        nums = new int[] {5,5,6,7,7,7,8,8,8,8,9};kth = 4;
        find(nums, kth);
    }
}
