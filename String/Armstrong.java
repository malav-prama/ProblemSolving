public class Armstrong {

public static void main(String[] args)
{

System.out.print(isArmstrong(153));
}
    public static boolean isArmstrong(int n) {
        int length=0;
        int temp=n;
        while(temp>0){
            temp=temp/10;
            length++;
        }
        temp=n;
        int sum=0;
        while(temp>0){
            int num = temp%10;
            sum+=Math.pow(num,length);
            temp=temp/10;
        }
        return sum==n;
    }
}