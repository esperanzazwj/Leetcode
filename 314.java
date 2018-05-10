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
        int[] range = new int[]{0,0};
        int col=0;
        getRange(root,range,0);
        for(int i=range[0];i<=range[1];i++){
            res.add(new LinkedList<>());
            if(i<0) col++;
        } 
        helper(res,root,col);
        return res;
    }
    public void helper(List<List<Integer>> res, TreeNode root,int col){
        if(root==null) return;
        res.get(col).add(root.val);
        helper(res,root.left,col-1);
        helper(res,root.right,col+1);//不能保证先左后右的顺序
    }
    public void getRange(TreeNode root,int[] range, int col){
        if (root == null) return;
        range[0] = Math.min(range[0], col);
        range[1] = Math.max(range[1], col);
        getRange(root.left, range, col - 1);
        getRange(root.right, range, col + 1);

    }
}