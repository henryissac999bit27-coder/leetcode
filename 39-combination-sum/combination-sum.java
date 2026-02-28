class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        comb(candidates,target,res,0,0,new ArrayList<>());
        return res;
    }
     void comb(int[] candidates, int target,List<List<Integer>> res,int idx,int total,List<Integer> comb){
        if(total==target){
            res.add(new ArrayList<>(comb));
            return;
        }
        if(total>target || idx>=candidates.length){
            return;
        }
        comb.add(candidates[idx]);
        comb(candidates,target,res,idx,total+candidates[idx],comb);
        comb.remove(comb.size()-1);
        comb(candidates,target,res,idx+1,total,comb);
    }
}