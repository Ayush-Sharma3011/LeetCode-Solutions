class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(0,nums, nums.length,ans);
        return ans;
    }
    public void helper(int index,int[] nums,int n,List<List<Integer>> ans){
        // base case
        if(index== n){
            List<Integer> list =new ArrayList<>();
            for(int element:nums){
                list.add(element);
            }
            ans.add(list);
            return ;
        }


        // logic
        for(int i = index;i<n;i++){
            swap(nums,index,i);
            helper(index +1, nums,n,ans);
            swap(nums,index,i);
        }
    }
    public void swap(int[] array , int start, int end){
        int temp = array[start];
        array[start] = array[end];
        array[end]= temp;
    }
}