package uppgift4;

public class Konto {
	private String nbr;
	private double balance;
	private double amount;
	
	
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
	public void setAmount(double amount) {
		this.amount=amount;
	}
	public double getAmount() {
		return this.amount;
	}
	
	public void credit(double amount) {//newBalance
		this.balance=this.balance+amount;	
	}
	
	
	
	public void withdraw(double amount) {
		this.balance=this.balance-this.getAmount();
	}
	


	}


