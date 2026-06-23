class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int[] result =  new int[n];
        int sum=nums[0];
        result[0]=nums[0];
        for(int i=1;i<n;i++){
            sum+=nums[i];
            result[i]=sum;
        }

        return result;
    }
}