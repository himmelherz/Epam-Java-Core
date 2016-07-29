package main;

import course.Course;


import student.Student;


import java.util.Scanner;


import java.util.Arrays;	

import java.util.*;	
	


public class Main
	
{

	

		
	public static void addCourse(ArrayList<Course> courses)
		
	{
			
		Scanner scan = new Scanner(System.in);

			
		System.out.println("Enter the course name");

			
		String s = scan.nextLine();

			
		switch (s) 
				
			
		{
    	
			case "math": 
			{
		
					
				Course course = Course.MATH;
				courses.add(course);			
				System.out.println("course was created");
   
	
				System.out.println("___________________");          
				break;
	
			}

		
			case "english":  
	
			{
				Course course = Course.ENGLISH;		
				courses.add(course);		
				System.out.println("course was created");
   

				System.out.println("___________________");        
				break;
		
			}

		
			case "it":  

			{
		

					Course course = Course.IT;				
						
					courses.add(course);					
					System.out.println("course was created");
   
					System.out.println("___________________");          				
					break;
					
				}

				default: 
					
				{
						
							
			
             	break;
						
				}
				
			}


			
		}
			
		public static void main(String[] args) 
					
		{	
						
			ArrayList<Course> courses = new ArrayList<Course>();			
			
			
				
					
		Scanner scan = new Scanner(System.in);
	
		
int counter = 0;		
		while(counter == 0)
			
		{
				
			System.out.println("Enter your request");
				
			String s = scan.nextLine();
				
			switch (s) 
				
			{
    				
							
    				
				case "add course":  
					
				{
						
						
					addCourse(courses);
         				
					break;
					
				}

				case "add student":  
					
				{
	
					System.out.println("What course?");
				
					s = scan.nextLine();

					switch(s)
					{
						case "math":
						{
							for(int i = 0; i < courses.size(); i++)
							{
								//Course course = courses.get(i)
								if(courses.get(i).equals(Course.MATH))
								{
									Course course = courses.get(i);
									course.addStudent();
									courses.set(i, course);
								}
							}
							break;
						}
						case "english":
						{
							for(int i = 0; i < courses.size(); i++)
							{
								//Course course = courses.get(i)
								if(courses.get(i).equals(Course.ENGLISH))
								{
									Course course = courses.get(i);
									course.addStudent();
									courses.set(i, course);
								}
							}
							break;
						}
						case "it":
						{
							for(int i = 0; i < courses.size(); i++)
							{
								//Course course = courses.get(i)
								if(courses.get(i).equals(Course.IT))
								{
									Course course = courses.get(i);
									course.addStudent();
									courses.set(i, course);
								}
							}
							break;
						}
					}     
					System.out.println("___________________");  				
					break;
					
				}

				case "show all courses":  
					
				{
						
						
					for(int i=0; i< courses.size(); i++)
					
{
						Course course = courses.get(i);
						course.showAllStudents();
					}  
					System.out.println("___________________");      				
					break;
					
				}

				case "find dude":  
					
				{
		
					ArrayList<Student> dude = new ArrayList<Student>();
					
					System.out.println("What's his name?");
				
					s = scan.nextLine();
	
					System.out.println("Student " + s + " has: "); 			
						
					for(int i=0; i< courses.size(); i++)
					
{
						Course course = courses.get(i);
						for(int j=0; j < course.getList().size(); j++)
						{
							if((course.getList().get(j)).name.equals(s))
							{
								dude.add(course.getList().get(j));
								System.out.println(course.getName() + " with " + course.getList().get(j).getGrade()  + " grade ");
							}
						}

					}  
					
					System.out.println("___________________");      				
					break;
					
				}

				case "standart":  
					
				{
						
						
					addCourse(courses);

					addCourse(courses);

					addCourse(courses);
    
					for(int z= 0; z< 2;z++)
					{
							for(int i = 0; i < courses.size(); i++)
							{
								//Course course = courses.get(i)
								if(courses.get(i).equals(Course.MATH))
								{
									Course course = courses.get(i);
									course.addStudent();
									courses.set(i, course);
								}
							}
							 				
					}
					for(int z= 0; z< 2;z++)
					{
							for(int i = 0; i < courses.size(); i++)
							{
								//Course course = courses.get(i)
								if(courses.get(i).equals(Course.IT))
								{
									Course course = courses.get(i);
									course.addStudent();
									courses.set(i, course);
								}
							}
							 				
					}
					for(int z= 0; z< 2;z++)
					{
							for(int i = 0; i < courses.size(); i++)
							{
								//Course course = courses.get(i)
								if(courses.get(i).equals(Course.ENGLISH))
								{
									Course course = courses.get(i);
									course.addStudent();
									courses.set(i, course);
								}
							}
							 				
					}
					System.out.println("___________________");
					break;
					
				}

				default: 
					
				{
						
					System.out.println("commands: add student");
						
					System.out.println("          show all students");

					System.out.println("          add course");
					System.out.println("          find dude");

	
					System.out.println("          standart");		
			
             	break;
						
				}
				
			}

				
			
		}
        
		
	}






}
	 