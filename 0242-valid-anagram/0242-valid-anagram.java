class Solution {
    public boolean isAnagram(String s, String t) {
        int [] freq = new int[27];

        for(int i=0;i<s.length();i++){
            char current = s.charAt(i);
            int index= current -'a' +1;
            freq[index]++;
        }

        for(int i=0;i<t.length();i++){
            char current = t.charAt(i);
            int index= current -'a' +1;
            freq[index]--;
        }

        for(int count : freq){
            if(count != 0) return false;
        }
        return true;
    }
}