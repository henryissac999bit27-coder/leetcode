class Solution {
    public boolean checkStrings(String s1, String s2) {
        StringBuilder ee1=new StringBuilder();
        StringBuilder ee2=new StringBuilder();
        StringBuilder oo1=new StringBuilder();
        StringBuilder oo2=new StringBuilder();

        for(int i=0;i<s1.length();i++){
            if(i%2==0){
                ee1.append(s1.charAt(i));
                ee2.append(s2.charAt(i));
            }
            else{
                oo1.append(s1.charAt(i));
                oo2.append(s2.charAt(i));
            }
        }
        char[] e1=ee1.toString().toCharArray();
        char[] e2=ee2.toString().toCharArray();
        char[] o1=oo1.toString().toCharArray();
        char[] o2=oo2.toString().toCharArray();
        Arrays.sort(e1);
        Arrays.sort(e2);
        Arrays.sort(o1);
        Arrays.sort(o2);
        return Arrays.equals(e1,e2) && Arrays.equals(o1,o2);
    }
}