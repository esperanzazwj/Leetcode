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
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if(root==null) return res; 
        int col=0;
        TreeNode tmp=root;
        while(tmp.left!=null){
            count++;
            tmp=tmp.left;
        }
        helper(res,root,count);
        return res;
    }
    public void helper(List<List<Integer>> res, TreeNode root, int col){
        
    }
}