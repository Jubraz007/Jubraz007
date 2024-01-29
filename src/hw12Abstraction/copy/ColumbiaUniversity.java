package hw12Abstraction.copy;

// A regular class
// regular class can inherit only one ( regular class or one abstract class) by extends keyword
// A regular class can't inherit an Interface or another abstract and regular class by extend keyword

public class ColumbiaUniversity extends MedicalSchool implements University,VocationalSchool{
	//Implements keyword is used to inherit Interface in regular class
	// a regular class can inherit more then one Interface
	// a regular class cannot inherit a regular class or abstract class by implements keyword
	
		public void chemistry() {
		
			System.out.println("Chemistry is from Columbia University");
		}

	//public abstract void biology() ; 
		//this is abstract method that's why it's not working inside regular class
		public ColumbiaUniversity() { //constructor created
			
		}

	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void laboratory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String languageClub() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String cafeteria() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void classSize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playGround() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String teacher() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void caring() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lawinfo() {
		// TODO Auto-generated method stub
		
	}

}
 