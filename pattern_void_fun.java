package coding;
import java.util.Scanner;
//Void type function call

public class pattern_void_fun {
	
	static void pattern()
	{
		int N, i, j, sum=0;
		
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		
		for( i=1; i<=N; i++)
		{
			for( j=1; j<=N; j++)
			{
				System.out.print(sum+" ");
				sum+=4;
			}
		sum=6*i;
		System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		pattern();
	}
}