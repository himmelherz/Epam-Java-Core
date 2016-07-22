package task2_1.main;
import task2_1.officesupply.OfficeSupply;
import task2_1.worker.Worker;
import java.util.Scanner;
	

public class Main
{

	public static void AddWorker(Worker[] worker)
	{
		Scanner scan = new Scanner(System.in);
		int k =0;
		for(int i=0; i< worker.length;i++)
		{
			if(worker[i].name.equals("") && (k == 0))
			{
				k = 1;
				System.out.println("Enter name of worker: ");
				String s = scan.nextLine();
				worker[i].name = s;
				worker[i].Fill();
			}
		}
	}

	public static void main(String[] args) 
		{	int counter = 0;
			OfficeSupply supply = new OfficeSupply();
			OfficeSupply pen_for_examine = new OfficeSupply();	

			System.out.println(supply.hashCode());
			System.out.println(supply.toString());
			System.out.println(supply.equals(pen_for_examine));

			pen_for_examine.cost = 1;

			
			System.out.println(supply.equals(pen_for_examine));

			String string_for_suicide = new String();		

			System.out.println(supply.equals(string_for_suicide));
			
			Worker worker[] = new Worker[10];
			for(int i=0;i<10;i++)
			{
				worker[i] = new Worker();
				worker[i].Fill();
			}
			
			AddWorker(worker);
			
			Scanner scan = new Scanner(System.in);
			while(counter == 0)
			{
				System.out.println("Enter your request");
				String s = scan.nextLine();
				String monthString;
				switch (s) 
				{
    				case "show all workers":  
					{
						for(int i=0;i<10;i++)
						{
							worker[i].ShowHim();
						}
             					break;
					}
				
    				case "add worker":  
					{
						AddWorker(worker);
             					break;
					}
    				default: 
					{
						System.out.println("Unknown command");
						System.exit(0);
             					break;
					}
				}

				
			}
        
		}





}
	 