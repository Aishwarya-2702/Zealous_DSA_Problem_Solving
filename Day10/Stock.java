// Given an array of stock prices where each element represents the stock price on a specific day, write a function to find the best days to buy and sell the stock such that you achieve the maximum profit. You can only buy and sell the stock once.
// 45, 12, 3, 10, 50
// Best time to buy 3 best time to sell 50

// -10, -5, -2, -1, 1
// Best time to buy -10 best time to sell 1

// 90, 40, 20, 10, 4
// Best time to buy 10 best time to sell 4

package Day10;

public class Stock {
    public static void bestTimeToBuyAndSell(int[] arr){
        if(arr.length<2){
            System.out.println("Invalid stock history");
        }
        else{
            //initial solution parameters
            int currentBuy=arr[0];
            int currentSell=arr[1];

            int maxProfit = currentSell - currentBuy;

            //initial solution
            int currentProfit = Integer.MIN_VALUE;

            for(int index=1; index<arr.length;index++){
                currentProfit=arr[index]-currentBuy;

                if(currentProfit>maxProfit){
                    maxProfit=currentProfit;
                    currentSell=arr[index];
                }
                //90>40, 40>20, 20>10, 10>4
                if(currentBuy>arr[index]){
                    currentBuy=arr[index];
                }
            }
            //(10),4
            System.out.println("Best time to buy "+(currentSell-maxProfit)
            +" best time to sell "+currentSell);
        }
    }
    public static void main(String[] args) {
        int[] arr = {-10, -5, -2, -1, 1};
        bestTimeToBuyAndSell(arr);
    }
}
