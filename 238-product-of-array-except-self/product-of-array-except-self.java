class Solution {
    /*public int[] productExceptSelf(int[] nums) {
        int []ans=new int[nums.length];
        int sum=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                sum*=nums[i];
            }
            
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                ans[i]=sum;
            }
            else{
                ans[i]=sum/nums[i];
            }
            
        }
        return ans;
    }*/
    public int[] productExceptSelf(int[] nums) {
        int []pre=new int[nums.length];
        int []suf=new int[nums.length];
        int []res=new int[nums.length];
        pre[0]=1;
        suf[nums.length-1]=1;
        for(int i=1;i<nums.length;i++){
            pre[i]=pre[i-1]*nums[i-1];
        }
        for (int i=nums.length-2;i>=0;i--){
            suf[i]=suf[i+1]*nums[i+1];
        }
        for(int i=0;i<nums.length;i++){
            res[i]=pre[i]*suf[i];
        }
        return res;
    }
}