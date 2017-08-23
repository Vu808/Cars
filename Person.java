/*
 * Notice that this is an ABSTRACT class.
 * No objects are ever created (instantiated) of this class.
 * Instead, it serves as a superclass or other classes for which
 * objects are created.
 */
public abstract class Person {

	private String firstName;
	private String lastName;
	
	/*
	 * constructor for the person class
	 * 
	 * Notice the use of the "this" keyword
	 * "this" refers to the object being created
	 */
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	/*
	 * getters and setters
	 */
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
