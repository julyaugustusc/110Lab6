public class Person{

	// declare some variables of different types:
	// an string called firstname
	private String firstName;
	// a string called lastname
	private String lastName;
	// an int called birthYear
	private int birthYear;

	// Defining the constructor

	public Person (String fname, String lname, int year) {
		this.firstName = fname;
		this.lastName = lname;
		this.birthYear = year;
	}
	
	// Supply the methods
	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public int getAge(int currentYear) {
		return currentYear - this.birthYear;
	}

}