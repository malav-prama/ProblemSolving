import java.util.*;
public class MoveZeroes {

   public static void main(String[] args)
   {
      int[] nums={0, 1 , 5, 0, 12, 0, 9};
      moveZeroes(nums);
      System.out.println(Arrays.toString(nums));
   }

   public static void moveZeroes(int[] nums) {
      int insertPosition=0;
      for(int i=0; i< nums.length; i++)
      {
         if(nums[i]!=0)
         {
            nums[insertPosition]=nums[i];
            insertPosition++;
         }
      }
      while(insertPosition<nums.length)
      {
         nums[insertPosition++]=0;
      }
   }
}