package uppgift4;

public class Konto {
	private String nbr;
	private double balance;
	
	
	public void setNbr(String nbr) {
		this.nbr=nbr;
	}
	public String getNbr() {
		return this.nbr;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public double getBalance() {
		return this.balance;
	}
	public void credit(double amount) {
		this.balance=this.getBalance()+amount;	
	}
	public void withdraw(double amount) {
		if (this.balance<amount) {
			System.out.println("Inga pengar");
		}
		else {
		this.balance=this.getBalance()-amount;
		}
	}


	}


