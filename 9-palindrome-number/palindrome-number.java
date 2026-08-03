class Solution {
    public boolean isPalindrome(int x) {
        int res=0;
        int x1=x;
        while(x>0){
            int rem=x%10;
            res=(res*10)+rem;
            x/=10;
        }
        return x1==res ?  true:false;
    }
}