package javase01.t01.main;


public class Main 
{

	public static void main(String[] args) 
		{
			int n = Integer.parseInt(args[0]);
			int i = 0;
			int j = 0;
			double a[][] = new double[n][n];
			
			
			for(i = 0; i < n; i++)
			{
				for(j = 0; j < n; j++)
				{
					if(i == j )
					{
						a[i][j] = 1;
					}
					else if (i == (n-j-1))
						{
							a[i][j] = 1;
						}
					else
					{
						a[i][j] = 0;
					}	
				}						
			}
			for(i = 0; i < n; i++)
			{
				for(j = 0; j < n; j++)
				{
					if(j == (n-1) )
					{
						System.out.println(String.format(" %.0f ",a[i][j]));
					}	
					else
						System.out.print(String.format(" %.0f ",a[i][j]));
				}						
			}

		}

}

