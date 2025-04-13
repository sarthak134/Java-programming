public class stocksBuySelling {

  public static int buyAndSellStockes(int prices[]) {
    int buyPrice = Integer.MAX_VALUE;
    int maxProfit = 0;

    for (int i = 0; i < prices.length; i++) {
      if (prices[i] > buyPrice) {
        int price = prices[i] - buyPrice;
        maxProfit = Math.max(maxProfit, price);

      } else {
        buyPrice = prices[i];
      }
    }
    return maxProfit;
  }

  public static void main(String[] args) {
    int[] prices = { 7, 1, 5, 3, 6, 4 };
    System.out.println("Max Profit is " + buyAndSellStockes(prices));
  }

}
