package project2;

public class RightTriangle extends ShapeBase {
	/**
	 * The height of the triangle
	 */
	private int size;
	/**
	 * Basic constructor, will set the size to 2 and the offset to 0
	 */
	public RightTriangle() {
		size = 2;
		offset =0;
	}
	/**
	 * Will set the size to the input,
	 * Will set the offset to 0
	 * Will throw a NumberFormatException if the given input is of incorrect form
	 * @param size the size, must be a positive integer of at least 2
	 */
	public RightTriangle(int size){
		if (size <2){
			throw new NumberFormatException("The size entered, " + size + " is below 2, this is an invalid input");
		}else{
			this.size = size;
		}
		offset = 0;
	}
	
	/**
	 * Will set the size to the input
	 * Will set the offset to 0
	 * @param size the size to set (minimum of 2)
	 * @param offset the offset to set (minimum of 0)
	 */
	public RightTriangle(int size, int offset){
		if (size <2){
			throw new NumberFormatException("The size entered, " + size + " is below 2, this is an invalid input");
		}else{
			this.size = size;
		}
		if (offset <0){
			throw new NumberFormatException("The offset entered, " + offset + " is below 0, this is an invalid input");
		}else{
			this.offset = offset;
		}
	}
	/**
	 * This method is used to draw the RightTriangle
	 */
	@Override
	public void drawHere() {
		int i = 0;
		int y = 0;
		while (i<size-1){
			while (y<offset){
				System.out.print(" ");
				y++;
			}
			System.out.print("|");
			while(y-offset<i){
				System.out.print(" ");
				y++;
			}
			y=0;
			System.out.println("\\");
			i++;
		}
		y=0;
		while (y<offset){
			System.out.print(" ");
			y++;
		}
		if (size ==2){
			System.out.println("|_\\");
		}else{
			System.out.print("|_");
			i=3;
			while(i<size){
				System.out.print("_");
				i++;
			}
			System.out.println("_\\");
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
	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		if (size <2){
			throw new NumberFormatException("The size entered, " + size + " is below 2, this is an invalid input");
		}else{
			this.size = size;
		}
	}
	
	/**
	 * @param offset the offset to set
	 */
	public void setOffset(int offset){
		if (offset <0){
			throw new NumberFormatException("The offset entered, " + offset + " is below 0, this is an invalid input");
		}else{
			this.offset = offset;
		}
	}

}
