package datas;

import course.Course;

import java.util.Arrays;	
import java.util.*;
import java.math.*;
public class Datas
{
	public double grade;
	Course current_course;
	public Datas(double new_grade, String name)
	{
		
		switch(name)
		{
			case "math":
			{
				current_course  = Course.MATH;
				grade = Math.round(new_grade);
				break;
			}
			case "english":
			{
				current_course  = Course.ENGLISH;
				grade = new_grade;
				break;
			}
			case "it":
			{
				current_course  = Course.IT;
				grade = new_grade;
				break;
			}
		}
	} 
	public void setGrade(double new_grade)
	{
		if(current_course == Course.MATH)
		{
			grade = Math.round(new_grade);
		}
		else
		{
			grade = new_grade;
		}
	}
	public double getGrade()
	{
		return grade;
	}
	public Course getCourse()
	{
		return current_course;
	}
	
}