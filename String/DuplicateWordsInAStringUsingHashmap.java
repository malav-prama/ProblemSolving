import java.util.*;
public class DuplicateWordsInAStringUsingHashmap
{
public static void main(String[] args)
{
//finding duplicate words in a string using hashmap
        String str="John is a boy John a a ok John";
        String[] words=str.split(" ");

        Map<String, Integer> map=new HashMap<>();

        for(int i=0; i< words.length; i++)
        {

            if(map.get(words[i])!=null)
            {
               map.put(words[i], map.get(words[i])+1);
            }
            else {
                map.put(words[i], 1);
            }
        }

        Iterator<String> iterator=map.keySet().iterator();

        while (iterator.hasNext())
        {
            String temp=iterator.next();
            if(map.get(temp)>1)
            {
                System.out.println("The word "+temp+" appeared "+map.get(temp)+" times");
            }
        }
}

}