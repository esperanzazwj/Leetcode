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
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
        if(root.left==null&&root.right==null)
            return true;
        else return help(root.left,root.right);
    }
    public boolean help(TreeNode l,TreeNode r){
        if(l==null||r==null)
            return l==r;
        if(l.val!=r.val)
            return false;
        return help(l.left,r.right)&&help(l.right,r.left);
    }
}