class Solution {
    public int minimumCost(int[] nums) {
        int fir=nums[0];
        Arrays.sort(nums,1,nums.length);
        return fir+nums[1]+nums[2];
    }
}