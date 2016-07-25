package student;

import discipline.Discipline;


import java.util.ArrayList;
import java.util.Scanner;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.*;


 	
class Course
{
	Discipline dis;
	public Course(Discipline dis)
	{
		this.dis = dis;	
	}
}

public class Student
	
{
	

   
	

		
		public String name;
	
		public ArrayList<Course> courses = new ArrayList<Course>();
		
		public Student()
	
		{
		
			this.name = "";
		
			//this.supply = new Discipline[10];
		
			//for(int i=0; i < 10; i++)
		
			//supply[i] = new Discipline();
		
			//System.out.println("Worker was created");
	
		}
	
	public void AddDiscipline()
 	
 	{
 	
 		int k = 0;
 		Scanner scan = new Scanner(System.in);
 		
 		System.out.println("What do you want to add?");
 	
 
 		String s = scan.nextLine();
 				
 		switch (s) 
 				
 		{
     				
 			case "math":  
 					
 			{
				Discipline dis= Discipline.MATH;
				
 				Course math = new Course(dis);				
 				this.courses.add(math);          					
 				break;
 					
 			}
 				
     				
 			case "it":  
 					
 			{
 						
 						
 				Discipline dis= Discipline.IT;
				
 				Course i_tech = new Course(dis);				
 				this.courses.add(i_tech);          					
 				break;
   					
 			}
 			case "english":  
 					
 			{
 						
 						
 				Discipline dis= Discipline.ENGLISH;
				
 				Course eng = new Course(dis);				
 				this.courses.add(eng);          					
 				break;
   					
 			}	
 			default: 
 					
 			{
 						
 				System.out.println("Items: pen");
 						
 				System.out.println("   notepad");
 				
 			        break;
 						
 			}
 				
 		}
 
 		
 	
 	}
	public void setGrade()
	{
		System.out.println("What's the course?");
 	
 Scanner scan = new Scanner(System.in);
	
 		String s = scan.nextLine();
 				
 		switch (s) 
 				
 			{
     				
 				case "math":  
 					
 				{
					Discipline dis= Discipline.MATH;
 					Course math = new Course(dis);


					Course current = new Course(dis);
					System.out.println("What's the grade?");
					s = scan.nextLine();
					double grade = Double.parseDouble(s);
					System.out.println(grade);
					
 						for(int j = 0; j < this.courses.size(); j++)
						{
							current = this.courses.get(j);
 							if(current.dis.equals(math.dis))
							{
								current.dis.setGrade(grade);
								courses.set(j, current);
								break;
							}
 						}       					
 					break;
 					
 				}
 				
     				
 				case "it":  
 					
 				{
 					Discipline dis= Discipline.IT;
 					Course i_tech = new Course(dis);


					Course current = new Course(dis);
					System.out.println("What's the grade?");
					s = scan.nextLine();
					double grade = Double.parseDouble(s);
					
 						for(int j = 0; j < this.courses.size(); j++)
						{
							current = this.courses.get(j);
 							if(current.dis.equals(i_tech.dis))
							{
								current.dis.setGrade(grade);
								courses.set(j, current);
								break;
							}
 						}       					
 					break;
   					
 				}
 				case "english":  
 					
 				{
 					Discipline dis= Discipline.IT;
 					Course eng = new Course(dis);


					Course current = new Course(dis);
					System.out.println("What's the grade?");
					s = scan.nextLine();
					double grade = Double.parseDouble(s);
					
 						for(int j = 0; j < this.courses.size(); j++)
						{
							current = this.courses.get(j);
 							if(current.dis.equals(eng.dis))
							{
								current.dis.setGrade(grade);
								courses.set(j, current);
								break;
							}
 						}       					
 					break;
   					
 				}
 				default: 
 					
 				{
 						
 				
 			        	break;
 						
 				}
 				
 			}
	}
	public void ShowHim()
 		
 	{
 		
 		if(name != "")
 		
 		{
 			
 			System.out.println("Student " + name + " has: ");
 			
 			for(int i=0;i<this.courses.size();i++)
 			
 			{
 				Discipline dis= Discipline.MATH;
 				Course cs = new Course(dis);	
 				cs = this.courses.get(i);
 				
 				System.out.println("Course " + cs.dis.toString() + " with grade: " + cs.dis.getGrade());
 				
 			}
 		
 		}
 		
 	
}

		

}

	 