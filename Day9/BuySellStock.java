// Given an array of stock prices where each element represents the stock price on a specific day, write a function to find the best days to buy and sell the stock such that you achieve the maximum profit. You can only buy and sell the stock once.
// 45, 12, 3, 10, 50
// Best time to buy 3 best time to sell 50

// -10, -5, -2, -1, 1
// Best time to buy -10 best time to sell 1

// 90, 40, 20, 10, 4
// Best time to buy 10 best time to sell 4

package Day9;

public class BuySellStock {
    public static int maxProfit(int[] prices){
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++){
            for(int j=i+1; j<prices.length; j++){
                int profit = prices[j] - prices[i];
                if (profit>maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {90, 40, 20, 10, 4};
        // int[] prices = {-10, -5, -2, -1, 1};
        // int[] prices = {45, 12, 3, 10, 50};
        int Profit = maxProfit(prices);
        System.out.println(Profit);
    }
}
