class Solution {
    public int maxSubArray(int[] nums) {
        int count = nums[0];
        int maxcount=nums[0];
        for(int i=1;i<nums.length;i++){
            count=Math.max(count+nums[i],nums[i]);
            maxcount=Math.max(count,maxcount);
        }
        return maxcount;
    }
}