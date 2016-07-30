
package notepad;
import java.util.Scanner;
import log.Log;	
import java.util.ArrayList;


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

	 ArrayList<Log> logs;
	/**
	 * Constructor to initialize the logs. 
	 */

	public Notepad()
	{
		logs = new ArrayList<Log>();

	}

	 /**
	 * Method to Add log in Notepad's string logs. 
	 * @param arriving_text	text which must be added
	 */

	
	

	public void addLog(String arriving_text)
	{
			Log new_log = new Log();
			new_log.setText(arriving_text);	
			logs.add(new_log);
			System.out.println("Writing in Notepad");									
			
	}

	/**
	 * Method which allows us to print all logs in notepad. 
	 */
	public void showLogs()
	{
		for(int i = 0; i<logs.size(); i++)
		{
			Log new_log = new Log();
			new_log = logs.get(i);
			System.out.println(new_log.getText());
			
		}
	}


	/**
	 * Method to Delete log with number from Notepad's logs. 
	 * @param number	number of log in notepad must be deleted
	 */

	public void deleteLog( int number )
	{
		logs.remove(number);
		
	}


	/**
	 * Method which helps to Edit some log with number in Notepad's logs. 
	 * @param number	number of log in notepad must be edited
	 */

	public void editLog( int number )
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the text to edit");
		String s = scan.nextLine();
		Log new_log = new Log();
		new_log.setText(s);
		if(logs.size() >= number)
		{
			logs.set(number, new_log);
		}
		else
		{
			System.out.println("no such  log!");
		}
		
	}
}


