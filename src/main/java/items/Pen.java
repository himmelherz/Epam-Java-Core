package officesupply;

import officesupply.OfficeSupply;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;



public class Pen extends OfficeSupply
{
	public Pen()
	{
		this.name = "pen";
		
		this.cost = 20;
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