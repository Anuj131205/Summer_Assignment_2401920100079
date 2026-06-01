/*
Problem:
Given an array prices where prices[i] represents the stock price on the ith day,
find the maximum profit that can be achieved by buying on one day and selling on a later day.

Approach:
This solution keeps track of the minimum stock price encountered so far.

For each price:
1. Update the minimum price if a lower value is found.
2. Calculate the profit by selling at the current price.
3. Update the maximum profit if the current profit is greater.

This allows us to find the answer in a single traversal.

Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0;i<prices.length;i++){
            if(prices[i]< minPrice){
                minPrice = prices[i];
            }
            else{
                int Profit = prices[i] - minPrice;
                if(Profit > maxProfit){
                    maxProfit = Profit;
                }
            }
        }
        return maxProfit;
    }
}
