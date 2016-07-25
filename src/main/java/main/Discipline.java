package discipline;

//import javase01.t01.log.Log;

import java.util.Scanner;

import java.util.Arrays;	
import java.util.*;




public enum Discipline //implements Comparable<Discipline>
{
	
	//public String name = new String();
	MATH("Math")
	{
		public double grade = 0.0; 
		public double getGrade()
		{
			return grade;
		}
		public void setGrade(double grade)
		{
			this.grade = grade;
		}
	},
		
	ENGLISH("English")
	{
		public int grade = 0; 
		public double getGrade()
		{
			return grade;
		}
		public void setGrade(double grade)
		{
			this.grade = (int) Math.round(grade);
		}
	},


	IT("IT")
	{
		public int grade = 0;
		public double getGrade()
		{
			return grade;
		}
		public void setGrade(double grade)
		{
			
      			this.grade = (int) Math.round(grade);
		}
	};

public String name;


Discipline(String name)
	{
		this.name = name;
	}
	


public void setGrade(double d)
	{
		this.setGrade(d);
	}

	




public double getGrade()
	{
		return this.getGrade();
	}
}


	