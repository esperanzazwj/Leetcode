/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        else return helper(root);
    }
    public int helper(TreeNode root){
        if(root.left==null&&root.right==null)
            return 1;
        else if(root.left==null)
            return 1+helper(root.right);
        else if(root.right==null)
            return 1+helper(root.left);
        else return 1+Math.min(helper(root.left),helper(root.right));
    }
}