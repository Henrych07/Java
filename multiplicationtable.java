//java programm to genertate a multiplication table
import java.io.*;
import java.util.*;
public class MultiplicationTable
{
	public static void main(String ags[])
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter n value");
	    int n=sc.nextInt();
	    int N=n;
		for (int i=1;i<=20;i++)
		{
          	System.out.println(N +"*"+ i+" = "+ N*i);
		}
	}
}
