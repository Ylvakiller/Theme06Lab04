package project1;
/*
 * Description as found on blackboard:
 * Project 8.6. Create a base class called Vehicle that has the manufacturer�s name (type String), 
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
		System.out.println("testing time!");
		System.out.println("We have to test the classes person, Vehicle and Truck.");
		System.out.println("Since they all use the person class we will test that first.");
		System.out.println("The person class only has a name in it, so thats all we will test");
		System.out.println("Lets see what the default constructor will do.");
		Person person1 = new Person();
		System.out.println("The name stored is now:");
		person1.writeOutput();
		System.out.println("\nOkay so default constructor and the writeOutput methods work");
		System.out.println("Lets set the name to Remco");
		person1.setName("Remco");
		person1.writeOutput();
		System.out.println("Now testing the getter method");
		System.out.println("Name returned is: " + person1.getName());
		System.out.println("Now we will make another person initialised as name Remco");
		Person person2 = new Person("Remco");
		System.out.println("Lets compare them shall we");
		if (person1.hasSameName(person2)){
			System.out.println("They are the same");
		}else{
			System.err.println("Something went wrong, they are not the same");
		}
		System.out.println("For the last check we will change one of their names to Remco2 and compare them");
		person1.setName("Remco2");
		if (person1.hasSameName(person2)){
			System.err.println("Something went wrong, they are the same");
		}else{
			System.out.println("They are not the same");
		}
		System.out.println("\nThats the whole person testing done");
		System.out.println("We can test the vehicle class, but testing the truck class will already do that, therefore we will only test that\n");
		Truck truck1 = new Truck();
		System.out.println("Lets see what is initialised");
		truck1.writeOutput();
		System.out.println("Lets set the owner as Remco");
		truck1.setOwner(person1);
		System.out.println("Current owner of the truck is:" + truck1.getOwner().getName());
		System.out.println("O yeah that person object has a different name, well lets change that");
		truck1.getOwner().setName("Remco");
		System.out.println("Current owner of the truck is:" + truck1.getOwner().getName());
		System.out.println("Now we'll need to set the manufacturersname and the number of cylinders");
		truck1.setManufacturersName("Scania");
		truck1.setNumberOfCylinders(8);
		System.out.println("\nLets see what we have so far");
		truck1.writeOutput();
		System.out.println("Okay now just the load capacity and the towing capacity");
		truck1.setLoadCapacity(20.5);
		truck1.setTowingCapacity(6.75);
		truck1.writeOutput();
		System.out.println("\nOkay so we can set all the variables, now lets make a new truck object with all these values in the constructor");
		Truck truck2 = new Truck("Scania", 8, person2, 20.5, 6.75);
		truck2.writeOutput();
		System.out.println("\nNow we just need to check wheter or not these two are the same");
		if (truck1.equals(truck2)){
			System.out.println("They are the same");
		}else{
			System.err.println("They are not the same");
		}
		System.out.println("We now tested everything needing testing, the equals method of the truck class uses the equals method of the vehicle class so by testing the truck equals method we also test the vehicle version");	//sorry for the long sentence :)
		System.out.println("\n\nThats all folks!");
		System.exit(0);
		
		
		
	}

}
