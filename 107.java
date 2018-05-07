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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        helper(res,root,0);
        return res;
    }
    public void helper(List<List<Integer>> res, TreeNode root, int height){
        if(root==null) return;
        if(height>=res.size())
            res.add(0,new LinkedList<>());
        helper(res,root.left,height+1);
        helper(res,root.right,height+1);
        res.get(res.size()-height-1).add(root.val);
    }
}