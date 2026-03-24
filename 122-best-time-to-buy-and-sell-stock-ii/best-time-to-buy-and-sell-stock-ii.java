class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int curr=prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]>curr) max+=prices[i]-curr;
            curr=prices[i];
        }
        return max;
    }
}