/**
 * Notepad is the class which destiny is to create an object "notepad" to 
 * work with it, write some stuff, edit some stuff etc
 * @see       Class#AddLog(String)
 * @author      Himmelherz
 * @version     %I%, %G%
 * @since       1.0
 */


package task1_6.notepad;
//import javase01.t01.log.Log;
import java.util.Scanner;
	



/**
 * Main class to keep text in himself
 */

public class Notepad
{


	 /**
	 * Main class to see everything is working or not. 
 	 * @see Notepad#AddLog(String)
	 * @see Notepad#EditLog(int)
	 * @see Notepad#DeleteLog(int)
	 * @see Notepad#ShowLogs()
	 * @param args 	doing nothing:(
	 */
	
	public static void main(String[] args) 
		{	
			int k =0;
			Scanner scan = new Scanner(System.in);
			Notepad notepad = new Notepad();
			for(int i = 0; i < 10; i++)
			{	
				notepad.logs[i] = new Log();
				notepad.logs[i].text = "";
	
			}
			for(int i = 1; i < 10; i++)
			{	
				notepad.logs[i] = new Log();
				notepad.logs[i].text = "some Text";
	
			}
			System.out.println("Enter the Text");
					String s = scan.nextLine();
					notepad.AddLog(s);
					notepad.EditLog(5);
					notepad.DeleteLog(4);
					notepad.ShowLogs();
			

        
		}



	public Log logs[];

	/**
	 * Constructor to initialize the logs. 
	 */

	public Notepad()
	{
		logs = new Log[10];

	}

	 /**
	 * Method to Add log in Notepad's string logs. 
	 * @param arriving_text	text which must be added
	 */

	public void AddLog(String arriving_text)
	{int k = 0;
		for(int i = 0; i<10; i++)
		{
			if(logs[i].text.equals("") )
			{
				if(k!=1)
				{
					k = 1;
					logs[i].text = arriving_text;	
					System.out.println("Writing in Notepad");					}				
				}
			else if (i == 9)
				{
					System.out.println("Notepad is full!");
				}
				
	  		}
		}

	/**
	 * Method which allows us to print all logs in notepad. 
	 */	

	public void ShowLogs( )
	{
		for(int i = 0; i<10; i++)
		{
					System.out.println(logs[i].text );
			
		}
	}


	/**
	 * Method to Delete log with number from Notepad's logs. 
	 * @param number	number of log in notepad must be deleted
	 */

	public void DeleteLog( int number )
	{
		logs[number].text = "";
		
	}


	/**
	 * Method which helps to Edit some log with number in Notepad's logs. 
	 * @param number	number of log in notepad must be edited
	 */

	public void EditLog( int number )
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the text ot edit");
		String s = scan.nextLine();
		logs[number].text = s;
		
	}
}

	 /**
	 * Class to keep text in string in himself. Contained in Notepad 
 	 * @see Notepad#Constructor()
	 */

 class Log
	{
		public String text;
		public Log()
		{
			text = "";
		}
	} 
	
