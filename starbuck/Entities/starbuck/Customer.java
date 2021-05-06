package starbuck;

public class Customer implements IEntity{
	
	int id;
	String firstName;
	String lastName;
	int year;
	long identity;
	public Customer(long identity, String firstName, String lastName,int id ,int year) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identity = identity;
		this.year=year;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getIdentity() {
		return identity;
	}
	public void setIdentity(long identity) {
		this.identity = identity;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}
