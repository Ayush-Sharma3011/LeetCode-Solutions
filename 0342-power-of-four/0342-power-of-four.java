class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0)return false;
        if(n==1)return true;
        for(int i=n;i!=4;){
            if(i%4==0){
                i=i/4;
            }
            else return false;

        }
        return true;
    }
}