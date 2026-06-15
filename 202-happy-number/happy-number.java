class Solution {
    public boolean isHappy(int n) {
        int slow=getnext(n);
        int fast=getnext(getnext(n));

        while(slow!=fast){
            if (fast==1) return true;
            slow=getnext(slow);
            fast=getnext(getnext(fast));
        }
        return slow==1;
    }

    public int getnext(int n){
        int curr=0;
        while(n>0){
            int rem=n%10;
            curr+=rem*rem;
            n=n/10;
        }
        return curr;
    }
}