package coding;

import java.util.*;

public class pattern_int_fun {

	public static int pattern(int N)
	{
		int sum=0, i, j;
		
		for( i=1; i<=N; i++)
		{
			for(j=1; j<=N; j++)
			{
				System.out.print(sum+" ");
				sum=sum+4;
			}
			sum=6*i;
			System.out.println();
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		N = pattern(N);
		sc.close();
	}
}