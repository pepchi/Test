package org.lu.ics.labbar;
import java.util.*;
import java.text.DecimalFormat;

public class Uppgift1b {

		public static void main(String[] args) {
			final DecimalFormat dfTwo = new DecimalFormat("#.00");{ 
			Scanner sc= new Scanner(System.in);
			System.out.print("Vad är ditt namn? ");
			String namn= sc.nextLine();
			System.out.print("Vad är din timlön? ");
			String l= sc.nextLine();
			float pay = Float.valueOf(l);
			System.out.print("Hur många timmar har du jobbat?");
			String h= sc.nextLine();
			float hour = Float.valueOf(h);
			 String Salary =dfTwo.format(pay*hour);
				System.out.print(namn+" du har tjänat "+Salary+" kr.");
			
			
			
		
			}	
	}
	}				

