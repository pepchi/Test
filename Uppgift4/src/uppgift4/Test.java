package uppgift4;

public class Test {

	public static void main(String[] args) {
		Konto b=new Konto();
		b.setBalance(1000);
		b.setNbr("100");
		System.out.println("Saldo "+b.getBalance());
		System.out.println("Nummer "+b.getNbr());
		b.credit(100);
		System.out.println("Saldo "+b.getBalance());
		b.withdraw(35);
		System.out.println("Saldo "+b.getBalance());
	}

}
