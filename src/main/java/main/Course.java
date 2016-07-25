package course;

import student.Student;

import java.util.Scanner;

import java.util.Arrays;	
import java.util.*;

public enum Course //implements Comparable<Discipline>
{
	
	
	MATH
	{
		public ArrayList<Student> student = new ArrayList<Student>();
		public double grade = 0.0; 
		public void addStudent()
		{
			Scanner scan = new Scanner(System.in);
	
			System.out.println("Enter the name");
				
			String s = scan.nextLine();
	
			String name = s;
			System.out.println("Enter the grade");

			s = scan.nextLine();

			int grade = (int) Math.round(Double.parseDouble(s));
			Student<String, Integer> st = new Student<String,Integer>(name, grade);
			this.student.add(st);
		}
		public void showAllStudents()
		{
			System.out.println("MATH: ");

			for(int i = 0; i<this.student.size();i++)
			{
				Student<String, Integer> st = new Student<String,Integer>("", 0);
				st = this.student.get(i);
				System.out.println("Student " + st.getName() + " has grade: " + st.getGrade());
	
			}
			System.out.println("_____ ");

		}
		public String getName()
		{
			
			return "Math";
		}
		public ArrayList<Student> getList()
		{
			
			return this.student;
		}
		
	},
		
	ENGLISH
	{
		public ArrayList<Student> student = new ArrayList<Student>();
		public double grade = 0.0; 
		public void addStudent()
		{
			Scanner scan = new Scanner(System.in);
	
			System.out.println("Enter the name");
				
			String s = scan.nextLine();
	
			String name = s;
			System.out.println("Enter the grade");

			s = scan.nextLine();

			double grade = Double.parseDouble(s);
			Student<String, Double> st = new Student<String,Double>(name, grade);
			this.student.add(st);
		}
		public void showAllStudents()
		{
			System.out.println("ENGLISH: ");

			for(int i = 0; i<this.student.size();i++)
			{
				Student<String, Double> st = new Student<String,Double>("", 0.0);
				st = this.student.get(i);
				System.out.println("Student " + st.getName() + " has grade: " + st.getGrade());
	
			}
			System.out.println("_____ ");

		}
		public String getName()
		{
			
			return "English";
		}
		public ArrayList<Student> getList()
		{
			
			return this.student;
		}
	},


	IT
	{
		public ArrayList<Student> student = new ArrayList<Student>();
		public double grade = 0.0; 
		public void addStudent()
		{
			Scanner scan = new Scanner(System.in);
	
			System.out.println("Enter the name");
				
			String s = scan.nextLine();
	
			String name = s;
			System.out.println("Enter the grade");

			s = scan.nextLine();

			double grade = Double.parseDouble(s);
			Student<String, Double> st = new Student<String,Double>(name, grade);
			this.student.add(st);
		}
		public void showAllStudents()
		{
			System.out.println("IT: ");

			for(int i = 0; i<this.student.size();i++)
			{
				Student<String, Double> st = new Student<String,Double>("", 0.0);
				st = this.student.get(i);
				System.out.println("Student " + st.getName() + " has grade: " + st.getGrade());
	
			}
			System.out.println("_____ ");

		}
		public String getName()
		{
			
			return "IT";
		}
		public ArrayList<Student> getList()
		{
			
			return this.student;
		}
	};
public String getName()
		{
			
			return this.getName();
		}
public void addStudent()
		{
			
			this.addStudent();
		}
public void showAllStudents()
		{
			this.showAllStudents();
		}
		public ArrayList<Student> getList()
		{
			
			return this.getList();
		}

}


	