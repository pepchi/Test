package ExTenta;

import java.util.ArrayList;

public class Parking {
	private String adress;
	private String name;
	private ArrayList<Parkingspace>parkingspaces = new ArrayList<Parkingspace>();
	
	public void setAdress(String adress) {
		this.adress=adress;
	}
	public String getAdress() {
		return this.adress;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public ArrayList<Parkingspace> getParkingspaces() {
		return parkingspaces;
	}
	public void setParkingspaces(ArrayList<Parkingspace> parkingspaces) {
		this.parkingspaces = parkingspaces;
	}
	public  void add(Parkingspace p) {
		this.getParkingspaces().add(p);
	}
	public Parkingspace find(int nbr) {
		for (Parkingspace p: this.getParkingspaces()) {
			if (nbr==p.getNbr()) {
				return p;
			}
		}
		return null;
	}
	public Parkingspace findParkingspaceForCar(String regNbr) {//Car.values i hashmap
		for(Parkingspace p : this.getParkingspaces()) {
			Car c = p.find(regNbr);
			if (c != null) {
				return p;
			}
		}
		return null;
	}
	
	public double totRent() {
		double sumRent=0;
		for (Parkingspace p: this.getParkingspaces()) {
			if (p.getCars().size()>0) {//om det finns bil så addera rent till summan (bilar i parkeringslistan)
				sumRent+=p.getRent();
			}
		}
		return sumRent;
	}
	
	
	
}//klass
