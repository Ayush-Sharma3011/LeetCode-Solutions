import java.util.*;
class Solution 
{
    class Pair
    {
        int row, column, distance;
        Pair(int row, int column, int distance)
        {
            this.row = row;
            this.column = column;
            this.distance = distance;
        }
    }

    public int[][] updateMatrix(int[][] mat) 
    {
        int m = mat.length;
        int n = mat[0].length;
        int ans[][] = new int[m][n];
        int visited[][] = new int[m][n];

        Queue<Pair> queue = new LinkedList<>();
        for(int x=0; x<m; x++)
        {
            for(int y = 0; y<n; y++)
            {
                if(mat[x][y]==0)
                {
                    queue.offer(new Pair(x,y,0));
                    visited[x][y] = 1;
                }
            }
        }

        while(!queue.isEmpty())
        {
            int row = queue.peek().row;
            int col = queue.peek().column;
            int dist = queue.peek().distance;

            queue.remove();

            int delRow[] = {-1,0,+1,0};
            int delCol[] = {0,+1,0,-1};

            for(int x=0; x<4; x++)
            {
                int newRow = row + delRow[x];
                int newCol = col + delCol[x];

                if(newRow>=0 && newRow<m  &&  newCol>=0 && newCol<n  &&  visited[newRow][newCol]==0)
                {
                    ans[newRow][newCol] = dist + 1;
                    visited[newRow][newCol] = 1;
                    queue.offer(new Pair(newRow, newCol, dist+1));
                }
            }
        }

        return ans;
    }

}