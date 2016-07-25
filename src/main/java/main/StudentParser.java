package studentparser;

import discipline.Discipline;

import student.Student;

import java.util.Scanner;

	
	

public class StudentParser
	{

	
		public static void AddStudent(Student[] student)
	
		{
		
		
			Scanner scan = new Scanner(System.in);
		
			int k =0;
		
			for(int i=0; i< student.length;i++)
		
			{
			
			
				if(student[i].name.equals("") && (k == 0))
			
				{
				
					k = 1;
				
					System.out.println("Enter name of student: ");
				
					String s = scan.nextLine();
				
					student[i].name = s;
				
					//student[i].Fill();
			
				}
		
			}
	
		}

	
		public static void main(String[] args) 
					
		{	
			int counter = 0;
			
						
			
			Student student[] = new Student[100];
				
		
				
			for(int i=0;i<100;i++)
						
			{
							
				student[i] = new Student();
						
			}
			
		Scanner scan = new Scanner(System.in);
			
		while(counter == 0)
			
		{
				
			System.out.println("Enter your request");
				
			String s = scan.nextLine();
				
			switch (s) 
				
			{
    				
							
    				
				case "add student":  
					
				{
						
						
					AddStudent(student);
						
					System.out.println("student was created");
   
					System.out.println("___________________");          				
					break;
					
				}

				case "show all students":  
					
				{
						
						
					for(int i=0;i<10;i++)
 						
 					{
 							
 						student[i].ShowHim();
 						
 					}
              					
					break;					
				}

				case "add course":  
					
				{
	
					System.out.println("What number of student?");
				
					s = scan.nextLine();
					
						
					
 						student[Integer.parseInt(s)].AddDiscipline();
					System.out.println("course was added");
   
					System.out.println("___________________");     
 						
					break;					
				}

				case "set grade":
				{
					System.out.println("What number of student?");
				
					s = scan.nextLine();
					
						
					
 					student[Integer.parseInt(s)].setGrade();
					
				}
				default: 
					
				{
						
					System.out.println("commands: add student");
						
					System.out.println("          show all students");
						
					System.out.println("          show student cost");

					System.out.println("          add discipline");

					System.out.println("          add beginner stuff");
	
					System.out.println("          sort student");

					System.out.println("          standart");		
			
             	break;
						
				}
				
			}

				
			
		}
        
		
	}






}
	 