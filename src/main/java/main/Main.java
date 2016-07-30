package main;
import java.math.BigDecimal;
import logic.Logic;
import  java.util.Random;
import java.util.Scanner;

public class Main 
{
	static double[] createMassive()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the dimension: ");
		String s = scan.nextLine();
		int n = Integer.parseInt(s);

		if ((n % 2) !=0 )
			{
				System.out.println("Число элементов не четно!");
				System.exit(0);
			}

		double[] massive = new double[n];
		return  massive;
	}

	static void fillMassive(double[] massive)
	{
		final Random random = new Random();
		for(int i = 0; i < massive.length; i++)
			{
				massive[i] = random.nextDouble();
				System.out.println(String.format("%.2f",massive[i]));
				
			}
	}
	

	public static void main(String[] args) 
		{
			
			
					

			double[] massive = createMassive();
			int i = 0;
			int i_max = 0;
			double prev_pair = 0;
			fillMassive(massive);
			
			Logic logic = new Logic();
			
			i_max = logic.max_pair(massive, prev_pair, i, massive.length, i_max);
	
			System.out.println("___________________________");
			System.out.print("Индекс первого элемента из максимальной суммы элементов(массив с нуля) : ");
			System.out.println(i_max);
			System.out.print("Максимальная сумма равна : ");
			System.out.println(String.format("%.2f",(massive[i_max] + massive[massive.length - i_max - 1])));
			
		}

}

