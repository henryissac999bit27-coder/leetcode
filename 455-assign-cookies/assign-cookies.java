class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int c=0,i=0,j=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(i<g.length && j<s.length){
            if(s[j]>=g[i]){
                c++;
                i++;
                j++;
            }
            else if(g[i]>s[j]){
                j++;
            }
            else{
                i++;
            }
        }
        return c;
    }
}