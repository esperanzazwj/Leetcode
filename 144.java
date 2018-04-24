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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root!=null) preorder(res,root);
        return res;
    }
    public void preorder(List<Integer> res, TreeNode root){
        res.add(root.val);
        if(root.left!=null) preorder(res,root.left);
        if(root.right!=null) preorder(res,root.right);
    }
}