public class Fibonacci
{
   public static void main(String[] args)
   {
      int i=1;
      int j=1;
      int k=0;
      System.out.print(i+" "+j+" ");
   
      while(k<=50)
      {
         k=i+j;
         System.out.print(k+" ");
         i=j;
         j=k;
      }
   
   }

}