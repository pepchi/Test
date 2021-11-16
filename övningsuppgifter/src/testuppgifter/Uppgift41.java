package testuppgifter;

public abstract class Uppgift41 {
	private String name;
	private String personnummer;
	private int timlon;
	private int arbetadeTimmar;
	private int salary;
	
	
	public void setName(String newName) {
		name=newName;
	}
	public String getName() {
		return name;
	}
		
	public void setPersonnummer(String newPNR) {
		personnummer=newPNR;
	}
	public String getPNR() {
		return personnummer;
	}
	public void setTimLon(int newTimLon) {
		timlon=newTimLon;
	}
	public int getTimLon() {
		return timlon;
	}
	public void setArbTim(int newArbTim) {
		arbetadeTimmar=newArbTim;
	}
	public int getArbTim() {
		return arbetadeTimmar;
	}
	public int getSalary() {
		salary=timlon*arbetadeTimmar;
		return salary;
	}
	
	
		
		
		public static void main(String[] args) {
	}
		// TODO Auto-generated method stub

	}


