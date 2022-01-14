package ExTenta;

public class Car {
	private String regNbr;
	private String brandName;
	private Parkingspace parking;
	
	public String getRegNbr() {
		return regNbr;
	}
	public void setRegNbr(String regNbr) {
		this.regNbr = regNbr;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public Parkingspace getParking() {
		return parking;
	}
	public void setParking(Parkingspace p) {
		this.parking=p;
	}
	public String getParkingName() {
		if (this.getParking() !=null) { //behöver alltid ha if på find
			return this.getParking().getParkingName();
		}
	}
		
		//skaffa åtkomstmetoder genom kopllingar - så getname läggs i
		//space sen tar man getname till car därifrån 	
}
