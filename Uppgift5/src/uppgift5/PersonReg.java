package uppgift5;

import java.util.HashMap;

public class PersonReg {
	private HashMap<String, Person> persons = new HashMap<String, Person>();
	Account acc = new Account();
	Person per = new Person();
	
	public HashMap<String, Person> getPersons() {
		return persons;
	}
	public void setPersons(HashMap<String, Person> persons) {
		this.persons = persons;
	}
	
	public void addPersons(Person p) {
		this.getPersons().put(null, p);
	}
	public Person findPerson(String pNbr) {
		return this.getPersons().get(pNbr);
	}
	public Person removePerson(String pNbr) {
		return this.getPersons().remove(pNbr);
	}
	
	public Account findAccount(String pNbr, String accountNbr) {
		Person p = findPerson(pNbr);
		return p.findAccount(accountNbr);
		}

	public double totBalancePerson(String pNbr) {
		Person p=findPerson(pNbr);
		return p.totBalance();
	}
	
	
}//klass
