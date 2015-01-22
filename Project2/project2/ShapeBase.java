package project2;

/**
 * This class is taken as found on the internet, as I do not currently have access to my java book this is the best I could do
 * @author Ylva
 *
 */
public abstract class ShapeBase implements ShapeInterface {

	protected int offset;
	
	public void setOffset(int newOffset){
		offset = newOffset;
	}
	
	public int getOffset(){
		return offset;
	}
	
	public abstract void drawHere();
	
	public void drawAt(int lineNumber){
		for (int i =0; i<lineNumber;i++){
			System.out.println();
		}
		drawHere();
	}
	
	
	public abstract double calcArea();
	//It seemed to make sense to put these two statements in here, this because the sub methods have to have these methods any, in this way, they are forced to
	public abstract double calcCircumference();

}
