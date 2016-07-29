package main;
import java.util.Scanner;
import notepad.Notepad;
import log.Log;
import java.util.ArrayList;

public class Main 
{
	
	public static void main(String[] args) 
		{	
			int k =0;
			Scanner scan = new Scanner(System.in);
			Notepad notepad = new Notepad();
			
	
			
 while (k==0){
		System.out.println("Enter the command");			
		String s = scan.nextLine();
	
		switch (s) 
				
			
		{
    	
			case "add log": 
			{
		
				System.out.println("Enter the Text");
				s = scan.nextLine();
				notepad.addLog(s);       
				System.out.println("*__________________*"); 
				break;
	
			}

			
			case "edit log":  
	
			{
				System.out.println("What number?");
				s = scan.nextLine();
				notepad.editLog(Integer.parseInt(s)); 
				System.out.println("*__________________*");        
				break;
		
			}

		
			case "delete log":  

			{
		

				System.out.println("What number?");
				s = scan.nextLine();
				notepad.deleteLog(Integer.parseInt(s));  
				System.out.println("*__________________*");     				
					break;
					
			}
			case "show logs":  

			{
					notepad.showLogs();  
					System.out.println("*__________________*");    				
					break;
					
			}
					
				default: 
					
			{
						
							
					System.out.println("Commands: add log");
					System.out.println("         edit log");
					System.out.println("       delete log");
					System.out.println("        show logs");
					System.out.println("*__________________*"); 
             				break;
						
			}
				
		}
	}


			
	}


        
}



