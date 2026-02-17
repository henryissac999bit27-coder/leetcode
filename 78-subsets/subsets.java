class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lst=new ArrayList<>();
        Arrays.sort(nums);
        back(lst,new ArrayList<>(),nums,0);
        return lst;
    }
    void back(List<List<Integer>> lst,List<Integer> new1,int[] nums,int st){
        lst.add(new ArrayList<>(new1));
        for(int i=st;i<nums.length;i++){
            new1.add(nums[i]);
            back(lst,new1,nums,i+1);
            new1.remove(new1.size()-1);
        }
    }
}