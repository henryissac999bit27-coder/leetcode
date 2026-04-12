class Solution {
    public int jump(int[] nums) {
        int jump=0,curr=0,max=0;
        for(int i=0;i<nums.length-1;i++){
            max=Math.max(max,i+nums[i]);
            if(curr==i){
                jump++;
                curr=max;
            }
            if(curr>nums.length-1) break;
        }
        return jump;
    }
}