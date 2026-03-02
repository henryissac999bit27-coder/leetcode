class Solution {
    public boolean canAliceWin(int n) {
        int x=10;
        int move=0;
        while(n>=x){
            n=n-x;
            x--;
            move++;
        }
        return move%2!=0 ? true:false;
    }
}