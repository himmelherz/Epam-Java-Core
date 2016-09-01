package worker;

import officesupply.OfficeSupply;


import java.util.ArrayList;
import java.util.Scanner;


import java.util.*;
import comparators.*;
import officesupply.*;


public class Worker
	
{

		
		public String name;
	
		public ArrayList<OfficeSupply> supply = new ArrayList<OfficeSupply>();
	
		public Worker()
	
		{
		
			this.name = "";

	
		}
	
		
	public double allCost()
			
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

	
	public void fill()
	
	{
		
		
		for(int i=0;i<this.supply.size();i++)
		
		{
		
			OfficeSupply os = new OfficeSupply();	
			os.name = "";

						
			os.cost = 0.0;

			this.supply.add(os);		
		}
		
	
	}



	public void addBeginnerStuff()
	
	{
		

		BegginerStuff bs = new BegginerStuff();
		this.supply = 	bs.stuff;	
	
	}



	
	public void addItem()
	
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


		


	public void sortBy(String s)
		
	{
		
			switch (s) 
				
		{
    				
			case "by cost":  
					
			{
				
				Collections.sort(supply, new ComparatorByCost());
				break;
											
			}
	


			case "by name":  
					
			{
	
				Collections.sort(supply, new ComparatorByName());
				break;
											
			}

			case "by both":
			{
				Collections.sort(supply, new ComparatorByBoth());
				break;
			}			
    				
							
							
		}


				
	}



	public void showHim()
		
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

	 