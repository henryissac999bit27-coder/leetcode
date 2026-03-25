class Solution {
    public int firstMissingPositive(int[] nums) {
        int res=1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==res){
                res++;
            }
            else if(nums[i]>res){
                break;
            }
        }
        return res;
    }
}