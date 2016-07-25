package student;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.*;



public class Student<T1, T2>
{
	

	public T1 name;
	public T2 grade;
	public Student()
	{
	
	}		
	public Student(T1 name, T2 grade)
	{
		this.name = name;
		this.grade = grade;
	}		
	public T1 getName()
	{
		return name;
	}	
   	public void setName(T1 name)
	{
		this.name = name; 
	}
		
	public T2 getGrade()
	{
		return grade;
	}	
   	public void setGrade(T2 grade)
	{
		this.grade = grade; 
	}
}

	 