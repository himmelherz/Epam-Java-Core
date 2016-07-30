package main;
import java.util.Scanner;
import element.Element;
public class Main 
{

	
	public static void main(String[] args) 
		{	
			double epsilon;
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the epsilon");
			String s = scan.nextLine();
			epsilon = Double.parseDouble(s);
			
			Element element = new Element();

			while( element.getValue() >= epsilon )
			{
				element.printValue();
				element.goNext();
			}
			element.printValue();
			System.out.printf("Final an = %.6f\n",element.getValue());

 		}


        
}



