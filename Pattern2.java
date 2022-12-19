package pattern;

public class Pattern2 {

	public static void main(String[] args) {

		int n=5;
		Pattern2 p = new Pattern2();
		
		p.rightPascalTriangle(n);
		p.leftPascalTriangle(n);
	}
	
	void rightPascalTriangle(int n)
	{
		System.out.println("Right Pascal’s Triangle");
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1; i<=n; i++)
		{
			for(int j=i; j<n; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}
	
	void leftPascalTriangle(int n)
	{
		System.out.println("Left Pascal’s Triangle");
		for(int i=1; i<n; i++)
		{
			for(int j=i; j<n; j++)
			{
				System.out.print("  ");
			}
			for( int j=0; j<i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<i; j++)
			{
				System.out.print("  ");
			}
			for( int j=i; j<=n; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}
