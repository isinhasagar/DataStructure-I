/*You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Input: prices = [7,1,5,3,6,4]
Output: 5
*/

public class BestTimeToBuySellStock {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = 0;
        for(int i=0; i<prices.length; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
            else if(maxPrice < prices[i] - minPrice){
                maxPrice = prices[i] - minPrice;
            }
        }
        return maxPrice;
    }

    public static void main(String a[]){
        int[] prices = new int[] {7,1,5,3,6,4};
        System.out.println(BestTimeToBuySellStock.maxProfit(prices));
    }
}
