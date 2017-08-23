
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
		System.out.println("Price = " + this.getPrice() + ", mileage = " + this.getMileage());
	}
}
