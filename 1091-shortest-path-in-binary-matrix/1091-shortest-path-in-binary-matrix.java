import java.util.*;

class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        
        // If start or end is blocked
        if(grid[0][0] == 1 || grid[n-1][n-1] == 1)
            return -1;
        
        // 8 directions
        int[][] directions = {
            {-1,-1}, {-1,0}, {-1,1},
            {0,-1},          {0,1},
            {1,-1},  {1,0},  {1,1}
        };
        
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0,0});
        
        grid[0][0] = 1; // mark visited by changing value
        
        int pathLength = 1;
        
        while(!q.isEmpty()){
            int size = q.size();
            
            for(int i = 0; i < size; i++){
                int[] cell = q.poll();
                int row = cell[0];
                int col = cell[1];
                
                if(row == n-1 && col == n-1)
                    return pathLength;
                
                for(int[] dir : directions){
                    int newRow = row + dir[0];
                    int newCol = col + dir[1];
                    
                    if(newRow >= 0 && newRow < n &&
                       newCol >= 0 && newCol < n &&
                       grid[newRow][newCol] == 0){
                        
                        q.offer(new int[]{newRow, newCol});
                        grid[newRow][newCol] = 1; // mark visited
                    }
                }
            }
            
            pathLength++;
        }
        
        return -1;
    }
}