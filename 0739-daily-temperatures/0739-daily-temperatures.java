class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n= temp.length; 
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[n];
        for(int i= n-1;i>=0;i--){
            int curr = temp[i];
            while(!stack.isEmpty() && curr >= temp[stack.peek()]) stack.pop();
            if(stack.isEmpty()) ans[i]=0;
            else ans[i] = stack.peek() -i;
            stack.push(i);
        }
        return ans;
    }
}