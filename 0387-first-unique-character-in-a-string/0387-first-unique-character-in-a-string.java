class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[27];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            freq[ch-'a']++;
        }
        int result=-1;
        for(int i = 0; i<s.length();i++){
            char ch = s.charAt(i);
            if(freq[ch-'a']==1){
                result= i;
                break;
            }
        }
        return result;

    }
}