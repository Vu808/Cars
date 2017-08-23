
public class Tester {

	public static void main(String[] args) {
		Employee alice = new Employee("Alice", "Adams", 1, "Honolulu");
		Employee bob = new Employee("Bob", "Brown", 2, "Hilo");
		Employee alice2 = new Employee("Alice", "Adams", 1, "Honolulu");
		Employee alice3 = new Employee("Alice", "Adams", 2, "Honolulu");
		
		// Can we use the == to test for equality between 2 objects?
		System.out.println(alice == alice2);
		// Using the equals method should work.
		System.out.println(alice.equals(alice2));
		System.out.println(alice.equals(alice3));
		// Showing the use of a getter method
		alice3.setEmployeeID(1);
		// Now they should be equal.
		System.out.println(alice.equals(alice3));
	}
}
