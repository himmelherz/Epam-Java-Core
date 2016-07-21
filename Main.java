package javase01.t01.main;
//import javase01.t01.Model;
import java.util.Scanner;
import javase01.t01.notepad.Notepad;
import javase01.t01.log.Log;

public class Main 
{
	
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

}

