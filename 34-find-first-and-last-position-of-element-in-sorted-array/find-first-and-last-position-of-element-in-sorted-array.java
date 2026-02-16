class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] new1={-1,-1};
        new1[0]=find(nums,target,true);
        new1[1]=find(nums,target,false);
        return new1;
    }
    int find(int[] nums,int target,boolean f){
        int left=0;
        int right=nums.length-1;
        int idx=-1;
        while(left<=right){
            int mid =left+(right-left)/2;
            if(nums[mid]>target){
                right=mid-1;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
               idx=mid;
               if(f){
                right=mid-1;
               } 
               else{
                left=mid+1;
               }
            }
        }
        return idx;
    }
}