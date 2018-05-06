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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        helper(res,root,0);
        return res;
    }
    public void helper(List<List<Integer>> res, TreeNode root, int height){
        if(root==null) return;
        if(res.size()<=height)
            res.add(new LinkedList<>());
        res.get(height).add(root.val);
        helper(res,root.left,height+1);
        helper(res,root.right,height+1);
    }
}