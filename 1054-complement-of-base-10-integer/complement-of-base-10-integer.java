class Solution {
    public int bitwiseComplement(int n) {
        String s=Integer.toBinaryString(n);
        String s1="";
        for(char c:s.toCharArray()){
            if(c=='0'){
                s1=s1+"1";
            }
            else{
                s1=s1+"0";
            }
        }
        int i=Integer.parseInt(s1,2);
        return i;
    }
}