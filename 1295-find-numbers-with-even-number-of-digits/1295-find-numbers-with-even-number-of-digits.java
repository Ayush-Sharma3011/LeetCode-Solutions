class Solution {
    public int findNumbers(int[] nums) {
        int maxCount=0;
        for(int i=0;i<nums.length;i++){
            int count =0;
            while(nums[i]>0){
                int temp = nums[i]/10;
                nums[i]=temp;
                count++;
            }
            if(count%2==0){
                maxCount++;
            }
        }
        return maxCount;
    }
}