package uppgift4;
import java.util.*;
public class Konto1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Konto a = new Konto();
		a.setBalance(1000);
		a.setNbr("a");
		String avslut="n";
		while (avslut.equals("n")) {
			System.out.println("Insättning(0) eller Uttag(1)?");
			int svar=sc.nextInt();
			System.out.println("Ange belopp ");
			int belopp=sc.nextInt();
			if (svar==0) {
				a.credit(belopp);
			}
			else {
				a.withdraw(belopp);
			}
			System.out.println("Saldo "+a.getBalance());
			System.out.println("Vill du avsluta? j/n");
			avslut=sc.next();
			
		}
		if (avslut.equals("j")) {
			System.out.println("Saldo "+a.getBalance());
		}
		else {
			System.out.println("Fel input");
			System.out.println("Vill du avsluta? j/n");
			avslut=sc.next();
			
		}
		sc.close();
	}
}
