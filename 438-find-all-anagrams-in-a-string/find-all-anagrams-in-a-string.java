class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res=new ArrayList<>();
        char[] parr=p.toCharArray();
        Arrays.sort(parr);
        String p1=new String(parr);
        for(int i=0;i<s.length()-p.length()+1;i++){
            char[] arr=new char[p.length()];
            for(int j=0;j<p.length();j++){
                arr[j]=s.charAt(i+j);
            }
            Arrays.sort(arr);
            String s1=new String(arr);
            if(p1.equals(s1)) res.add(i);            
        }
        return res;
    }
}