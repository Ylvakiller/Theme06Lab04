package project2;

public class RightTriangle extends ShapeBase {
	/**
	 * The height of the triangle
	 */
	private int height;
	/**
	 * The width of the triangle
	 */
	private int width;
	
	/**
	 * Basic constructor, will set the height and width to 1 and the offset to 0
	 */
	public RightTriangle() {
		height = 1;
		width =1;
		offset =0;
	}
	/**
	 * Will set the height and the width to the input,
	 * Will set the offset to 0
	 * Will throw a NumberFormatException if the given input is of incorrect form
	 * @param height the height, must be a positive integer (not including 0)
	 * @param width the width, must be a positive integer (not including 0)
	 */
	public RightTriangle(int height, int width){
		if (height <=0){
			throw new NumberFormatException("The height entered, " + height + " is below or equal to 0, this is an invalid input");
		}else{
			this.height = height;
		}
		if (width<=0){
			throw new NumberFormatException("The width entered, " + width + " is below or equal to 0, this is an invalid input");
		}else{
			this.width = width;
		}
		offset = 0;
	}
	/**
	 * This method is used to draw the RightTriangle
	 */
	@Override
	public void drawHere() {
		// TODO Auto-generated method stub

	}

	/**
	 * This method will calculate the area and return that to the user
	 * @return a double value calculated for the area of 
	 */
	@Override
	public double calcArea() {
		return (double)(height*width)/2;
	}
	/**
	 * This method will calculate and return the circumference
	 * @return a double value of the circumference calculated using pythagoras
	 */
	@Override
	public double calcCircumference() {
		double extraSide = Math.pow(height,2)+Math.pow(width,2);
		return Math.sqrt(extraSide);
	}

}
