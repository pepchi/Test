package application;

import java.util.ArrayList;

public class Person {
	private String pNbr;
	private String name;
	private ArrayList<Account> accounts = new ArrayList<Account>();

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

	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}

	public void addAccount(Account a) {
		this.getAccounts().add(a);
	}

	public Account findAccount(String accountNbr) {
		for (Account e : this.getAccounts()) {
			if (accountNbr.equals(e.getNbr())) {
				return e;
			}
		}
		return null;
	}

	public double totBalance() {
		double sum = 0;
		for (Account e : getAccounts()) {
			sum += e.getBalance();
		}
		return sum;
	}
	public Person(String pnbr, String nName) {
		this.setpNbr(pNbr);
		this.setName(name);
	}

}
