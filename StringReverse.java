package GCP_JAVA;
import java.util.*;
import java.lang.*;
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char[] c=new char[str.length()];
		for(int i=0;i<str.length();i++)
		{
			c[i]=str.charAt(i);
		}
		int max=-999;
		char a=' ';
		for(int i=0;i<c.length;i++)
		{
			int count=0;
			char ch=c[i];
			if(ch!='@')
			{
				for(int j=i;j<c.length;j++)
				{
					if(ch==c[j])
					{
						c[j]='@';
						count++;
						
					}
				}
				max=Math.max(max,count);
				a=ch;
			}
		}
		System.out.println(max+"character with highest occurence is"+a);
		
}
}