class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> result_list = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            if(result_list.contains(nums1[i]))continue;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    result_list.add(nums1[i]);
                    break;
                }
            }
        }
        int[] result = new int[result_list.size()];
        for(int i=0;i<result.length;i++){
            result[i]=result_list.get(i);
        }
        return result;
    }
}