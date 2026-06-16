class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int []pre=new int[n+1];
        pre[0]=0;
        for(int i=1;i<=n;i++){
            pre[i]=pre[i-1]+nums[i-1];
        }
        int count=0,sum=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<=n;i++){
            if(hm.containsKey(pre[i]-k)){
                count+=hm.get(pre[i]-k);
            }
            hm.put(pre[i],hm.getOrDefault(pre[i],0)+1);
        }
        return count;
    }
}