class Solution {
    public int maxProfit(int[] prices) {
        int minTillNow = prices[0];
        int maxProfit = Integer.MIN_VALUE;
        for(int current : prices){
            int profit = current - minTillNow;
            maxProfit = Math.max(maxProfit,profit);
            if(current < minTillNow){
                minTillNow = current;
            }
        }
        return maxProfit;
    }
}