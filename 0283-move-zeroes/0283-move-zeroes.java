class Solution {
    public void moveZeroes(int[] nums) {
        int x=0;
        int y=0;

        while(x<nums.length && y<nums.length){
            if (nums.length==1)break;
            if(nums[x]!=0){x++;y++;}

            else{
                while(nums[y]==0 && y+1<nums.length){
                    y++;
                }
                nums[x]=nums[y];
                nums[y]=0;
                x++;
            }
        }
    }
}