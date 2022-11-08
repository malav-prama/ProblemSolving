import java.util.*;
public class PlusOne
{
   public static void main(String[] args)
   {
   
   int[] digits={1,2,3};
   System.out.println(Arrays.toString(plusOne(digits)));
   
   
   }
   public static int[] plusOne(int[] digits) {
      for (int i = digits.length - 1; i >=0; i--) {
         if (digits[i] != 9) {
            digits[i]++;
            break;
         } else {
            digits[i] = 0;
         }
      }
      if (digits[0] == 0) {
         int[] res = new int[digits.length+1];
         res[0] = 1;
         return res;
      }
      return digits;
   }
}
