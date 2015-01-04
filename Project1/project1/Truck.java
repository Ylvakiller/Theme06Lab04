package project1;

public class Truck extends Vehicle {

	double loadCapacity;
	double towingCapacity;
	
	public Truck() {
		// TODO Auto-generated constructor stub
	}

	public Truck(String manufacturersName) {
		super(manufacturersName);
		// TODO Auto-generated constructor stub
	}

	public Truck(int numberOfCylinders) {
		super(numberOfCylinders);
		// TODO Auto-generated constructor stub
	}

	public Truck(Person owner) {
		super(owner);
		// TODO Auto-generated constructor stub
	}

	public Truck(String manufacturersName, int numberOfCylinders, Person owner) {
		super(manufacturersName, numberOfCylinders, owner);
		// TODO Auto-generated constructor stub
	}

}
