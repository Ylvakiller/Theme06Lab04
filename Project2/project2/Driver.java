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
		
	}

}
