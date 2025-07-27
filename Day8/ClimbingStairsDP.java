// Climbing stairs using dynamic programming
// eg:
// 5

// arr>> size = 6>> 0 to 5(always answer)

package Day8;

public class ClimbingStairsDP {
    public static int climb(int number){
        int[] arr = new int[number+1];
        if(number<=0)
        return 0;
        else if(number==1)
        return 1;
        else if(number==2)
        return 2;
        else{
            arr[0]=0;arr[1]=1;arr[2]=2;
            for(int index=3; index<arr.length;index++){
                arr[index] = arr[index-1]+arr[index-2];
            }
        }
        return arr[number];
    }
      public static void main(String[] args) {
        System.out.println(climb(5));
      }
}
