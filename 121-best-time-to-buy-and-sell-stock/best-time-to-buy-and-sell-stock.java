class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int curr=prices[0];
        for(int i=0;i<prices.length;i++){
            if(curr>prices[i]){
                curr=prices[i];
            }
            else if(max<prices[i]-curr){
                max=prices[i]-curr;
            }
        }
        return max;
    }
}