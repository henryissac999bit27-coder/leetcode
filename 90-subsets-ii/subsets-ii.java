class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>lst=new ArrayList<>();
        List<Integer> new1=new ArrayList<>();
        Arrays.sort(nums);
        back(lst,new1,nums,0);
        return lst;
    }
    void back(List<List<Integer>> lst,List<Integer> new1,int[] nums,int st){
        if(!lst.contains(new1)){
            lst.add(new ArrayList<>(new1));
        }
        for (int i=st;i<nums.length;i++){
            new1.add(nums[i]);
            back(lst,new1,nums,i+1);
            new1.remove(new1.size()-1);
        }
    }
}