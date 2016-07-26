package main;
 import java.util.Scanner;
 
 import java.util.Arrays;	
 import java.util.*;	

import atomicsubmarine.AtomicSubmarine;


public class Main{
	public static void main(String[] args) 
 					
	{
		AtomicSubmarine yellow_submarine = new AtomicSubmarine();
		for(int i = 0; i < 800; i++)
		{
			for(int z=0; z < 200; z++)
			System.out.println("");
			
			yellow_submarine.engine.goAhead();

			

			System.out.println("");

			for(int j = 0; j < yellow_submarine.position; j++)
			System.out.print(" ");
			if(yellow_submarine.direction != 1)
					System.out.print("  _|```| ");
			else
			System.out.print(" |```|_");

			System.out.println("");
			for(int j = 0; j < yellow_submarine.position; j++)
			System.out.print(" ");

			if((yellow_submarine.direction != 1) )
				if(yellow_submarine.position % 2 == 0)
					System.out.print("x(<><><>)");
				else
					System.out.print("-(<><><>)");
			else
			if((yellow_submarine.direction == 1) )
				if(yellow_submarine.position % 2 == 0)
					System.out.print("(<><><>)x");
				else
					System.out.print("(<><><>)-");
			System.out.println("");


			//System.out.println(yellow_submarine.direction + "   " + yellow_submarine.position);
			try 
			{
   				Thread.sleep(200);
   				// any action
			} 
			catch (InterruptedException e) 
			{
   				e.printStackTrace();
			}
		}
		
	}
}