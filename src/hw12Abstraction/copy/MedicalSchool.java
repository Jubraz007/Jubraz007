package hw12Abstraction.copy;

// One keyword are used for the Inheritance i Java for Abstraction
//An abstract class can't inherit an Interface by extend keyword
//Abstract class can inherit only one abstract class or one regular class by extend keyword

public abstract class MedicalSchool extends NursingSchool implements LawSchool {
//	implements keyword is used to inherit Interface in abstract class
// an abstract class can inherit more then one Interface
// an abstract class cannot inherit a regular class or a abstract class by Implements keyword

	public void biochemistryLab() { // Method implemented

		System.out.println("Biochemistry lab is from Medical School");
	}

	public abstract void anatomyLab(); // Method Declared

// Constructor created
	public MedicalSchool() {

	}

}
