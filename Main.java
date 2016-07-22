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

			
			Worker worker[] = new Worker[100];
				
		
			for(int i=0;i<100;i++)
						{
							worker[i] = new Worker();;
						}
			Scanner scan = new Scanner(System.in);
			while(counter == 0)
			{
				System.out.println("Enter your request");
				String s = scan.nextLine();
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
						System.out.println("Worker was created");
             					break;
					}
				case "show worker cost":  
					{
						System.out.println("What number?");
						s = scan.nextLine();
						worker[Integer.parseInt(s)].ShowHim();
             					break;
					}
    				default: 
					{
						System.out.println("commands: add worker");
						System.out.println("          show all workers");
						System.out.println("          show worker cost");
						System.exit(0);
             					break;
					}
				}

				
			}
        
		}





}
	 