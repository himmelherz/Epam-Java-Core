package officesupply;

import officesupply.OfficeSupply;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;


public class BegginerStuff
{
	public ArrayList<OfficeSupply> stuff = new ArrayList<OfficeSupply>();
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
			this.stuff.set(3, pen);
		
	}
}
