class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        if (n == 0) return 0; 

        int min = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < n; i++) {
            
            if (prices[i] < min) {
                min = prices[i];
            } else {
               
                maxProfit = Math.max(maxProfit, prices[i] - min);
            }
        }
        return maxProfit; 
    }
}
