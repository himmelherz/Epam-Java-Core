package worker;

import officesupply.OfficeSupply;



import java.util.Scanner;


 class Notepad extends OfficeSupply
{
	public Notepad()
	{
		this.name = "notepad";
		
		this.cost = 30;
	}
} 


 class Pen extends OfficeSupply
{
	public Pen()
	{
		this.name = "pen";
		
		this.cost = 20;
	}
} 

 class Table extends OfficeSupply
{
	public Table()
	{
		this.name = "table";
		
		this.cost = 40;
	}
} 

class BegginerStuff
{
	OfficeSupply[] stuff = new OfficeSupply[10];
	public BegginerStuff()
	{
		for(int i=0; i < 10; i++)
		
		stuff[i] = new OfficeSupply();
	
		Pen pen = new Pen();
		Notepad notepad = new Notepad();
		Table table = new Table();
			this.stuff[0] = new OfficeSupply();
			this.stuff[0] = pen;
			
			this.stuff[1] = new OfficeSupply();
			this.stuff[1] = notepad;

			this.stuff[2] = new OfficeSupply();
			this.stuff[2] = table;
		
	}
}

public class Worker
	
{
	



		public Notepad note;
		public String name;
	
		public OfficeSupply supply[] = new OfficeSupply[10];
	
		public Worker()
	
		{
		
			this.name = "";
		
			this.supply = new OfficeSupply[10];
		
			for(int i=0; i < 10; i++)
		
			supply[i] = new OfficeSupply();
		
			//System.out.println("Worker was created");
	
		}
	
	
	public double AllCost()
			
	{
		
		double all_cost = 0.0;
		
		for(int i=0;i<this.supply.length;i++)
		
		{
			
			
			all_cost += this.supply[i].cost;
		
		}
		
		System.out.println("Worker " + this.name + " has items for: " + all_cost);				
		return all_cost;
	
	}

	
	public void Fill()
	
	{
		
		
		for(int i=0;i<this.supply.length;i++)
		
		{
			
			this.supply[i].name = "";
			
			this.supply[i].cost = 0.0;
		
		}
		
	
	}



	public void AddBeginnerStuff()
	
	{
		

		BegginerStuff bs = new BegginerStuff();
		this.supply = 	bs.stuff;	
	
	}



	
	public void AddItem()
	
	{
	
		int k = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What do you want to add?");
	

		String s = scan.nextLine();
				
		switch (s) 
				
		{
    				
			case "pen":  
					
			{
	
				Pen pen = new Pen();					
				for(int i=0;i<this.supply.length;i++)
		
				{
		
					if(this.supply[i].name.equals("") && (k == 0))

					{
						k = 1;
						this.supply[i] = pen;
					}			
				}
           					
				break;
					
			}
				
    				
			case "notepad":  
					
			{
						
						
				Notepad notepad = new Notepad();					
				for(int i=0;i<this.supply.length;i++)
		
				{
		
					if(this.supply[i].name.equals("") && (k == 0))

					{
						k = 1;
						this.supply[i] = notepad;
					}			
				}
           					
				break;
  					
			}
				
			default: 
					
			{
						
				System.out.println("Items: pen");
						
				System.out.println("   notepad");
				
			        break;
						
			}
				
		}

		
	
	}


		
	public void ShowHim()
		
	{
		
		if(name != "")
		
		{
			
			System.out.println("Worker " + name + " has: ");
			
			for(int i=0;i<this.supply.length;i++)
			
			{
	
				if(this.supply[i].name != "")
		
				{
			
					System.out.println("Item " + this.supply[i].name + " which costs: " + this.supply[i].cost);
		
				}		
			}
		
		}
		
	
	}


}

	 