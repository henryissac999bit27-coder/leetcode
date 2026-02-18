class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> new1=new ArrayList<>();
        fun(list,new1,n,k,1);
        return list;
    }
    void fun(List<List<Integer>> list,List<Integer> new1,int n, int k,int idx){
        if(new1.size()==k){
            list.add(new ArrayList<>(new1));
            return;
        }
        for(int i=idx;i<=n;i++){
            new1.add(i);
            fun(list,new1,n,k,i+1);
            new1.remove(new1.size()-1);
        }
    }
}