
public class UsedCar extends Car {
 
	private int mileage;
	
	public UsedCar(double cost, int mileage) {
		super(cost);
		this.mileage = mileage;
	}
	
	public int getMileage() {
		return mileage;
	}
	
	public void display() {
		System.out.println("Price = $" + this.getPrice() + ", mileage = " + this.getMileage());
	}
	
	public boolean equals(UsedCar usedcar2) {
		boolean carsEqual;
		
		boolean condition1 = this.getPrice() == (usedcar2.getPrice());
		boolean condition2 = this.getMileage() == (usedcar2.getMileage());
		
		if (condition1 && condition2) {
			carsEqual = true;
		} else {
			carsEqual = false;
		}
		
		return carsEqual;
	}
}
