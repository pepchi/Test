package uppgift1;
import java.util.*;
public class Uppgift1a {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Skriv ett ord: ");
		String ord1=sc.nextLine();
		System.out.println("Skriv ett ord till: ");
		String ord2=sc.nextLine();
		String ord3=(ord1+" "+ord2);
		System.out.println(ord3);
		System.out.println(ord3.length());
	
	

	}

}
