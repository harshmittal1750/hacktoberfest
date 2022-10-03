public int maxProfit(int[] prices) {
        int profit = 0;
        int price = prices[0];
        for(int i = 1; i < prices.length ; i++){
            if(prices[i] > price){
                profit = Math.max(profit,prices[i]-price);
            }else{
                price = prices[i];
            }
        }
        return profit;
    }