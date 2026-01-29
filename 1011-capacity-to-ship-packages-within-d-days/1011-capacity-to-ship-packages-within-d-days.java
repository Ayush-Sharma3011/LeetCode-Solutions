class Solution {
    
    public int shipWithinDays(int[] weights, int days) {
        int minCap = weights[0];
        int maxCap = 0;
        for(int weight : weights){
            minCap = Math.max(minCap,weight);
            maxCap += weight;
        }
        int totalweight= maxCap;
        while(minCap<=maxCap){
            int midCap = minCap+(maxCap-minCap)/2;
            int current = 0;
            int d = 1;
            for(int w : weights){
                if(current+w>midCap){
                    d++;
                    current = 0;
                }
                current += w;
            }
            if(d<=days){
                totalweight = midCap;
                maxCap = midCap -1;
            }else{
                minCap = midCap +1;
            }
        }
        return totalweight;
    }
}