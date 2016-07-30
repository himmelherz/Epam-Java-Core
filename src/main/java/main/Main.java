package main;
import java.math.BigDecimal;
import logic.Logic;
//import javase01.t01.logic.Logic;
import java.util.Scanner;
public class Main 
{

	static void printAll(double f, double x, double a, double b, double h)
	{
		Logic logic = new Logic();
		System.out.println("__________________________");
		System.out.println("|  Аргумент  |  Функция  |");
		System.out.println("__________________________");
		while(x <= b)
		{
			f = logic.method(x,h);
			System.out.println(logic.printing(x,f));
			x += h;
		}
	}

	public static void main(String[] args) 
		{
			double f, x, a, b;
			double h = 1.0;
			
			Scanner scan = new Scanner(System.in);

			System.out.println("Enter the [a.. ");			
			String s = scan.nextLine();
			a = Double.parseDouble(s);

			f = 0;

			System.out.println("Enter the ..b] ");			
			s = scan.nextLine();
			b = Double.parseDouble(s);


			System.out.println("Enter the step h ");			
			s = scan.nextLine();
			h = Double.parseDouble(s);

			x = a;
			
			printAll(f, x, a, b, h);
		}

}

