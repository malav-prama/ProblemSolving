import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
public class LongestSubstringOfAString
{
   public static void main(String[] args)
   {
   String test="abbac";
        LongestSubstring(test);
   }
   
   public static void LongestSubstring(String test)
    {

        String LongestSubString=null;
        int LongestSubstringLength=0;
        Map<Character, Integer> map=new LinkedHashMap<Character, Integer>();

        char[] arr=test.toCharArray();

        for (int i=0; i< arr.length;i++)
        {
            char ch= arr[i];
            if (!map.containsKey(ch))
            {
                map.put(ch, i);
            }
            else
            {
                i=map.get(ch);
                map.clear();
            }
            if (map.size()>LongestSubstringLength)
            {
                LongestSubstringLength=map.size();
                LongestSubString=map.keySet().toString();
            }
        }
        System.out.println(LongestSubstringLength);

    }
}