package GCP_JAVA;
import java.util.*;
public class SUM_OF_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number");
		int n=sc.nextInt();
		n=n/10;
		int last_second=n%10;
		int first=0;
		while(n>=10)
		{
			n=n/10;
		}
		first=n;
		int sum=first+last_second;
		System.out.println("the sum is : "+sum);
	}

}
