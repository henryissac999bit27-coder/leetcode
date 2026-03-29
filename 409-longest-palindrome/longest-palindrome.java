class Solution {
    public int longestPalindrome(String s) {
        int oddcount=0;
        HashMap<Character,Integer> mp=new HashMap<>();
        for(char c:s.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
            if(mp.get(c)%2==1) oddcount++;
            else oddcount--;
        }
        if(oddcount>1) return s.length()-oddcount+1;
        return s.length();
    }
}