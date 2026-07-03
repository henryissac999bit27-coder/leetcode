class Solution {
    public String frequencySort(String s) {
        
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char c:s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        ArrayList<Character> arr=new ArrayList<>(hm.keySet());
        arr.sort((a,b)->hm.get(b)-hm.get(a));
        StringBuilder sb=new StringBuilder();
        for(char c:arr){
            int n=hm.get(c);
            while(n>0){
                sb.append(c);
                n--;
            }
        }
        return new String(sb);
    }
}