package hw14Abstraction;


/* A interface class is a Blue print of the class
 * extend keyword can inherit more than one Interface [separated by ,]
 * An Interface can't inherit a regular class or an abstract class by extend keyword
 */ 

public interface University extends College,Hospital{ 
// Implement keyword can't be used for inheritance inside interface

	public void classSize() ;
	public abstract void playGround() ;
	public String teacher();
	

	
	public default void gymnasium() {
		
	}
	public static void  library() {
		
	}
	

}
