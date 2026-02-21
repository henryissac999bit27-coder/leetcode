class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count1=0;
        for(int i=left;i<=right;i++){
            String a=Integer.toBinaryString(i);
            int count=0;
            for(char c:a.toCharArray()){
                if(c=='1') count++;
            }
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