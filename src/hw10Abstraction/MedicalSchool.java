package hw10Abstraction;

// One keyword are used for the Inheritance i Java for Abstraction
//An abstract class can't inherit an Interface by extend keyword
//Abstract class can inherit only one abstract class or one regular class by extend keyword


public abstract class MedicalSchool extends NursingSchool{
//Method implemented
	public void biochemistryLab() {
	
		System.out.println("Biochemistry lab is from Medical School");
	}

public abstract void anatomyLab() ; //Method Declared
	
// Constructor created
public MedicalSchool() {

}
	
}
