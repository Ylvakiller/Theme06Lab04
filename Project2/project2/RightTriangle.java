package project2;

public class RightTriangle extends ShapeBase {

	private int height;
	private int width;
	
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

	@Override
	public void drawHere() {
		// TODO Auto-generated method stub

	}

	@Override
	public double calcArea() {
		return (double)(height*width)/2;
	}

	@Override
	public double calcCircumference() {
		// TODO Auto-generated method stub
		return 0;
	}

}
