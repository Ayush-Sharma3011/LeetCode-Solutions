class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp =new ArrayList<>();
        helper(0,nums,nums.length,temp,ans);
        return ans;
    }
    public void helper(int index,int[] nums , int n, List<Integer> list , List<List<Integer>> ans ){
        //base case
        if(index==n){
            ans.add(new ArrayList<>(list));
            return ;
        }
        // core logic
        list.add(nums[index]);
        helper(index+1,nums,n,list,ans);
        list.remove(list.size()-1);
        helper(index+1,nums,n,list,ans);
        // next call
    }
}