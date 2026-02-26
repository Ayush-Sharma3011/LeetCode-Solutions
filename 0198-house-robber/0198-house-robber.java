class Solution {
    public int rob(int[] nums) {
        // base case
        int n = nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]= nums[0];

        return helper(n-1,nums,dp);
    }
    public int helper(int i,int[] nums,int[] dp){
        if(i ==0) return nums[0];
        if(i==-1)return 0;
        int dontRob = helper(i-1,nums,dp);
        int rob = nums[i] + helper(i-2,nums,dp);
        dp[i] = Math.max(dontRob,rob);
        return dp[i];
    }
}