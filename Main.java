package javase01.t01.main;
import java.math.BigDecimal;
import javase01.t01.logic.Logic;
//import javase01.t01.logic.Logic;

public class Main 
{

	public static void main(String[] args) 
		{
			double f, x, a, b;
			double h = 1.0;
			f = 0;
			h = Double.parseDouble(args[0]);
			a = Double.parseDouble(args[1]);
			b = Double.parseDouble(args[2]);
			x = a;
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

}

