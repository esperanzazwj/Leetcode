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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null) return false;
        else if(root.left==null&&root.right==null) return root.val==sum;
        else return hasPathSum(root.right,sum-root.val)|| hasPathSum(root.left,sum-root.val);
    }
}