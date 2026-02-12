class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            char[] a=s.toCharArray();
            Arrays.sort(a);
            String new1 =new String(a);
            if(!map.containsKey(new1)){
                map.put(new1, new ArrayList<>());
            }
            map.get(new1).add(s);
        }
        return new ArrayList<>(map.values());
    }
}