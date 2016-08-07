package comparators;

import java.util.Comparator;
import officesupply.OfficeSupply;
import java.util.*;


public class ComparatorByBoth implements Comparator<OfficeSupply>  
	{
        	public int compare(OfficeSupply a,OfficeSupply b) 
		{
            		if(a.name.compareTo(b.name) == 0)
			{
				return  (Double.valueOf(b.cost)).compareTo(Double.valueOf(a.cost));
			}
			else
			return  a.name.compareTo(b.name);
        	}
	}
