package officesupply;

//import javase01.t01.log.Log;

import java.util.Scanner;

import java.util.Arrays;	
import java.util.*;


public class OfficeSupply //implements Comparable<OfficeSupply>
{
	
	public double cost;
	
	public String name;

	
	public OfficeSupply()
	
	{
		
		//System.out.println("here is the pen");
		
		this.name = "";
		
		this.cost = 0;
	
	}
	
	
	public boolean equals(Object o)
	
	{
		
		System.out.println("method equals");
		
		if ((o != null) && (o.getClass().equals(this.getClass())))
            	
		{              
			
			System.out.print("method equals: ");
                	
			return (((OfficeSupply)o).cost == this.cost) && (((OfficeSupply)o).name == this.name);
		
		}else
			
		{
				
			System.out.print("illegal incoming parameters: ");
				
			return false; 
			
		}

	
	}


	
	public int hashCode()
	
	{
		
		System.out.print("method hashCode: ");
		
		return 0;
	
	}

	
	public String toString()
	
	{
		
		System.out.print("method toString: ");
		
		return "Office Supply[" + name + " costs: " + cost + "]";
	
	}


	


	
	





}

	

