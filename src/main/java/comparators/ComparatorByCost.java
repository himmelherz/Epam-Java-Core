package comparators;

import java.util.Comparator;
import officesupply.OfficeSupply;
import java.util.*;


public class ComparatorByCost implements Comparator<OfficeSupply>  
	{
        	public int compare(OfficeSupply a,OfficeSupply b) 
		{
            		return  (Double.valueOf(b.cost)).compareTo(Double.valueOf(a.cost));
        	}
	}


