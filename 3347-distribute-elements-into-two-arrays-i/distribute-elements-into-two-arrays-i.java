class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> a1=new ArrayList<>();
        ArrayList<Integer> a2=new ArrayList<>();
        
        a1.add(nums[0]);
        a2.add(nums[1]);
        int last1=nums[0];
        int last2=nums[1];
        for(int i=2;i<nums.length;i++){
            if(last1>last2){
                a1.add(nums[i]);
                last1=nums[i];
            }
            else{
                a2.add(nums[i]);
                last2=nums[i];
            }
        }
        a1.addAll(a2);
        for(int i=0;i<nums.length;i++){
            nums[i]=a1.get(i);
        }
        return nums;
    }
}