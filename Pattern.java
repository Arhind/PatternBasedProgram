package pattern;

public class Pattern {

	public static void main(String[] args) {

		int n=5;
		Pattern t = new Pattern();
		
		t.increasingTriangle(n);
		System.out.println();
		t.decreasingTriangle(n);
		System.out.println();
		t.fullPyramid(n);
		System.out.println();
		t.leftTriangle(n);
		System.out.println();
		t.rightTriangle(n);
		System.out.println();		
		t.diamond(n);
		System.out.println();	
		t.reversePyramid(n);
		System.out.println();
		t.rightDownMirrorStarPattern(n);
	}

	void increasingTriangle(int n)
	{
		System.out.println("INCREASING TRIANGLE");
		for( int i=1; i<=n; i++)
		{
			for( int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	void decreasingTriangle(int n)
	{
		System.out.println("DECREASING TRIANGLE");
		for( int i=1; i<=n; i++)
		{
			for( int j=i; j<=n; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	void fullPyramid (int n)
	{
		System.out.println("FULL PYRAMID");
		for( int i=1; i<=n; i++)
		{
			for( int j=i; j<n; j++)
			{
				System.out.print("  ");
			}
			
			for( int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			
			for( int j=1; j<i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}	
	}
	
	void leftTriangle( int n)
	{
		System.out.println("Left Triangle");
		for( int i=1; i<=n; i++)
		{
			for( int j=i; j<n; j++)
			{
				System.out.print("  ");
			}
			for( int j=1; j<=i ; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	void rightTriangle( int n)
	{
		System.out.println("Right Triangle");
		for( int i=1; i<=n; i++)
		{
			for( int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	void diamond( int n)
	{
		System.out.println("Diamond Shape Pattern");
		for( int i=1; i<=n; i++)
		{
			for( int j=i; j<n; j++)
			{
				System.out.print("  ");
			}
			for( int j=1; j<i; j++)
			{
				System.out.print("* ");
			}
			for( int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for( int i=2; i<=n; i++)
		{
			for( int j=1; j<i; j++)
			{
				System.out.print("  ");
			}
			for( int j=i; j<=n; j++)
			{
				System.out.print("* ");
			}
			for( int j=i; j<n; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}	
	}
	
	void reversePyramid( int n)
	{
		System.out.println("REVERSE PYRAMID");	
		for( int i=1; i<=n; i++)
		{
			for( int j=1; j<i; j++)
			{
				System.out.print("  ");				
			}
			for( int j=i; j<n; j++)
			{
				System.out.print("* ");				
			}
			for( int j=i; j<=n; j++)
			{
				System.out.print("* ");				
			}
			System.out.println();
		}
	}
	
	void rightDownMirrorStarPattern(int n)
	{
		System.out.println("Right down Mirror Star Pattern");
		for( int i=1; i<=n; i++)
		{
			for( int j=1; j<i; j++)
			{
				System.out.print("  ");
			}
			for(int j=i; j<=n; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}