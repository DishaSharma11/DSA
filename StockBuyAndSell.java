public class Solution {
    public static int bestTimeToBuyAndSellStock(int []prices) {
        // Write your code here.
        int mini=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            int cost=prices[i]-mini;
            profit=Math.max(profit, cost);
            mini=Math.min(mini,prices[i]);
        }
        return profit;
    }
}
