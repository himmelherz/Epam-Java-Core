package logic;

public class Logic 
	{

		public int max_pair(double[] a, double prev_pair, int i, int n, int i_max)
		{
			
			for(i = 0; i < (n/2); i++)
			{	
				if ((a[i] + a[n-i-1]) > prev_pair)
				{
				
					i_max = i;
					prev_pair = a[i] + a[n-i-1];
				}

				System.out.println(String.format("Current sum %.2f    Current max sum %.2f ",(a[i] + a[n - i - 1]), (a[i_max] + a[n - i_max - 1])));
				
					
			}
			return i_max;
		}
	}