class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int sell = Integer.MIN_VALUE;
        int profit = 0;
        int bind = 0;
        int sind = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
                bind = i;
                if (sind < bind) sind = bind;
                sell = prices[i];
            } 
            if (prices[i] > sell && i > bind) {
                sell = prices[i];
                int lprofit = sell - buy;
                profit = Math.max(profit,  lprofit);
                sind = i;
            }

        }
        return profit;
    }
}
