/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> a=new ArrayList<>();
        findsum(ans,a,0,root,targetSum);
        return ans;
    }
    void findsum(List<List<Integer>> ans,List<Integer> a,int sum,TreeNode root, int targetSum){
        if(root==null){
            return;
        }
        sum+=root.val;
        a.add(root.val);
        if(root.left==null && root.right==null && sum==targetSum){
            ans.add(new ArrayList<>(a));
        }       
        findsum(ans,a,sum,root.left,targetSum);
        findsum(ans,a,sum,root.right,targetSum);
        a.remove(a.size()-1);
    }
}