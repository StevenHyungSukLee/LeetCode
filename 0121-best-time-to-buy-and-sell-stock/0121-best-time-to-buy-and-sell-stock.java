class Solution {
    public int maxProfit(int[] prices) {
        int sell = 0;
        int buy = 0;
        int result = 0;
        
        for(int i = 1; i < prices.length; i++){
            
            if(prices[i] > prices[sell]){
                sell = i;
            }
            
            if(prices[i] < prices[buy]){
                buy = i;
                sell = buy;
            }
            
            if(sell > buy && (prices[sell] - prices[buy]) > result){
                result = prices[sell] - prices[buy];
            }
            

        }
        
        
        return result;
        
        
    }
}