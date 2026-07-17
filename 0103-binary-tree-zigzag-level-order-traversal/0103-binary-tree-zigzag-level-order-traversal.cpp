/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    vector<vector<int>> zigzagLevelOrder(TreeNode* root) {
        vector<vector<int>> ans;
        if(root==NULL) return ans;

        queue<TreeNode*>q;
        q.push(root);
        bool zigzag=true;
        while(!q.empty()){
            int s=q.size();
            vector<int> level;

            for(int i=0;i<s;i++){
                TreeNode* frontNode=q.front();
                q.pop();
                level.push_back(frontNode->val);
                if(frontNode->left) q.push(frontNode->left);
                if(frontNode->right) q.push(frontNode->right);
            }
            if(!zigzag){
                reverse(level.begin(), level.end());
            }
            ans.push_back(level);
            zigzag = !zigzag;
        }
        return ans;
    }
};