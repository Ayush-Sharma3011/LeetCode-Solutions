/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        int first = getHeight(root.left) + getHeight(root.right);
        int second = diameterOfBinaryTree(root.left);
        int third = diameterOfBinaryTree(root.right);

        return Math.max(first,Math.max(second,third));
    }
    public int getHeight(TreeNode root){
        if(root==null)return 0;

        int left =0;
        int right =0;
        if(root.left != null) left = getHeight(root.left);
        if(root.right != null) right = getHeight(root.right);

        return 1+ Math.max(left,right);
    }
}