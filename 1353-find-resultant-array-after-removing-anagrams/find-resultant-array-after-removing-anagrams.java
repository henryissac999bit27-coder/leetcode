class Solution {
    public List<String> removeAnagrams(String[] words) {
        int n=words.length;
        List<String> ans=new ArrayList<>();
        String prev="";
        for(String w:words){
            char[] a=w.toCharArray();
            Arrays.sort(a);
            String sor=new String(a);
            if(!sor.equals(prev)){
                ans.add(w);
                prev=sor;
            }
        }
        return ans;
    }
}