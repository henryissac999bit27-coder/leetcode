class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count1=0;
        for(int i=left;i<=right;i++){
            int count=Integer.bitCount(i);
            if(isprime(count)) count1++;
        }
        return count1;
    }
    boolean isprime(int n){
        if(n<=1) return false;
        for (int i = 2; i<=Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}