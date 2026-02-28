class Solution {
    public boolean canReach(int[] arr, int start) {
        int n = arr.length;
        int[] visited = new int[n];
        return helper(start, arr, n, visited);
    }

    boolean helper(int index, int[] arr, int n, int[] visited) {
        if (index < 0 || index >= n)
            return false;
        if (arr[index] == 0)
            return true;
        if (visited[index] != 0)
            return visited[index] == 1;
        visited[index] = 2;  
        boolean oneNext = helper(index + arr[index], arr, n, visited);
        boolean onePrev = helper(index - arr[index], arr, n, visited);
        boolean ans = oneNext || onePrev;
        if (ans)
            visited[index] = 1;

        return ans;
    }
}