class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        int[][] dp=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                dp[i][j]=-1;
            }
        }
        dp[0][0]=grid[0][0];
        return helper(m-1,n-1,dp,grid);
    }
    public int helper(int row, int col, int[][] dp, int[][] grid){
        if(row==0 && col==0) return grid[0][0];
        int left=Integer.MAX_VALUE;
        int top=Integer.MAX_VALUE;
        if(dp[row][col] != -1) return dp[row][col];
        if(col-1 >= 0)
            left=grid[row][col]+helper(row,col-1,dp,grid);
        if(row-1 >= 0) 
            top=grid[row][col]+helper(row-1,col,dp,grid);
        dp[row][col]=Math.min(left,top);
        return Math.min(left,top);
    }
}