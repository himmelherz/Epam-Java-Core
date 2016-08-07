package comparators;

import java.util.Comparator;
import officesupply.OfficeSupply;
import java.util.*;


public class ComparatorByName implements Comparator<OfficeSupply>  
	{
        	public int compare(OfficeSupply a,OfficeSupply b) 
		{
			String as = a.name;	
			String bs = b.name;	
            		return  a.name.compareTo(b.name);
        	}
	}