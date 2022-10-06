public class DuplicateCharactersInAString
{
   public static void main(String[] args)
   {
   
      String str="llllmmao";
      duplicateChars(str);
   }

   public static void duplicateChars(String str)
   {
     
      char[] charArr=str.toCharArray();
   
      for(int i=0;i<charArr.length;i++)
      {
         for(int j=i+1;j<charArr.length;j++)
         {
         
            if(charArr[i]==charArr[j])
            {
               System.out.println(charArr[j]);
               break;
            
            }
         
         }
      }
   

   } 
}