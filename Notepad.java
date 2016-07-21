package javase01.t01.notepad;
import javase01.t01.log.Log;
import java.util.Scanner;
	public class Notepad
	{
		public Log logs[];
		public Notepad()
		{
			logs = new Log[10];
			//System.out.print(logs[0]);
			

		}
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
						System.out.println("Writing in Notepad");
					}				
				}
				else if (i == 9)
					{
						System.out.print("Notepad is full!");
					}
				
			}
		}
		
		public void ShowLogs( )
		{
			for(int i = 0; i<10; i++)
			{
						System.out.println(logs[i].text );
				
			}
		}
		public void DeleteLog( int number )
		{
			logs[number].text = "";
			
		}
		public void EditLog( int number )
		{
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter the text ot edit");
			String s = scan.nextLine();
			logs[number].text = s;
			
		}
	}
