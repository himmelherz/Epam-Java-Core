package task2_1.worker;

import task2_1.officesupply.OfficeSupply;

//import java.util.Scanner;
	


public class Worker
	
{
	
		public String name;
	
		public OfficeSupply supply[];
	
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
			
			this.supply[i].name = "some name";
			
			this.supply[i].cost = 2.0;
		
		}
		
	
	}

	
	public void ShowHim()
		
	{
		
		if(name != "")
		
		{
			
			System.out.println("Worker " + name + " has: ");
			
			for(int i=0;i<this.supply.length;i++)
			
			{
				
				System.out.println("Item " + this.supply[i].name + " which costs: " + this.supply[i].cost);
			
			}
		
		}
		
	
	}


}

	 