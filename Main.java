package javase01.t01.main;
import java.math.BigDecimal;
import javase01.t01.logic.Logic;
import  java.util.Random;

public class Main 
{

	public static void main(String[] args) 
		{
			final Random random = new Random();
			int n = Integer.parseInt(args[0]);
			if ((n % 2) !=0 )
			{
				System.out.println("Число элементов не четно!");
				System.exit(0);
			}
			int i,i_max = 0;
			double prev_pair = 0;
			double a[] = new double[n];
			i = 0;
			a[0] = random.nextDouble();
			for(i = 0; i < n; i++)
			{
				a[i] = random.nextDouble();
				System.out.println(String.format("%.2f",a[i]));
				
			}
			
			Logic logic = new Logic();
			
			i_max = logic.max_pair(a, prev_pair, i, n, i_max);
	
			System.out.println("___________________________");
			System.out.print("Индекс первого элемента из максимальной суммы элементов(массив с нуля) : ");
			System.out.println(i_max);
			System.out.print("Максимальная сумма равна : ");
			System.out.println(String.format("%.2f",(a[i_max] + a[n - i_max - 1])));
			
		}

}

