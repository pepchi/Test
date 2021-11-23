package Uppgift2;
import java.util.*;
public class Uppgift2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		boolean talet=true;
		while (talet) {
			System.out.print("Skriv ditt fösta tal: ");
			int tal1=sc.nextInt();
			if (tal1==0) {
				System.out.println("Slut");
				talet=false;
		}else if (tal1!=0) {
			System.out.print("Skriv ditt andra tal: ");
		}	int tal2=sc.nextInt();
			if (tal1>tal2) {
				System.out.println(tal1+" är större än "+tal2);
		}	else if (tal1<tal2) {
				System.out.println(tal2+" är större än "+tal1);
		}	else 
				System.out.println("Talen är lika stora");
			}
		
			System.out.println("Slut");			
	}

}
