import java.util.*;

class Solution {
    public int trap(int[] height) {
        
        int n = height.length;
        int water = 0;
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0;i<n;i++){
            
            while(!stack.isEmpty() && height[i] > height[stack.peek()]){
                
                int bottom = stack.pop();
                
                if(stack.isEmpty()) break;
                
                int distance = i - stack.peek() - 1;
                
                int minHeight = Math.min(height[i], height[stack.peek()]) - height[bottom];
                
                water += distance * minHeight;
            }
            
            stack.push(i);
        }
        
        return water;
    }
}