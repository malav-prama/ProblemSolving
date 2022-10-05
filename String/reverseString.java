public class reverseString
{
   public static void main(String[] args)
   {
   
      char[] arr={'h','e','l','l','o'};
      method(arr);
   
   
   }

   public static void method(char[] s) {
      char [] reverse=new char[s.length];
      int j=0;
      for (int i=s.length-1;i>=0;i--){
         reverse[j++]=s[i];
      
      }   
      System.out.println(reverse);
   }


}