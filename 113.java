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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        if(root!=null) helper(res,new ArrayList<>(),root,sum);
        return res;
    }
    public void helper( List<List<Integer>> res,List<Integer> tempList,TreeNode root, int sum ){
        if(root==null) return;
        tempList.add(root.val);
        if(root.left==null&&root.right==null&&root.val==sum) res.add(new ArrayList(tempList));
        else{
            helper(res,tempList,root.left,sum-root.val);
            helper(res,tempList,root.right,sum-root.val);
        }
        tempList.remove(tempList.size()-1);
    }
}