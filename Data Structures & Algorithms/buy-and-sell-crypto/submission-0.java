class Solution {
    public int maxProfit(int[] prices) {
        int profit = Integer.MIN_VALUE;
        int buy =Integer.MAX_VALUE;
        for(int num : prices){
                if( buy > num){
                    buy =num;
                }
                profit = Math.max(profit,(num -buy));
        }
        return profit;
    }
}
