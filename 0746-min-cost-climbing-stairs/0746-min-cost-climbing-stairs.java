class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;

        int prev = cost[0];
        int prev2 = cost[1];

        for(int i=2;i<n;i++){
            int temp = cost[i]+Math.min(prev,prev2);
            prev= prev2;
            prev2 = temp;
        }
        return Math.min(prev, prev2);
    }
}