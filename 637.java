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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res= new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null) return res;
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            double sum=0.0;
            for(int i=0;i<n;i++){
                TreeNode tmp=q.poll();
                sum+=tmp.val;
                if(tmp.left!=null) q.offer(tmp.left);
                if(tmp.right!=null) q.offer(tmp.right);
            }
            res.add(sum/n);
        }
        return res;
    }
}