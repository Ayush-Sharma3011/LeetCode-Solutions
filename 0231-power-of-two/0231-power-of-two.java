class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0) return false;
        if(n==1) return true;
        for(int i=n;i!=2;){
            if(i%2==0){
                i/=2;
            }
            else{
                return false;
            }
        }
        return true;
    }
}