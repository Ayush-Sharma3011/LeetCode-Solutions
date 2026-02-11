class Solution {
public:
    vector<int> deckRevealedIncreasing(vector<int>& deck) {
        sort(deck.begin(),deck.end());
        queue<int>qe;
        int n = deck.size();
        vector<int>result(n);
        for(int i =0;i<n;i++){
            qe.push(i);
        }
        for(int e: deck){
            int i=qe.front();
            qe.pop();
            result[i] = e;
            if(!qe.empty()){
                qe.push(qe.front());
                qe.pop();
            }
        }
        return result;
    }
};