package GCP_JAVA;
import java.util.*;
public class Calculator {
	public static int add(int a,int b)
	{
		return a+b;
	}
	public static int sub(int a,int b)
	{
		return a-b;
	}
	public static int mul(int a,int b)
	{
		return a*b;
	}
	public static int div(int a,int b)
	{
		return a/b;
	}
	public static int mod(int a,int b)
	{
		return a%b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 1 st number");
		int num=sc.nextInt();
		System.out.println("enter the 2nd number");
		int num1=sc.nextInt();
		System.out.println("addition of numbers is:"+add(num,num1));
		System.out.println("subtraction of numbers is:"+sub(num,num1));
		System.out.println("multiplication of numbers is:"+mul(num,num1));
		System.out.println("division of numbers is:"+div(num,num1));
		System.out.println("remainder after mod operation:"+mod(num,num1));

	}

}
