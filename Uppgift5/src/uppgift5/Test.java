package uppgift5;

public class Test {

	public static void main(String[] args) {
		PersonReg reg = new PersonReg();
		Person p = new Person();
		Account a = new Account();
		Account b = new Account();
		
		reg.addPersons(p);
		//reg.setPersons(null);
		
		a.setBalance(1000);
		a.setNbr("111");
		a.getBalance();
		a.getNbr();
		b.setBalance(200);
		
		p.setName("Kalle");
		p.setpNbr("KK");
		p.getAccounts();
		p.getName();
		p.getpNbr();
		p.getAccounts();
		//p.setAccounts(null);
		p.addAccount(a);
		p.addAccount(b);
		p.findAccount("111");
		p.totBalance();
		
		//System.out.print(a.getBalance());
		System.out.println(p.totBalance());
		System.out.print(p.findAccount("111"));

	}

}
