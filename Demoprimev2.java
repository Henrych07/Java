import java.util.*;
public class Demoprimev2
{
    public static void main(String args[])
    {
        int num=11,flag=0;
        System.out.println("Enter an integer to check prime or not ");
        Scanner sc=new Scanner(System.in);
              num=sc.nextInt();
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                System.out.println(num+" is not a prime number");
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println(num+" is a prime number");
        }
    }
}
