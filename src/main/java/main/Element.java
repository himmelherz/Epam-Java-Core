package element;
import java.util.Scanner;

public class Element
	{
		double value;
		int number;
		
		public Element()
		{
			
			number = 1;
			value = 1/Math.pow(number + 1, 2);
			
		}
	

		public void goNext()
		{
			number += 1;
			value = 1/Math.pow(number + 1, 2);	
		}
		
		public double getValue()
		{
			//System.out.println("Element with index: " + number + " is: " + value);
			return value;
		}
		public void printValue()
		{
			System.out.println("Element with index: " + number + " is: " + value);
			
		}
		

	}