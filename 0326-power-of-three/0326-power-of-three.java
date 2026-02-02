class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0)return false;
        if((n & n-1)== n-1)return true;
        else return false;
    }
}