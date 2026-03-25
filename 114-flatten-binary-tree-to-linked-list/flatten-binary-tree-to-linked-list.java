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
    public void flatten(TreeNode root) {
        if (root==null) return;
        List<TreeNode> li=new ArrayList<>();
        preorder(root,li); 
        for(int i=0;i<li.size()-1;i++){
            li.get(i).left=null;
            li.get(i).right=li.get(i+1);
        }     
    }
    void preorder(TreeNode root,List<TreeNode> li){
        if(root==null) return;
        li.add(root);
        preorder(root.left,li);
        preorder(root.right,li);
    }
}