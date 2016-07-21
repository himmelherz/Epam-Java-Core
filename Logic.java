package javase01.t01.logic;

public class Logic 
	{
		public double method(double x,double h)
		{
			double f;
			f = 0;
			//a_n = epsilon + 1;
			//Logic logic = new Logic();
			f = Math.tan(2*x) - 3;
			return f;
		}
		public String printing(double x,double f)
		{
			String formattedDouble ="|    " + String.format("%.2f",x) + "    |   " + String.format("%.2f",f)+ "   |";
			
			return formattedDouble ;
		}
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