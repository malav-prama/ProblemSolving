public class NonRepeatedCharacterString
{
   public static void main(String[] args)
   {
   
      String str="aaccbde";
      nonRepeating(str);
   
   }

   public static int nonRepeating(String s)
   {
      
      if(s.length()==1)
      {
         return 0;
      }
      char a[]=s.toCharArray();
      char ch;
      boolean x=false;
      for(int i=0;i<s.length();i++)
      {
         ch=s.charAt(i);
         for(int j=0;j<a.length;j++)
         {
            if(i!=j)
            {
               if(ch!=a[j])
               {
                  x=true;
               }
               else
               {
                  x=false;
                  break;
               }
            }
                
         }
            
            
         if(x==true)
         {
            return i;
         }
      }
        
      return -1;      
   
   }

}