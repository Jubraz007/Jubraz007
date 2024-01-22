package hw10Abstraction;

// A regular class
// regular class can inherit only one ( regular class or one abstract class) by extends keyword
// A regular class can't inherit an Interface or another abstract and regular class by extend keyword

public class ColumbiaUniversity extends MedicalSchool {
	
		public void chemistry() {
		
			System.out.println("Chemistry is from Columbia University");
		}

	//public abstract void biology() ; 
		//this is abstract method that's why it's not working inside regular class
		public ColumbiaUniversity() { //constructor created
			
		}

}
