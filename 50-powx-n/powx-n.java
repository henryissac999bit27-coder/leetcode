class Solution {
    public double myPow(double x, int n) {
        long N=n;
        if(N<0){
            x=1/x;
            N=-N;
        }
        double res=1;
        double curr=x;
        while(N!=0){
            if(N%2==1){
                res*=curr;
            }
            curr*=curr;
            N/=2;
        }
        return res;
    }
}