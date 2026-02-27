class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
        int n = triangle.get(m - 1).size();
        Integer[][] dp = new Integer[m][n];
        // for (int i = 0; i < m; i++) {
        //     for (int j = 0; j <= i; j++) {
        //         dp[i][j] = -1;
        //     }
        // }
        return helper(0, 0, triangle, dp, m);
    }

    public int helper(int row, int col, List<List<Integer>> triangle, Integer[][] dp, int m) {
        if (row == m - 1)
            return triangle.get(row).get(col);
        if (dp[row][col] != null)
            return dp[row][col];
        int curr = triangle.get(row).get(col);
        int bottom = curr + helper(row + 1, col, triangle, dp, m);
        int bottomRight = curr + helper(row + 1, col + 1, triangle, dp, m);
        dp[row][col] = Math.min(bottom, bottomRight);
        return dp[row][col];
    }
}