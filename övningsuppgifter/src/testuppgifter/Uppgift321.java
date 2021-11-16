package testuppgifter;
import java.util.*;
public class Uppgift321 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int highest=0;
		int []talen= new int [5];
		for (int i=0;i<5;i++) {
			System.out.println("Skriv tal "+(i+1));
			 talen[i]=sc.nextInt();
			 if (talen[i]>highest) {
				 highest=talen[i];
		}
			 
			 }
		System.out.println("Högsta talet är "+highest);
		}


	}


