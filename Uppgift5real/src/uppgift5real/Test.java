package uppgift5real;

public class Test {

	public static void main(String[] args) {
		PersonReg reg = new PersonReg();
		Person p1 = new Person();
		p1.setName("Kalle");
		p1.setpNbr("KK");

		Person p2 = new Person();
		p2.setName("Johan");
		p2.setpNbr("JL");

		Account a = new Account();
		a.setBalance(1000);
		a.setNbr("111");
		a.credit(200);
		p1.addAccount(a);

		Account a2 = new Account();
		a2.setBalance(200);
		a2.setNbr("123");
		a2.withdraw(86);
		p1.addAccount(a2);

		Account a3 = new Account();
		a3.setBalance(2320);
		a3.setNbr("165");
		a3.credit(57);
		p2.addAccount(a3);

		Account a4 = new Account();
		a4.setBalance(965);
		a4.setNbr("999");
		a4.credit(84);
		a4.withdraw(35);
		p2.addAccount(a4);

		reg.addPersons(p1);
		reg.addPersons(p2);

		System.out.println("Namn: " + p1.getName() + "\n" + "Personnr: " + p1.getpNbr() + "\n" + "Saldo konto: "
				+ p1.totBalance() + "\n");
		System.out.println("Namn: " + p2.getName() + "\n" + "Personnr: " + p2.getpNbr() + "\n" + "Saldo konto: "
				+ p2.totBalance() + "\n");

		// PersonReg
		Person k = reg.findPerson("KK");
		if (k != null) {
			System.out.println("Personen Kalle Hittad");
		}
		Person p3 = new Person();//addera person 3
		reg.addPersons(p3);
		p3.setName("Boris");
		p3.setpNbr("BJ");
		
		Account a5 = new Account();
		a5.setNbr("666");
		a5.setBalance(5376);
		p3.addAccount(a5);

		System.out.printg("Personregistret innehåller följande personer:");
		for (Person p : reg.getPersons()) {//Skriv ut alla personer och deras info från listan
			System.out.println("\n"+"Namn: " + p.getName() + "\n" + "Personnummer: " + p.getpNbr() + "\n" + "Antal konton: "
					+ p.getAccounts().size() + "\n" + "Saldo: " + p.totBalance());
		}
		
		Account t = reg.findAccount("BJ", "666");
		if (t != null) {
			System.out.println("Detta konto hittades " + t.getNbr());
		}
		else {
			System.out.println("Kontot inte hittat");
		}
		
		Person u = reg.removePerson("BJ");//ta bort från lista
		if (u!=null) {
			System.out.println("Personen borttagen från listan: " + u.getName()+" "+u.getpNbr());

		}
		for (Person p : reg.getPersons()) {//Skriv ut alla personer och deras info från listan
			System.out.println("Namn " + p.getName() + "\n" + "Personnummer: " + p.getpNbr() + "\n" + "Antal konton "
					+ p.getAccounts().size() + "\n" + "Saldo: " + p.totBalance());
		}
			
		Account p = reg.findAccount("KK", "123");//hitta konto i register
		if (p != null) {
			System.out.println("Konto hittat: " + p.getNbr());
		}
		else {
			System.out.println("Kontot hittades inte");
		}
		System.out.println(p1.getName()+"s"+" totala saldo är: " + reg.totBalancePerson(p1.getpNbr()));
		
		Account c = p1.findAccount("111");//hitta konoto hos personen med saldo
		if (c != null) {
			System.out.println("Konto hittat: " + c.getNbr() + " med saldot " + c.getBalance());
		}

	}// main
}// klass
