import java.util.Stack;

public class ValidParantheses
{
public static void main(String[] args)
{
  String test="()[]{}";
        System.out.println(ValidParanthesesCheck(test));
}

 public static boolean ValidParanthesesCheck(String test)
    {
        Stack<Character> stack=new Stack<>();
        char[] charArr=test.toCharArray();
        for (int i=0;i< charArr.length;i++)
        {
             if (charArr[i]=='(' || charArr[i]=='[' || charArr[i]=='{') {
                stack.push(charArr[i]);
            } else if (stack.isEmpty()) {
                return false;

            } else {
                Character top=stack.peek();
                if(charArr[i]==')'&& top=='(' || charArr[i]==']'&& top=='[' || charArr[i]=='}'&& top=='{')
                {
                    stack.pop();
                }
                else
                {
                    return false;
                }
            }
        }
    return stack.isEmpty();
    }
}