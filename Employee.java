
public class Employee extends Person {

	private int employeeID;
	private String officeLocation;
	
	public Employee(String firstName, String lastName, int employeeID, String officeLocation) {
		super(firstName, lastName);
		// Notice the use of the "this" keyword again
		this.employeeID = employeeID;
		this.officeLocation = officeLocation;
	}
	
	/*
	 * setters and getters
	 */
	public int getEmployeeID() {
		return employeeID;
	}
	
	public String getOfficeLocation() {
		return officeLocation;
	}
	
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	
	public void setOfficeLocation(String officeLocation) {
		this.officeLocation = officeLocation;
	}
	
	/*
	 * equals method to test for the equality of two objects
	 */
	public boolean equals(Employee employee2) {
		boolean objectsEqual;
		/*
		 * Notice the use of "this" again.
		 * "this" refers to the object calling the equals method.
		 */
		boolean condition1 = this.getFirstName().equals(employee2.getFirstName());
		// Remember that the String class has its own built-in equals method.
		boolean condition2 = this.getLastName().equals(employee2.getLastName());
		boolean condition3 = (this.getEmployeeID() == employee2.getEmployeeID());
		boolean condition4 = (this.getOfficeLocation() == employee2.getOfficeLocation());
		if (condition1 && condition2 && condition3 && condition4) {
			objectsEqual = true;
		} else {
			objectsEqual = false;
		}
		return objectsEqual;
	}
}
