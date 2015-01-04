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
	
	/**
	 * Default constructor, uses the default constructor of the Vehicle class
	 * Sets the loadCapacity and towingCapacity to 0
	 */
	public Truck() {
		super();
		loadCapacity = 0;
		towingCapacity = 0;
	}

	/**
	 * Uses the constructor from the Vehicle class that sets the manufacturersName
	 * Sets the loadCapacity and towingCapacity to 0
	 * @param manufacturersName the name to set for the manufacturer
	 */
	public Truck(String manufacturersName) {
		super(manufacturersName);
		loadCapacity = 0;
		towingCapacity = 0;
	}

	/**
	 * Uses the constructor from the Vehicle class that sets the number of cylinders
	 * Sets the loadCapacity and towingCapacity to 0
	 * @param numberOfCylinders the number of cylinders to set
	 */
	public Truck(int numberOfCylinders) {
		super(numberOfCylinders);
		loadCapacity = 0;
		towingCapacity = 0;
	}

	/**
	 * Uses the constructor from the Vehicle class that sets the owner
	 * Sets the loadCapacity and towingCapacity to 0
	 * @param owner the owner to set
	 */
	public Truck(Person owner) {
		super(owner);
		loadCapacity = 0;
		towingCapacity = 0;
	}
	
	/**
	 * Uses the default constructor of the Vehicle class
	 * @param loadCapacity the load capacity to set
	 * @param towingCapacity the towing capacity to set
	 */
	public Truck(double loadCapacity, double towingCapacity){	//there is no constructor to set only the load or towing capacity since it is not possible to define between Truck(double) and Truck(double)
		super();
		this.loadCapacity = loadCapacity;
		this.towingCapacity = towingCapacity;
	}
	
	/**
	 * Sets all the variables, uses the constructor in the Vehicle class
	 * @param manufacturersName the name of the manufacturer of this Truck
	 * @param numberOfCylinders the number of cylinders that this Truck has
	 * @param owner the owner of this Truck
	 * @param loadCapacity the load capacity of this Truck
	 * @param towingCapacity the towing capacity of this Truck
	 */
	public Truck(String manufacturersName, int numberOfCylinders, Person owner, double loadCapacity, double towingCapacity) {
		super(manufacturersName, numberOfCylinders, owner);
		this.loadCapacity = loadCapacity;
		this.towingCapacity = towingCapacity;
	}

}
