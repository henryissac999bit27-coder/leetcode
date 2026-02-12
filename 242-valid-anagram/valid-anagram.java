class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1=s.toCharArray();
        char[] s2=t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        String ss=new String(s1);
        String ss1=new String(s2);
        if(ss.equals(ss1)){
            return true;
        }
        return false;
    }
}