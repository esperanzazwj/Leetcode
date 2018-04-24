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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root!=null) postorder(res,root);
        return res;
    }
    public void postorder(List<Integer> res, TreeNode root){
        if(root.left!=null) postorder(res,root.left);
        if(root.right!=null) postorder(res,root.right);
        res.add(root.val);
    }
}