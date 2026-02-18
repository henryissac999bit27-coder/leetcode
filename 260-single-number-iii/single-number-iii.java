class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int[] ne=new int[2];
        int x=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if (entry.getValue()==1){
                ne[x++]=entry.getKey();
                if(x==2){
                    break;
                }
            }
        }
        return ne;
    }
}