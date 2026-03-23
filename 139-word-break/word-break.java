/*class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        String str[]=wordDict.toArray(new String[0]);
        return breakword(0,s,str);
    }
    boolean breakword(int i,String s,String[] str){
        if(i==s.length()){
            return true;
        }
        String prefix="";
        for (int j=i;j<s.length();j++){
            prefix+=s.charAt(j);
            if(Arrays.asList(str).contains(prefix) && breakword(j+1,s,str)){
                return true;
            }
        }
        return false;
    }
}*/
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for (int i = 1; i <= s.length(); i++) {
            for (String w : wordDict) {
                int start = i - w.length();
                if (start >= 0 && dp[start] && s.substring(start, i).equals(w)) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];        
    }
}
