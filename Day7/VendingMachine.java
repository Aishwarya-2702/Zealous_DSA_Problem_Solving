// You are working on a vending machine software that dispenses change. Given an unlimited supply of currencies of different denominations (e.g., 100, 200, 500 etc.), you need to write a program to determine the minimum number of currencies required to make a given amount x. The program should accept the amount x and the list of denominations as input and output the minimum number of coins needed.

// Input
// coins = [100, 200, 500]  , amount = 1100
// Output
// 3

// amount = 8700
// Output:
// 18

package Day7;

public class VendingMachine {
    public static int vender(int[] coins, int amt){
        if(amt==0)
        return 0;

        int min = Integer.MAX_VALUE;

        for(int rupee : coins){
            if(rupee<=amt){
                int result = vender(coins, amt - rupee);
            if(result!=min&&result+1<min){
                min = result+1;
            }
        }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] coins = {100, 200, 500};
        int amt = 1100;

        int result = vender(coins, amt);
        if(result == Integer.MAX_VALUE){
            System.out.println("No Amount");
        }
        else{
            System.out.println("Minimum currency needed: "+result);
        }
    }
}
