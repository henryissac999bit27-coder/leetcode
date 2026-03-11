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
    public List<List<Integer>> levelOrder(TreeNode root) {
       List<List<Integer>> ans=new ArrayList<>();
       travel(root,0,ans);
       return ans; 
    }
    void travel(TreeNode root,int l,List<List<Integer>> ans){
        if(root==null) return;
        if(l==ans.size())  ans.add(new ArrayList<>());
        ans.get(l).add(root.val);
        travel(root.left,l+1,ans);
        travel(root.right,l+1,ans);
    }
}