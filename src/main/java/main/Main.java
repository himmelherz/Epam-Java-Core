package main;
import java.util.Scanner;

public class Main 
{

	static int[][] createMatrix()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the dimension: ");
		String s = scan.nextLine();
		int n = Integer.parseInt(s);
		int[][] matrix = new int[n][n];
	return  matrix;
	}

	public static void main(String[] args) 
		{
			int i = 0;
			int j = 0;
			
			int[][] matrix;
			matrix = createMatrix();
			for(i = 0; i < matrix.length; i++)
			{
				for(j = 0; j < matrix.length; j++)
				{
					if((i == j ) || (i == (matrix.length-j-1)))
					{
						matrix[i][j] = 1;
					}
					else 
					{
						matrix[i][j] = 0;
					}	
				}						
			}
	
			for(i = 0; i < matrix.length; i++)
			{
				for(j = 0; j < matrix.length; j++)
				{
					if(j == (matrix.length-1) )
					{
						System.out.println(String.format(" " + matrix[i][j]));
					}	
					else
						System.out.print(String.format(" " + matrix[i][j]));
				}						
			}

		}

}

