package main;

import officesupply.OfficeSupply;

import worker.Worker;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;	
	

public class Main

	{

	
		public static void addWorker(ArrayList<Worker> worker)
	
		{
		
		
			Scanner scan = new Scanner(System.in);
		
			System.out.println("Enter name of worker: ");
				
			String s = scan.nextLine();
				
			Worker new_worker = new Worker();
			new_worker.name = s;
				
			worker.add(new_worker);
			
	
		}

	
		public static void main(String[] args) 
					
		{	Scanner scan = new Scanner(System.in);
		
			int counter = 0;
			

			ArrayList<Worker> worker = new ArrayList<Worker>();
				

			
		while(counter == 0)
			
		{
				
			System.out.println("Enter your request");
				
			String s = scan.nextLine();
				
			switch (s) 
				
			{
    				
				case "show all workers":  
					
				{
						
					for(int i=0;i<worker.size();i++)
						
					{
							
						worker.get(i).showHim();
						
					}
             				System.out.println("***Done!***");	
					break;
					
				}
				
    				
				case "add worker":  
					
				{
						
						
					addWorker(worker);
						
					System.out.println("Worker was created");
             				System.out.println("***Done!***");
					break;
					
				}
				
				case "show worker cost":  
					
				{
						
					System.out.println("What number?");
						
					s = scan.nextLine();
						
					worker.get(Integer.parseInt(s)).allCost();
             					System.out.println("***Done!***");
					break;
					
				}
    
				case "add item":  
					
				{
						
					System.out.println("What number?");
						
					s = scan.nextLine();
						
					worker.get(Integer.parseInt(s)).addItem();
             				System.out.println("***Done!***");	
					break;
					
				}
 	
				case "add beginner stuff":  
					
				{
						
					System.out.println("What number?");
						
					s = scan.nextLine();
					
					worker.get(Integer.parseInt(s)).addBeginnerStuff();
					
             				System.out.println("***Done!***");	
					break;
					
				}
 	
				case "sort worker":  
					
				{
	
					System.out.println("What number?");
						
					String n = scan.nextLine();
						
					System.out.println("How do you wnat to sort?");
						
					s = scan.nextLine();
						
					worker.get(Integer.parseInt(n)).sortBy(s);
             				System.out.println("***Done!***");	
					break;
					
				}
 
				case "standart":  
					
				{
	
					addWorker(worker);

					System.out.println("What number?");
						
					s = scan.nextLine();
						
					worker.get(Integer.parseInt(s)).addBeginnerStuff();
               				System.out.println("***Done!***");	
					break;
					
				}
 		
				default: 
					
				{
						
					System.out.println("commands: add worker");
						
					System.out.println("          show all workers");
						
					System.out.println("          show worker cost");

					System.out.println("          add item");

					System.out.println("          add beginner stuff");
	
					System.out.println("          sort worker");

					System.out.println("          standart");		
			
             	break;
						
				}
				
			}

				
			
		}
        
		
	}






}
	 