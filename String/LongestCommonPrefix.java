import java.util.*;
public class LongestCommonPrefix
{
   public static void main(String[] args)
   {
      String[] strs={"clap", "club", "clove"};
      System.out.print(lcp(strs));
   
   }

   public static String lcp(String[] strs)
   {
      StringBuilder result=new StringBuilder();
      Arrays.sort(strs);
   
      char[] first=strs[0].toCharArray();
      char[] last=strs[strs.length-1].toCharArray();
   
      for(int i=0; i<first.length; i++)
      {
         if(first[i]!=last[i])
         {
            break;
         }
         result.append(first[i]);
      }
   
      return result.toString();
   
   }

}