package coding;
import java.util.*;

public class pattern {

	public static void main(String[] args) {
		
			int i, j, sum=0;
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			
			for( i=1; i<=N; i++)
			{
			    for( j=1; j<=N; j++)
			    {
			        System.out.print(sum);
			        System.out.print(" ");
			        sum+=4;
			    }
			 sum = 6*i;
			 System.out.println();
			}
			}
	}