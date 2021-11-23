package uppgift1;

import java.text.DecimalFormat;
import java.util.*;

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
			 String name=namn.toUpperCase();
				System.out.print(name+" du har tjänat "+Salary+" kr.");
			
			
			
		
			}	
	}
}				

	


