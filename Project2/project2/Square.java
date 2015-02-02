package project2;

public class Square extends Rectangle {
	private int size;
	
	/**
	 * Default constructor, sets the size to 1 and the offset to 0
	 */
	public Square() {
		size = 1;
		offset = 0;
	}
	/**
	 * Constructor with size
	 * Sets the offset to 0;
	 * @param size the size to set (minimum of 1)
	 */
	public Square(int size) {
		if (size <1){
			throw new NumberFormatException("The size entered, " + size + " is below 0, this is an invalid input");
		}else{
			this.size = size;
		}
		offset = 0;
	}

	/**
	 * Constructor with size and offset
	 * @param size the size to set (minimum of 1)
	 * @param offset the offset to set (minimum of 0)
	 */
	public Square(int size, int offset) {
		if (size <1){
			throw new NumberFormatException("The size entered, " + size + " is below 0, this is an invalid input");
		}else{
			this.size = size;
		}
		if (offset <0){
			throw new NumberFormatException("The offset entered, " + offset + " is below 0, this is an invalid input");
		}else{
			this.offset = offset;
		}
	}
	
	@Override
	/**
	 * This method will draw a graphically correct square, the amount of lines in the horizontal will be double that of the specified width, this because one | is as large as 2 _.
	 * This decision was made by me and might not be exactly what you want, however I feel this is the best solution
	 * Since we are doubling the amount of characters on the horizontal in order to balance the larger size of the vertical characters I will also change the size of one offset accordingly
	 * This means that if you for example have a size of 5 and an offset of 5 then the distance from the left side to the block will be the same as the size of the block itself
	 * This method is the same as the parent methods yet always makes a square
	 */
	public void drawHere(){
		int i = 0;
		while (i<offset){
			System.out.print("  ");
			i++;
		}
		i=0;
		System.out.print(" ");				//this line is to make the square look more like a square
		while (i<size){
			System.out.print("__");		//two horizontal lines are just as large as one vertical, therefore we use 2 horizontal ones to make the actual graphical representation better
			i++;
		}
		System.out.println();
		int j = 1;
		while (j<size){
			i=0;
			while (i<offset){
				System.out.print("  ");
				i++;
			}
			i=0;
			System.out.print("|");
			while (i<size){
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
		while (i<size){
			System.out.print("__");
			i++;
		}
		System.out.println("|");
	}
	@Override
	/**
	 * Will calculate and return the area of this square
	 * @return the area of this square
	 */
	public double calcArea() {
		return size*size;
	}

	@Override
	/**
	 * Will calculate and return the circumference of this square
	 * @return the circumference of this square
	 */
	public double calcCircumference() {
		return size*4;
	}
	/**
	 * @param size the size to set (minimum of 1)
	 */
	public void setSize(int size) {
		if (size <1){
			throw new NumberFormatException("The size entered, " + size + " is below 0, this is an invalid input");
		}else{
			this.size = size;
		}
	}
	/**
	 * @param offset the offset to set (minimum of 0)
	 */
	public void setOffset(int offset){
		if (offset <0){
			throw new NumberFormatException("The offset entered, " + offset + " is below 0, this is an invalid input");
		}else{
			this.offset = offset;
		}
	}
}
