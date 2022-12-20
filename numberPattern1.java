package pattern;

public class numberPattern1 {

	public static void main(String[] args) {

		int n=5, loc=1;
		
		for( int i=1; i<=n; i++)
		{
			for( int j=1; j<=i; j++)
			{
				if( loc%2==0)
					System.out.print("b");
				else
					System.out.print("a");					
			}
			loc++;
			System.out.println();
		}
	}

}
