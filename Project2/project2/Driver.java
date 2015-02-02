package project2;
/*
 * Description as found on blackboard:
 * Project 8.7. 
 * Create the classes RightTriangle and Rectangle, 
 * each of which is derived from the abstract class ShapeBase in Listing 8.19. 
 * Then derive a class Square from the class Rectangle. 
 * Each of these three derived classes will have two additional methods to calculate area and circumference, 
 * as well as the inherited methods. 
 * Do not forget to override the method drawHere. 
 * Give your classes a reasonable complement of constructors and accessor methods. 
 * The Square class should include only one dimension, the side, 
 * and should automatically set the height and width to the length of the side. 
 * You can use dimensions in terms of the character width and line spacing even though they are undoubtedly unequal, 
 * so a square will not look square (just as a Rectangle object, as discussed in this chapter, won’t look square.) 
 * Write a driver program that tests all your methods.
 */

/*
 * Remarks as found on blackboard
 * 8.7; p. 637:
 * The base class ShapeBase is already given on page 622.
 * From this base class two different child classes are created: RightTriangle (a triangle with one angle of 90o) and Rectangle. From Rectangle then the child class Square is created.
 * All of these classes have the following public methods:
 * Various constructors	depending on the instance variables
 * set()			 		The arguments depend on the instance variables
 * drawHere()				The drawHere method uses various different private methods, but these are not known to the user
 * calculateArea()			Depends on the shape on what the formula is
 * calculateCircumference()	Depends on the shape on what the formula is
 * See also the Class Triangle on p. 617-618 on an example on how to implement it.
 * The driver program should draw one Rectangle, one RightTriangle and one Square.
 */

/**
 * This class is meant as a driver and testing program for this project
 * @author Ylva
 *
 */
public class Driver {

	public static void main(String[] args) {
		System.out.println("Time to test everything.");
		RightTriangle triangleTest = new RightTriangle(6);
		System.out.println("We should now get a triangle of size 6.");
		triangleTest.drawHere();
		triangleTest.setOffset(3);
		triangleTest.setSize(7);
		System.out.println("We should now get 4 empty lines followed by a triangle of size 7 with an offset of 3.");
		triangleTest.drawAt(4);
		System.out.println("Moving to rectangles.");
		Rectangle rectangleTest = new Rectangle(4,5);
		System.out.println("We should now get a rectangle of a size width of 4 and a height of 5.");
		rectangleTest.drawHere();
		System.out.println("Now lets give it an offset of 6, set the width to 14 and the height to 6.");
		rectangleTest.setOffset(6);
		rectangleTest.setWidth(14);
		rectangleTest.setHeight(6);
		System.out.println("We should now get that rectangle and lets draw it after 7 lines.");
		rectangleTest.drawAt(7);
		System.out.println("Moving onto squares.");
		Square test = new Square(4);
		System.out.println("We should now get a square of a size 4.");
		test.drawHere();
		System.out.println("Now lets set the size to 8 and the offset to 1 and draw it in 5 lines");
		test.setSize(8);
		test.setOffset(1);
		test.drawAt(5);
		
		System.out.println("Thats all folks");
		System.exit(0);
	}

}
