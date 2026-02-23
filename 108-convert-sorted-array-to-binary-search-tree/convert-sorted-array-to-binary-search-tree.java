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
    public TreeNode sortedArrayToBST(int[] nums) {
        return sorted(nums,0,nums.length-1);
        
    }
    TreeNode sorted(int[] nums,int st,int end){
            if(st>end){
                return null;
            }
            int mid=st+(end-st)/2;
            TreeNode node=new TreeNode(nums[mid]);
            node.left=sorted(nums,st,mid-1);
            node.right=sorted(nums,mid+1,end);
            return node;
        }
}