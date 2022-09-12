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