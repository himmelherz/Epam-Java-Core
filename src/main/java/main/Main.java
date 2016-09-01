package main;



import group.Group;
import student.Student;
import datas.Datas;
import course.Course;
import java.util.Scanner;


import java.util.Arrays;	

import java.util.*;	
	


public class Main
	
{

	

		
	public static void addGroup(ArrayList<Group> groupes)
		
	{
			
		Scanner scan = new Scanner(System.in);

			
		System.out.println("Enter the group number");

			
		String s = scan.nextLine();
		
		Group new_group = new Group(Integer.parseInt(s));

		//new_group.number = Integer.parseInt(s);

		groupes.add(new_group);
			
	}
	
	public static void addStandart(ArrayList<Group> groupes)
		
	{
			
		Scanner scan = new Scanner(System.in);

			
		//System.out.println("Enter the group number");

			
		//String s = scan.nextLine();
		
		Group new_group = new Group(1);

		//new_group.number = Integer.parseInt(s);

		groupes.add(new_group);


		for(int i=0; i < 3; ++i)
		{
			Student new_student = new Student("Student_" + i);
			
			

			Datas new_course = new Datas(5.0, "math");
			new_student.addCourse(new_course);

			new_course = new Datas(4.0, "english");
			new_student.addCourse(new_course);

			new_course = new Datas(3.0, "it");
			new_student.addCourse(new_course);

			groupes.get(0).addStudent(new_student);
		}
			
	}

	
	

			
		public static void main(String[] args) 
					
		{	
			Scanner scan = new Scanner(System.in);				
		ArrayList<Group> groupes = new ArrayList<Group>();
		

		int counter = 0;		
		while(counter == 0)
			
		{
				
			System.out.println("Enter your request");
				
			String s = scan.nextLine();
				
			switch (s) 
				
			{
    				
							
    				
				case "add group":  
					
				{
						
						
					addGroup(groupes);
         				
					break;
					
				}

				case "add student":  
					
				{
	
					System.out.println("Enter group number");
					 s = scan.nextLine();	
					for(int i = 0; i< groupes.size(); ++i)
					{
						if(groupes.get(i).number == Integer.parseInt(s))
						{
							System.out.println("Enter name");
							String sn = scan.nextLine();
							Student new_student = new Student(sn);
							//new_student.name  = sn;
							groupes.get(i).addStudent(new_student);
							
						}
					}				
					break;
					
				}
				case "add course":  
					
				{
					System.out.println("Enter group number");
					 s = scan.nextLine();	
					for(int i = 0; i< groupes.size(); ++i)
					{
						if(groupes.get(i).number == Integer.parseInt(s))
						{
							System.out.println("Enter Student number");
							String sn = scan.nextLine();
							groupes.get(i).addCourseToStudent(Integer.parseInt(sn));
							
						}
					}
					
         				
					break;
					
				}
				case "show all groupes":  
					
				{
					for(int i = 0; i< groupes.size(); ++i)
					{
						groupes.get(i).printAllGroupInfo();
					}	
						
					   				
					break;
					
				}

				case "find dude":  
					
				{
		
					 groupes.get(i).compareWithOthers();				
					break;
					
				}

				case "standart":  
					
				{
						
					addStandart(groupes);	
					
					break;	
				}
				case "set grade":  
					
				{
						
					System.out.println("Enter group number");
					 s = scan.nextLine();	
					for(int i = 0; i< groupes.size(); ++i)
					{
						if(groupes.get(i).number == Integer.parseInt(s))
						{
							groupes.get(i).setStudentGrade();
							
						}
					}				
					break;
				}
				default: 
					
				{
						
					System.out.println("commands: add student");
						
					System.out.println("          show all groupes");

					System.out.println("          add course");
					System.out.println("          find dude");

	
					System.out.println("          standart");		
			
             	break;
						
				}
				
			}

				
			
}
		
		}






}
	 