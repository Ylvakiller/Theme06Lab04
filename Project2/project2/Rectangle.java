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
	 * Sets the height and width to 1, this is the minimum due to the limitations of my drawHere method
	 */
	public Rectangle() {
		offset = 0;
		width =1;
		height = 1;
	}
	/**
	 * Constructor with offset.
	 * Sets the height and width to 1, this is the minimum due to the limitations of my drawHere method
	 * @param offset the offset, needs to be positive or 0
	 */
	public Rectangle(int offset) {
		if (offset <0){
			throw new NumberFormatException("The offset entered, " + offset + " is below 0, this is an invalid input");
		}else{
			this.offset = offset;
		}
		width =1;
		height = 1;
	}
	/**
	 * Constructor with the size of the Rectangle
	 * Sets the offset to 0
	 * The width and height need to be at least 1 due to inherent limitations of the drawHere method
	 * @param width the width to set
	 * @param height the height to set
	 */
	public Rectangle(int width, int height){
		if (width<1){
			throw new NumberFormatException("The width entered, " + width + " is below 2, this is an invalid input");
		}else{
			this.width = width;
		}
		if (height<1){
			throw new NumberFormatException("The height entered, " + height + " is below 2, this is an invalid input");
		}else{
			this.height = height;
		}
		offset = 0;
	}
	/**
	 * Constructor with the size and offset of the rectangle
	 * @param width the width to set (minimum of 1)
	 * @param height the height to set (minimum of 1)
	 * @param offset the offset to set (minimum of 0)
	 */
	public Rectangle(int width, int height, int offset){
		if (width<1){
			throw new NumberFormatException("The width entered, " + width + " is below 2, this is an invalid input");
		}else{
			this.width = width;
		}
		if (height<1){
			throw new NumberFormatException("The height entered, " + height + " is below 2, this is an invalid input");
		}else{
			this.height = height;
		}
		if (offset <0){
			throw new NumberFormatException("The offset entered, " + offset + " is below 0, this is an invalid input");
		}else{
			this.offset = offset;
		}
	}
	@Override
	/**
	 * This method will draw a graphically correct rectangle, the amount of lines in the horizontal will be double that of the specified width, this because one | is as large as 2 _.
	 * This decision was made by me and might not be exactly what you want, however I feel this is the best solution
	 * Since we are doubling the amount of characters on the horizontal in order to balance the larger size of the vertical characters I will also change the size of one offset accordingly
	 * This means that if you for example have a width of 5 and an offset of 5 then the distance from the left side to the block will be the same as the width of the block itself
	 */
	public void drawHere() {
		int i = 0;
		while (i<offset){
			System.out.print("  ");
			i++;
		}
		i=0;
		System.out.print(" ");				//this line is to make the rectangle look more like a rectangle
		while (i<width){
			System.out.print("__");		//two horizontal lines are just as large as one vertical, therefore we use 2 horizontal ones to make the actual graphical representation better
			i++;
		}
		System.out.println();
		int j = 1;
		while (j<height){
			i=0;
			while (i<offset){
				System.out.print("  ");
				i++;
			}
			i=0;
			System.out.print("|");
			while (i<width){
				System.out.print("  ");
				i++;
			}
			System.out.print("|");
			j++;
			System.out.println();
		}
		i=0;
		while (i<offset){
			System.out.print("  ");				//as discussed in the documentation, the offset is 2 spaces
			i++;
		}
		i=0;
		System.out.print("|");
		while (i<width){
			System.out.print("__");
			i++;
		}
		System.out.println("|");
	}

	@Override
	/**
	 * Will calculate and return the area of this rectangle
	 * @return the area of this rectangle
	 */
	public double calcArea() {
		return width*height;
	}

	@Override
	/**
	 * Will calculate and return the circumference of this rectangle
	 * @return the circumference of this rectangle
	 */
	public double calcCircumference() {
		return width*2+height*2;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		if (width<1){
			throw new NumberFormatException("The width entered, " + width + " is below 2, this is an invalid input");
		}else{
			this.width = width;
		}
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		if (height<1){
			throw new NumberFormatException("The height entered, " + height + " is below 2, this is an invalid input");
		}else{
			this.height = height;
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
