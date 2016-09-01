package group;

import student.Student;
import course.Course;
import datas.Datas;
import java.util.*;
public class Group
{
	private ArrayList<Student> students ;
	public int number;
	
	public Group(int number)
	{
		students = new ArrayList<Student>();
		this.number = number;
	} 

	public void addStudent(Student new_student)
	{
		students.add(new_student);
	}
	public void printAllGroupInfo()
	{
		System.out.println("Group number " + number + " has: ");
		System.out.println("_________________________________");
		for (int i = 0; i < students.size(); ++i) 
		{ 
			System.out.println( " ** " + students.get(i).getName() + " id: " + i   + " with courses: ");
			students.get(i).printStudentInfo();
			System.out.println(" ");
			
		}
			System.out.println("_________________________________");
	}
	public void setStudentGrade()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the student number");
		String s = scan.nextLine();
		for (int i = 0; i < students.size(); i++) 
		{ 
			if(i == Integer.parseInt(s))
			{
				students.get(i).setGrade();
			}
			
		}
	}
	public void compareWithOthers()
	{
		double all_students = 0.0;
		double better_students = 0.0;
		double worse_students = 0.0;
		double same_students = 0.0;	
		double comparing_grade = 0.0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the student number");
		String s = scan.nextLine();

		for(int i = 0;  i < students.size(); i++)
		{
			if(i != Integer.parseInt(s))
			{
				System.out.println(students.get(Integer.parseInt(s)).compareWith(students.get(i), Course.MATH));
			}
		}
		
			
	}
	public void addCourseToStudent(int student_number)
	{
		for (int i = 0; i < students.size(); i++) 
		{ 
			if(student_number == i)
			{
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter the course name");
				String s = scan.nextLine();
				switch(s)
				{
					case "math":
					{
						

						System.out.println("Enter the grade of student");
						s = scan.nextLine();
						Datas new_course = new Datas(Double.parseDouble(s) , "math");

						Student updated_student = students.get(i);
						updated_student.addCourse(new_course);
						students.set(i, updated_student);
						break;
					}
					case "english":
					{
						System.out.println("Enter the grade of student");
						s = scan.nextLine();
						Datas new_course = new Datas(Double.parseDouble(s) , "english");

						Student updated_student = students.get(i);
						updated_student.addCourse(new_course);
						students.set(i, updated_student);
						break;
					}
					case "it":
					{
						System.out.println("Enter the grade of student");
						s = scan.nextLine();
						Datas new_course = new Datas(Double.parseDouble(s) , "it");

						Student updated_student = students.get(i);
						updated_student.addCourse(new_course);
						students.set(i, updated_student);
						break;
					}
				}
			}
			//else
				//System.out.println("wrong"); 
		}
	}
}