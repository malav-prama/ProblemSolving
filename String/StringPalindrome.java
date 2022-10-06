public class StringPalindrome
{
   public static void main(String[] args)
   {
   
      String palindrome="abccba";
      System.out.println(isPalindrome(palindrome));
   
   }

   public static boolean isPalindrome(String original)
   {
   
      String reverse="";
   
      for(int i=original.length()-1;i>=0;i--)
      {
         reverse=reverse + original.charAt(i);
      
      }
   
      if(original.equals(reverse))
      {
         return true;
      }
      else 
         return false;
   
   }

}