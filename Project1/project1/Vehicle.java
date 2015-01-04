package project1;

public class Vehicle {
	/**
	 * The manufacturers name
	 */
	private String manufacturersName;
	/**
	 * The number of cylinders that this vehicle has
	 */
	private int numberOfCylinders;

	/**
	 * This is the owner of this vehicle
	 */
	private Person owner;

	/**
	 * Default constructor, sets the following variables:
	 * manufactuersName = "No manufacturers name yet"
	 * numberOfCylinders = 0;
	 * owner = new person with name "No Name Yet"
	 */
	public Vehicle(){
		manufacturersName = "No manufacturers name yet";
		numberOfCylinders = 0;
		owner = new Person();
	}
	/**
	 * Sets the manufacturersName as the input
	 * Sets the numberOfCylinders to 0
	 * Creates a person as owner using the default constructor of the Person class
	 * @param manufacturersName the name to give this object
	 */
	public Vehicle(String manufacturersName){
		this.manufacturersName = manufacturersName;
		numberOfCylinders = 0;
		owner = new Person();
	}
	/**
	 * Sets the manufacturersName as "No manufacturers name yet"
	 * Sets the numberOfCylinders to the input
	 * Creates a person as owner using the default constructor of the Person class
	 * @param numberOfCylinders
	 */
	public Vehicle(int numberOfCylinders){
		manufacturersName = "No manufacturers name yet";
		this.numberOfCylinders = numberOfCylinders;
		owner = new Person();
	}
	/**
	 * Sets the manufacturersName as "No manufacturers name yet"
	 * Sets the numberOfCylinders to 0
	 * Sets the owner as the given input
	 * @param owner the owner to set
	 */
	public Vehicle(Person owner){

		manufacturersName = "No manufacturers name yet";
		numberOfCylinders = 0;
		this.owner = owner;
	}
	/**
	 * Sets all the variables following the given input
	 * @param manufacturersName the manufacturers name to set
	 * @param numberOfCylinders the number of cylinders to give this vehicle
	 * @param owner the owner of this vehicle
	 */
	public Vehicle(String manufacturersName, int numberOfCylinders, Person owner){
		this.manufacturersName = manufacturersName;
		this.numberOfCylinders = numberOfCylinders;
		this.owner = owner;
	}

}
