/* Car.java
// 
// Author: Trevon Faison
// Date: 5/2/2022
*/

public class Car extends Vehicle {
	
	private int doors;
	private int passenger;
	
	public Car(String aMake, String aModel, String aPlate, int theDoors, int 
		thePassengers) {
		super(aMake, aModel, aPlate);
		this.doors = theDoors;
		this.passenger = thePassengers;
	}
	
	public int getDoors() {
		return this.doors;
	}
	
	public int getPassengers() {
		return this.passenger;
	}
	
	@Override
	public String toString() {
		String result = String.format("d-door %s with license %s.", this.doors,
			super.getMake(), super.getModel(), super.getPlate());
		return result;
	}
	
	@Override
	public boolean equals(Object other) {
		if(!(other instanceof Car)) {
			return false;
		}
		
		Car otherCar = (Car) other;
		if(this.doors == otherCar.getDoors() && this.passenger ==
			otherCar.getPassengers()) {
			super.equals(other);
		}
		return false;
	}
	
	public Car copy () {
		Car theCopy = new Car(super.getMake(), super.getModel(), super.getPlate(),
			this.doors, this.passenger);
		return theCopy;
	}
}
			
	