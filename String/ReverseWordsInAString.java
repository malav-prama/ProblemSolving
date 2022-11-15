public class ReverseWordsInAString
{
   public static void main(String[] args)
   {
      String str="The sky is blue";
   
      System.out.print(reverseString(str));
   }

   public static String reverseString(String s)
   {
   String[] words = s.trim().split(" ");
        StringBuilder result = new StringBuilder();
        for (int i=words.length-1; i>=0; i--) {
            if (!words[i].isEmpty())
                result.append(words[i]).append(" ");
        }
        return result.toString().trim();   
   }
}