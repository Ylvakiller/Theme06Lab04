package project2;

public class RightTriangle extends ShapeBase {
	/**
	 * The height of the triangle
	 */
	private int size;
	/**
	 * Basic constructor, will set the size to 1 and the offset to 0
	 */
	public RightTriangle() {
		size = 1;
		offset =0;
	}
	/**
	 * Will set the size to the input,
	 * Will set the offset to 0
	 * Will throw a NumberFormatException if the given input is of incorrect form
	 * @param size the height, must be a positive integer (not including 0)
	 */
	public RightTriangle(int size){
		if (size <=0){
			throw new NumberFormatException("The height entered, " + size + " is below or equal to 0, this is an invalid input");
		}else{
			this.size = size;
		}
		offset = 0;
	}
	/**
	 * This method is used to draw the RightTriangle
	 */
	@Override
	public void drawHere() {
		int i = 0;
		while (i<offset){
			System.out.println("");
		}
		i = 0;
		int y = 0;
		while (i<size){
			System.out.print("|");
		}

	}

	/**
	 * This method will calculate the area and return that to the user
	 * Since this class only has a size parameter (instead of width and height) we can simply return the size,
	 * This since the formula for the area of a triangle is Height*width/2
	 * @return a double value calculated for the area of 
	 */
	@Override
	public double calcArea() {
		return size;
	}
	/**
	 * This method will calculate and return the circumference
	 * @return a double value of the circumference calculated using pythagoras
	 */
	@Override
	public double calcCircumference() {
		double extraSide = Math.pow(size,2)+Math.pow(size,2);
		return Math.sqrt(extraSide);
	}

}
