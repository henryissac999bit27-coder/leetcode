class Solution {
    public int maxNumberOfBalloons(String text) {
        int []counts=new int[26];
        for(char c:text.toCharArray()){
            counts[c-'a']++;
        }
        int bcount=counts['b'-'a'];
        int acount=counts['a'-'a'];
        int lcount=counts['l'-'a'];
        int ocount=counts['o'-'a'];
        int ncount=counts['n'-'a'];
        lcount/=2;
        ocount/=2;
        return Math.min(bcount,Math.min(acount,Math.min(lcount, Math.min(ocount, ncount))));
    }
}