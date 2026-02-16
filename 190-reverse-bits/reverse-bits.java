class Solution {
    public int reverseBits(int n) {
        String s=Integer.toBinaryString(n);
        while(s.length()<32){
            s="0"+s;
        }
        StringBuilder s1=new StringBuilder(s);
        s1.reverse();
        String s2=new String(s1);
        int n1=Integer.parseUnsignedInt(s2,2);
        return n1;
    }
}