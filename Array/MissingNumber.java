import java.util.*;

public class MissingNumber
{
   public static void main(String[] args)
   {
   
      int[] nums={0,1,3};
      System.out.print(find(nums));
   
   }

   public static int find(int[] nums)
   {
      int currentSum=0;
      int actualSum=0;
   
      for(int i=0;i<nums.length;i++)
      {
         currentSum+=nums[i];
         actualSum+=i+1;
      
      }
   
      return actualSum-currentSum;
   
   }


}