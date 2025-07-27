package Day11;

public class TwoSum {
    public static void main(String[] args) {
        int arr[]={2,7,11,13};
        int target = 9;
        
        Boolean found = false;

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("index"+i+" and"+j);
                    found=true;
                    break;
                }
            }
            if(found){
            break;
           }
        }
        if(!found){
            System.out.println("No index");
        }
}
}
