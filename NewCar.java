
public class NewCar extends Car {
private String color;
	
	public NewCar(double cost, String color) {
		super(cost);
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void display() {
		System.out.println("Price = $" + this.getPrice() + ", color = " + this.getColor());
	}
	
	public boolean equals(NewCar newcar2) {
		boolean carsEqual;
		
		boolean condition1 = this.getPrice() == (newcar2.getPrice());
		boolean condition2 = this.getColor() == (newcar2.getColor());
		
		if (condition1 && condition2) {
			carsEqual = true;
		} else {
			carsEqual = false;
		}
		
		return carsEqual;
	}
}
