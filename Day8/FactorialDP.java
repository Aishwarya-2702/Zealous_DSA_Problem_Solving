// factorial via DP

package Day8;

public class FactorialDP {
    public static int factorial(int number){
        int[] arr = new int[number+1];
        if(number<=0)
        return 0;
        arr[0] = 1;
        for(int index=1;index<arr.length;index++){
            arr[index]=index*arr[index-1];
        }
        return arr[number];
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
