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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root!=null)
            inorder(res,root);
        return res;
    }
    public void inorder(List<Integer> res, TreeNode root){
        if(root.left!=null) inorder(res,root.left);
        res.add(root.val);
        if(root.right!=null) inorder(res,root.right);
        
    }
}