class Solution {
    public int binaryGap(int n) {
        String bnr=Integer.toBinaryString(n);
        int last=-1;
        int dist=0;
        boolean prevo=false;
        for(int i=0;i<bnr.length();i++){
            if(bnr.charAt(i)=='1'){
                if(last!=-1){
                    dist=Math.max(dist,i-last);
                }
                last=i;
            }
        }
        return dist;
    }
}