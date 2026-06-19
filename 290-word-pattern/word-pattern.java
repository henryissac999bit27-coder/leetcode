class Solution {
    public boolean wordPattern(String pattern, String s1) {
        HashMap<Character,String> hm=new HashMap<>();
        String[] s=s1.trim().split("\\s+");
        if(s.length!=pattern.length()){
            return false;
        }
        ArrayList<String> seen=new ArrayList<>();
        for(int i=0;i<pattern.length();i++)
        {
            if(hm.get(pattern.charAt(i))==null && !seen.contains(s[i])){
                seen.add(s[i]);
                hm.put(pattern.charAt(i),s[i]);
            }
            else{
                if(hm.get(pattern.charAt(i))==null || !hm.get(pattern.charAt(i)).equals(s[i])){
                    return false;
                }
            }
        }
        return true;
    }
}