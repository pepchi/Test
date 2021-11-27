package application;

public class Account {
	private String nbr;
	private double balance;

	public String getNbr() {
		return this.nbr;
	}

	public void setNbr(String nbr) {
		this.nbr = nbr;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void credit(double amount) {
		this.balance = this.getBalance() + amount;
	}

	public void withdraw(double amount) {
		if (this.balance < amount) {
			System.out.println("Inte tillräckligt med pengar");
		} else {
			this.balance = this.getBalance() - amount;
		}
	}
	public Account(String nbr, double balance) {
		this.setNbr(nbr);
		this.setBalance(balance);
	}

}
