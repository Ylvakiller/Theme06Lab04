package project1;

public class Truck extends Vehicle {

	/**
	 * The amount that can be loaded on this truck
	 */
	double loadCapacity;
	
	/**
	 * The amount that this truck can tow
	 */
	double towingCapacity;
	
	public Truck() {
		super();
		loadCapacity = 0;
		towingCapacity = 0;
	}

	public Truck(String manufacturersName) {
		super(manufacturersName);
		loadCapacity = 0;
		towingCapacity = 0;
	}

	public Truck(int numberOfCylinders) {
		super(numberOfCylinders);
		loadCapacity = 0;
		towingCapacity = 0;
	}

	public Truck(Person owner) {
		super(owner);
		loadCapacity = 0;
		towingCapacity = 0;
	}
	
	public Truck(double loadCapacity, double towingCapacity){
		super();
		this.loadCapacity = loadCapacity;
		this.towingCapacity = towingCapacity;
	}
	public Truck(String manufacturersName, int numberOfCylinders, Person owner, double loadCapacity, double towingCapacity) {
		super(manufacturersName, numberOfCylinders, owner);
		this.loadCapacity = loadCapacity;
		this.towingCapacity = towingCapacity;
	}

}
