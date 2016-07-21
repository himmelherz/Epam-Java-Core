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
	}