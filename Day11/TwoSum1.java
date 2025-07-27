package Day11;

public class TwoSum1 {
    public static void pair(int[] arr, int target){
        int start=0, end=arr.length-1, sum=0;
        while(start<end){
            sum=arr[start]+arr[end];
            if(sum==target){
                System.out.println("["+(start+1)+","+(end+1)+"]");
                return;
            }
            else if(sum>target)
            end--;
            else
            start++;
        }
    }
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target = 9;
        pair(nums, target);
        nums = new int[] {2,7,11,15};
        target = 13;
        pair(nums, target);
        nums = new int[] {2,3,4};
        target = 6;
        pair(nums, target);
        nums = new int[] {-1,0};
        target = -1;
        pair(nums, target);
    }
}
