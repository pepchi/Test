package uppgift4;
import java.util.*;
public class Bankkonto {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Konto a = new Konto();
		a.setAmount(1000);
		a.setBalance(200);
		a.setNbr("1");
		System.out.println(a.getAmount());
		System.out.println(a.getBalance());
		System.out.println(a.getNbr());
		
			System.out.print("Insättning(0)eller Uttag(1)? ");
			int svar1=sc.nextInt();
			if (svar1==0) {
				System.out.print("Ange belopp ");
				double belopp=sc.nextDouble();
				a.setAmount(belopp);
				a.credit(belopp);
				System.out.println("Saldo: "+a.getBalance());
				
			}
				//insättning
			else if (svar1==1) {
				System.out.print("Ange belopp ");
				double belopp=sc.nextDouble();
				a.setAmount(belopp);
				a.withdraw(belopp);
				System.out.println("Saldo: "+a.getBalance());
				//uttag
			}
			

			
		boolean nej = true;
		while (nej) {
			System.out.println("Vill du avsluta? J/N? ");
			sc.nextLine();
			String avslut=sc.nextLine();
			if (avslut.equalsIgnoreCase("n")) {
				System.out.print("Insättning(0)eller Uttag(1)? ");
				int svar=sc.nextInt();
				if (svar==0) {
					System.out.print("Ange belopp ");
					double belopp=sc.nextDouble();
					a.setAmount(belopp);
					a.credit(belopp);
					System.out.println("Saldo: "+a.getBalance());
				
					}
				//insättning
				if (svar==1) {
					System.out.print("Ange belopp ");
					double belopp=sc.nextDouble();
					a.setAmount(belopp);
					a.withdraw(belopp);
					System.out.println("Saldo: "+a.getBalance());
				//uttag
				}
			}
			else {
				nej=false;
				System.out.print("Saldo: "+a.getBalance());
			}
			

		}//while
}//main
}//klass
