class Solution {
    public int maxProfit(int[] prices) {
        // Code here
        int minimum = prices[0];
        int profit = 0;
        for(int i =0; i<prices.length; i++){
            int cost = prices[i]-minimum;
            profit = Math.max(profit, cost);
            minimum = Math.min(prices[i], minimum);
        }
        return profit;
    }
}