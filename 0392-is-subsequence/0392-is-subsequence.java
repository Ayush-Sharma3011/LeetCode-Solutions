class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0) return true;
        int j=0;
        for(int i=0;i<t.length();i++){
            if(j>=s.length()){
                break;
            }
            char tchar = t.charAt(i);
            char schar = s.charAt(j);
            if(schar==tchar && j<s.length()){
                j++;
                continue;
            }
        }
        if(j!=s.length()){
            return false;
        }
        return true;
    }
}