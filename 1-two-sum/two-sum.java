class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0,j=1;
        int []res=new int[2];
        while(i<nums.length){
            if(nums[i]+nums[j]==target){
                res[0]=i;
                res[1]=j;
                break;
            }
            j++;
            if(j==nums.length){
                i++;
                j=i+1;
            }
            if(i>=nums.length-1) break;
        }
        return res;
    }
}