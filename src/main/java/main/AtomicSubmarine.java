 package atomicsubmarine;
 

 import java.util.Scanner;
 
 import java.util.Arrays;	
 import java.util.*;	

 public class AtomicSubmarine
{
	public int position;
	public int direction;
	public Engine engine;
	public AtomicSubmarine()
	{
		this.position = 0;
		this.direction = 0;
		this.engine = new Engine();
	}
	public void pushRedButton()
	{		
		this.engine.goAhead();
	}
	public class Engine
	{
		public void goAhead()
		{
			if (AtomicSubmarine.this.direction == 0)
			{
				if(AtomicSubmarine.this.position <40)
				AtomicSubmarine.this.position += 1;
				else
				AtomicSubmarine.this.direction = 1;
			}
			
			else if (AtomicSubmarine.this.direction == 1)
				
			{
				if(AtomicSubmarine.this.position > 0)
				AtomicSubmarine.this.position -= 1;
				else
				AtomicSubmarine.this.direction = 0;
			}
		}
	}

} 