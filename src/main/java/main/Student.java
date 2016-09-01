package student;

import java.util.ArrayList;
import java.util.Scanner;
import datas.Datas;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.*;

import course.Course;

public class Student<T1>
{
	

	public String name;
	public ArrayList<Datas> courses; 
	public Student()
	{
	
	}		
	public Student(String name)
	{
		this.name = name;
		courses = new ArrayList<Datas>();
	}	
	public void addCourse(Datas new_course)
	{
		courses.add(new_course);	
	}	
	public String getName()
	{
		return name;
	}	
   	public void setName(String name)
	{
		this.name = name; 
	}
	public  ArrayList<Datas> getCourses()
	{
		return courses;
	}
	public int  compareWith(Student another, Course course)
	{
		Datas comparing_course = new Datas(0.0, "math");
		for(int i = 0; i < courses.size(); i++)
		{
			if (course == courses.get(i).getCourse())
				comparing_course =courses.get(i);
				
		}
		Datas data = another.courses.get(0);
		System.out.println(data.grade);
		for(int i = 0; i < another.courses.size(); i++)
		{
			if (another.courses.get(i).current_course == course)
				{
					if(another.courses.get(i).getGrade() == comparing_course.getGrade())
						return 0;
					if(another.courses.get(i).getGrade() > comparing_course.getGrade())
						return 1;
					if(another.courses.get(i).getGrade() < comparing_course.getGrade())
						return -1;
				}
		}	
	}
	public void setGrade()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the course name");
		String s = scan.nextLine();
		switch(s)
		{
			case "math":
			{
				for(int i = 0; i< courses.size(); i++)
				{
					if(courses.get(i).getCourse() == Course.MATH)
					{
						System.out.println("Enter the grade");
						s = scan.nextLine();
						courses.get(i).setGrade(Double.parseDouble(s));
					}
				}
				break;
			}
			case "english":
			{
				for(int i = 0; i< courses.size(); i++)
				{
					if(courses.get(i).getCourse() == Course.ENGLISH)
					{
						System.out.println("Enter the grade");
						s = scan.nextLine();
						courses.get(i).setGrade(Double.parseDouble(s));
					}
				}
				break;
			}
			case "it":
			{
				for(int i = 0; i< courses.size(); i++)
				{
					if(courses.get(i).getCourse() == Course.IT)
					{
						System.out.println("Enter the grade");
						s = scan.nextLine();
						courses.get(i).setGrade(Double.parseDouble(s));
					}
				}
				break;
			}
		}
	}
	public void printStudentInfo()
	{
		for(int i = 0; i < courses.size(); i++)
		System.out.println(" ** " + courses.get(i).getCourse().getName() + " with grade: " + courses.get(i).getGrade());
	}
	
	
}

	 