package application;

import java.util.ArrayList;

public class PersonReg {
	private ArrayList<Person> persons = new ArrayList<Person>();

	public ArrayList<Person> getPersons() {
		return persons;
	}

	public void setPersons(ArrayList<Person> persons) {
		this.persons = persons;
	}

	public void addPersons(Person p) {
		this.getPersons().add(p);
	}

	public Person findPerson(String pNbr) {
		for (Person e : this.getPersons()) {
			if (pNbr.equals(e.getpNbr())) {
				return e;
			}
		}
		return null;
	}

	public Person removePerson(String pNbr) {
		Person toRemove = this.findPerson(pNbr);
		if (toRemove != null) {
			this.getPersons().remove(toRemove);
		}
		return toRemove;
	}

	public Account findAccount(String pNbr, String accountNbr) {
		Person p = findPerson(pNbr);
		if (p != null) {
			Account a = p.findAccount(accountNbr);
			return a;
		}
		return null;
	}

	public double totBalancePerson(String pNbr) {
		Person p = findPerson(pNbr);
		return p.totBalance();
	}
	public void setPersonName(String pNbr, String newName) {

		Person c = this.findPerson(pNbr);
		if (c != null) {
		c.setName(newName);
		}
		}

}// klass
