public class StringDuplicates {
   public static void main(String args[]) {
  
      String input = "John rides a bike. John plays a piano, John.";
      
      input = input.toLowerCase();
    
      String[] words = input.split(" ");
      int length = words.length;
      
      for( int i=0; i < length; i++)
      {   
         int count = 1;
         for(int j=i+1; j < length; j++)
         {
            if(words[i].equals(words[j]))
            {
               count++;
                
               words[j] = "0";
            }
         }
         if (words[i] != "0" && count >= 0)
            System.out.print(" "+words[i]+" ");
      }
   }
}