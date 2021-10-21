package GCP_JAVA;
import java.util.*;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int m=N;
		for(int i=1;i<=N;i++)
		{
			for(int j=1;j<=m-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print("*");
			}
			m--;
			System.out.println("");
		}
		m=2;
		for(int i=N-1;i>=1;i--)
		{
			for(int j=1;j<m;j++)
			{
				System.out.print(" ");
			}
			for(int k=2*i-1;k>=1;k--)
			{
				System.out.print("*");
			}
			m++;
			System.out.println("");
		}

	}

}



output:
10
         *
        ***
       *****
      *******
     *********
    ***********
   *************
  ***************
 *****************
*******************
 *****************
  ***************
   *************
    ***********
     *********
      *******
       *****
        ***
         *

