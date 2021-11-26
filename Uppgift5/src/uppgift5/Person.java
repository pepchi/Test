package uppgift5;

import java.util.HashMap;

public class Person {
	private String pNbr;
	private String name;
	private HashMap<String, Account> accounts = new HashMap<String, Account>();
	Account acc = new Account();
	
	public String getpNbr() {
		return pNbr;
	}

	public void setpNbr(String pNbr) {
		this.pNbr = pNbr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public HashMap<String, Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(HashMap<String, Account> accounts) {
		this.accounts = accounts;
	}
	
	public void  addAccount(Account a) {
		 this.getAccounts().put(null, a);
	}
	public Account findAccount(String accountNbr) {
		return this.getAccounts().get(accountNbr);
	}
	public double totBalance() {
		double sum=0;
		for (Account e:accounts.values()) {
			sum += e.getBalance();
		}
		return sum;
	}
	
	
}
