package entity;

public class Person {
	int personId;
	String PersonName;
	double accountBal;
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return PersonName;
	}
	public void setPersonName(String personName) {
		PersonName = personName;
	}
	public double getAccountBal() {
		return accountBal;
	}
	public void setAccountBal(double accountBal) {
		this.accountBal = accountBal;
	}
	public Person(int personId, String personName, double accountBal) {
		super();
		this.personId = personId;
		PersonName = personName;
		this.accountBal = accountBal;
	}
	

}
