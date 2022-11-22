import java.util.*;
public class ValidPalindrome
{
   public static void main(String[] args)
   {
      String str="A man, a plan, a canal: Panama";
      System.out.print(isPalindrome(str));
   }

   public static boolean isPalindrome(String s)
   {
      int head=0;
      int tail=s.length()-1;
   
      while(head<tail)
      {
         char c1=s.charAt(head);
         char c2=s.charAt(tail);
      
         if(!Character.isLetterOrDigit(c1))
         {
            head++;
         }
         else if(!Character.isLetterOrDigit(c2))
         {
            tail--;
         }
         else
         {
            if(Character.toLowerCase(c1)!=Character.toLowerCase(c2))
            {
               return false;
            }
            head++;
            tail--;
         
         }
      
      }
     return true;
   }

}