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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        helper(res,root,0);
        return res;
    }
    public void helper(List<List<Integer>> res,TreeNode root,int height){
        if(root==null) return;
        if(height>=res.size())
            res.add(new LinkedList<>());
        if(height%2==0)
            res.get(height).add(root.val);
        else
            res.get(height).add(0,root.val);
        helper(res,root.left,height+1);
        helper(res,root.right,height+1);
    }
}