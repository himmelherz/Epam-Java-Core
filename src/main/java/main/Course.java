package course;

import java.util.Scanner;

import java.util.Arrays;	
import java.util.*;

public enum Course 
{
	
	MATH
	{
		
		public String getName()
		{
			return "Math";
		}
		
		
		
	},
		
	ENGLISH
	{
		
		public String getName()
		{
			return "English";
		}
		
		
	},


	IT
	{
		
		public String getName()
		{
			return "IT";
		}
		
	};

public String name;
	
	public String getName()
	{
		return this.getName();
	}
	

}


	