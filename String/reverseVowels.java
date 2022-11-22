import java.util.*;
public class ReverseVowels {

   public static void main(String[] args)
   {
      System.out.print(reverseVowels("fleetwood"));
   }
    
   public static String reverseVowels(String s) {
   
      List<Character> vowels=Arrays.asList('a','e','i','o','u','A','E','I','O','U');
      Stack<Character> st=new Stack<>();
      for(char c:s.toCharArray())
      {
         if(vowels.contains(c))
         {
            st.push(c);
         }
      } 
   
      StringBuilder result=new StringBuilder();
      for(char c:s.toCharArray())
      {
         if(vowels.contains(c))
         {
            result.append(st.pop());
         }
         else{
            result.append(c);
         }
      }
   
   return result.toString();
        
   }

   
}