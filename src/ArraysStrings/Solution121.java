package ArraysStrings;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
public class Solution121 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buyPrice = prices[0];
        for (int i = 1; i < prices.length ; i++) {
            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            }
            else {
                maxProfit = Math.max(maxProfit, prices[i] - buyPrice);
            }
        }
        return maxProfit;
    }
}
// [5, 4, 9, 1, 8]
// buyPrice = 5,
