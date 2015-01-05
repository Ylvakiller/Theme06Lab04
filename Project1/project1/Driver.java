package project1;
/*
 * Description as found on blackboard:
 * Project 8.6. Create a base class called Vehicle that has the manufacturer’s name (type String), 
 * number of cylinders in the engine (type int), 
 * and owner (type Person given in Listing 8.1). 
 * Then create a class called Truck that is derived from Vehicle and has additional properties: 
 * the load capacity in tons (type double, since it may contain a fractional part) 
 * and towing capacity in tons (type double).
 * Give your classes a reasonable complement of constructors and accessor methods, and an equals method as well.
 * Write a driver program (no pun intended) that tests all your methods.
 */

/*
 * Remarks programming as found on blackboard:
 * 8.6; p. 637:
 * A Vehicle has the following variables and methods:
 * String manufacturersName
 * int numberOfCylinders
 * Person owner
 * Various constructors (at least a default and a full constructor plus one for each instance variable)
 * Various setMethods (one for each instance variable)
 * Various getMethods (one for each instance variable)
 * An equals method
 * A writeOutput method
 * 
 * A Truck has all of the above variables and methods plus:
 * double loadCapacity
 * double towingCapacity
 * More constructors that make use of the parent constructors
 * More setMethods (the ones of the Vehicle are already available)
 * More getMethods (the ones of the Vehicle are already available)
 * An equals method that overrides the parent equals method, but uses it as well
 * A writeOutput method that overrides the parent writeOutput method, but uses it as well
 */

/**
 * This class will drive the vehicle program, it is meant as a tester to see if everything works
 * @author Ylva
 *
 */
public class Driver {

	
	public static void main(String[] args) {
		Truck test = new Truck();
		test.writeOutput();

	}

}
