package ExTenta;

import java.util.HashMap;

public class Parkingspace {
	private int nbr;
	private double rent;
	private String type;
	private HashMap<String, Car> cars = new HashMap<String, Car>();// String e key f�r d e {id}
	private Parking parking;

	public void setNbr(int nbr) {
		this.nbr = nbr;
	}

	public int getNbr() {
		return this.nbr;
	}

	public double getRent() {
		return rent;
	}

	public void setRent(double rent) {
		this.rent = rent;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public HashMap<String, Car> getCars() {
		return cars;
	}

	public void setCars(HashMap<String, Car> list) {
		this.cars = list;
	}

	public Parking getParking() {
		return parking;
	}

	public void setParking(Parking p) {
		this.parking = p;
	}
	public void add(Car c) {
		this.getCars().put(c.getRegNbr(),c); //regnr e id d�rav key
	}
	public Car find(String regNbr) {
		return this.getCars().get(regNbr);
	}
	public String getParkingName() {
		this.getParking().getName(); //g�r via parking och kallar in dess metod f�r namn och g�r en metod h�r f�r det
	}
	
	

}// klass
