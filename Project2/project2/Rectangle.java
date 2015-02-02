package project2;

public class Rectangle extends ShapeBase {

	/**
	 * The width of the rectangle
	 */
	private int width;
	
	/**
	 * The height of the rectangle
	 */
	private int height;
	
	/**
	 * Default constructor
	 * Sets the offset to 0;
	 * Sets the height and width to 2, this is the minimum due to the limitations of my drawHere method
	 */
	public Rectangle() {
		offset = 0;
		width =2;
		height = 2;
	}

	@Override
	public void drawHere() {
		// TODO Auto-generated method stub

	}

	@Override
	public double calcArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcCircumference() {
		// TODO Auto-generated method stub
		return 0;
	}

}
