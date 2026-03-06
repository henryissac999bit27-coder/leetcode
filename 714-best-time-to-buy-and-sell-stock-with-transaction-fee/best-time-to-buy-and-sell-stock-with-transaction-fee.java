class Solution {
    public int maxProfit(int[] prices, int fee) {
        int max=0;
        int curr=prices[0]+fee;
        for(int i=1;i<prices.length;i++){
            if(prices[i]+fee<curr){
                curr=prices[i]+fee;
            }
            else if(prices[i]>curr){
                max+=prices[i]-curr;
                curr=prices[i];
            }
            
        }
        return max;
    }
}