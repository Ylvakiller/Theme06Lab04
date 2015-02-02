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
	 * @param size the size to set
	 */
	public Square(int size) {
		this.size = size;
		offset = 0;
	}

	/**
	 * Constructor with size and offset
	 * @param size the size to set
	 * @param offset the offset to set
	 */
	public Square(int size, int offset) {
		this.size = size;
		this.offset = offset;
	}

}
