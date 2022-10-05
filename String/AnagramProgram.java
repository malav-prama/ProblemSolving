//Valid Anagram
// Given two strings s and t, return true if t is an anagram of s, and false otherwise.
// 
// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
// 
//  
// 
// Example 1:
// 
// Input: s = "anagram", t = "nagaram"
// Output: true
// Example 2:
// 
// Input: s = "rat", t = "car"
// Output: false

class AnagramProgram {
   public boolean isAnagram(String s, String t) {
   
      char sar[]=s.toCharArray();
      char tar[]=t.toCharArray();
      Arrays.sort(sar);
      Arrays.sort(tar);
      int sl=sar.length;
      int tl=tar.length;
      if(sl!=tl)
      {
         return false;
      }
      for(int i=0;i<sar.length;i++)
      {
         if(sar[i]!=tar[i])
         {
            return false;
         }
      }
      return true;
      
      
   }
}