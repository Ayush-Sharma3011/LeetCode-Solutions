class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp= new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                dp[i][j] = -1;
            }
        }
        dp[0][0]=1;
        return helper(m-1,n-1,dp);
    }
    public int helper(int row,int col,int[][] dp){
        if(row== 0 && col == 0)return 1;
        int left =0;
        int top=0;
        if(dp[row][col] != -1) return dp[row][col];
        if(col-1>= 0)left = helper(row,col-1,dp);
        if(row -1>= 0) top = helper(row-1,col,dp);
        dp[row][col] = top+left;
        return top +left;
    }
}