public class MaxProfit
{
   public static void main(String[] args)
   {
   
      int[] prices={7, 1, 5, 3, 6, 4};
      System.out.print(maxProfit(prices));
   
   }

   public static int maxProfit(int[] prices)
   {
      int[] left=new int[prices.length];
      int[] right=new int[prices.length];
      left[0]=prices[0];
      int n=prices.length;
      right[n-1]=prices[n-1];
        
      for(int i=1;i<prices.length;i++)
      {
            
         left[i]=Math.min(left[i-1], prices[i]);
      }
        
      for(int i=n-2;i>=0;i--)
      {
            
         right[i]=Math.max(right[i+1], prices[i]);
      }
        
      int maxProfit=0;
      for(int i=0;i<n;i++)
      {
         maxProfit=Math.max(maxProfit, right[i] - left[i]);
      }
      return maxProfit;
   
   }
}