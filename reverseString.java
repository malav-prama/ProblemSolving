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
    for(int k=0;k<s.length;k++){
        s[k]=reverse[k];
    }
    System.out.println(reverse);
}


}