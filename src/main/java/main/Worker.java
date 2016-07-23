package worker;

import officesupply.OfficeSupply;


import java.util.ArrayList;
import java.util.Scanner;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;



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
	ArrayList<OfficeSupply> stuff = new ArrayList<OfficeSupply>();
	public BegginerStuff()
	{
		for(int i=0; i < 10; i++)

		{	
		OfficeSupply os = new OfficeSupply();
		os.name = "";
		os.cost = 0.0; 	
		this.stuff.add(os);
	
		}
		Pen pen = new Pen();
		Notepad notepad = new Notepad();
		Table table = new Table();
			this.stuff.set(0, table);
			
			this.stuff.set(1,  pen);

			this.stuff.set(2, notepad);
		
	}
}

public class Worker
	
{
	



		public Notepad note;
		public String name;
	
		public ArrayList<OfficeSupply> supply = new ArrayList<OfficeSupply>();
	
		public Worker()
	
		{
		
			this.name = "";
		
			//this.supply = new OfficeSupply[10];
		
			//for(int i=0; i < 10; i++)
		
			//supply[i] = new OfficeSupply();
		
			//System.out.println("Worker was created");
	
		}
	
		
	public double AllCost()
			
	{
		
		double all_cost = 0.0;
		
		for(int i=0;i<this.supply.size();i++)
		
		{
	
			OfficeSupply os = new OfficeSupply();		
			os = this.supply.get(i);			
			all_cost += os.cost;
		
		}
		
		System.out.println("Worker " + this.name + " has items for: " + all_cost);				
		return all_cost;
	
	}

	
	public void Fill()
	
	{
		
		
		for(int i=0;i<this.supply.size();i++)
		
		{
		
			OfficeSupply os = new OfficeSupply();	
			os.name = "";

						
			os.cost = 0.0;

			this.supply.add(os);		
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
				this.supply.add(pen);          					
				break;
					
			}
				
    				
			case "notepad":  
					
			{
						
						
				Notepad notepad = new Notepad();					
								
				this.supply.add(notepad);          					
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


		


	public void SortBy(String s)
		
	{
		
			switch (s) 
				
		{
    				
			case "by cost":  
					
			{
	
				for(int j = 0; j<this.supply.size();j++)
				for (int i = 0; i<this.supply.size();i++)
		
				{
					
					if((this.supply.get(i) != null) && (i != (this.supply.size() - 1)))
					{
						OfficeSupply next = new OfficeSupply();
						next = this.supply.get(i+1);
						OfficeSupply current = new OfficeSupply();
						current = this.supply.get(i);
						if((Double.valueOf(current.cost)).compareTo(next.cost) == 1)
						{
							
						}
						else if((Double.valueOf(current.cost)).compareTo(next.cost) == -1)
						{
							
							this.supply.set(i,next) ;
							this.supply.set(i+1,current) ;
						}
					}
				}
				break;
											
			}
	


			case "by name":  
					
			{
	
				Collections.sort(supply);
											
			}

			case "by both":
			{
				for(int j = 0; j<this.supply.size();j++)
				for (int i = 0; i<this.supply.size();i++)
		
				{
					
					if((this.supply.get(i) != null) && (i != (this.supply.size() - 1)))
					{
						OfficeSupply next = new OfficeSupply();
						next = this.supply.get(i+1);
						OfficeSupply current = new OfficeSupply();
						current = this.supply.get(i);
						if((Double.valueOf(current.cost)).compareTo(next.cost) == 1)
						{
							
						}
						else if((Double.valueOf(current.cost)).compareTo(next.cost) == -1)
						{
							
							this.supply.set(i,next) ;
							this.supply.set(i+1,current) ;
						}
					}
				}
				Collections.sort(supply);
				break;
			}			
    				
							
							
		}


				
	}



	public void ShowHim()
		
	{
		
		if(name != "")
		
		{
			
			System.out.println("Worker " + name + " has: ");
			
			for(int i=0;i<this.supply.size();i++)
			
			{
	
				OfficeSupply os = new OfficeSupply();		
				os = this.supply.get(i);
				if(os.name != "")
		
				{
			
					System.out.println("Item " + os.name + " which costs: " + os.cost);
		
				}		
			}
		
		}
		
	
	}


}

	 