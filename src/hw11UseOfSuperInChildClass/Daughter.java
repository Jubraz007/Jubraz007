package hw11UseOfSuperInChildClass;

public class Daughter extends Father {

	public String birthMonth;
	public int age;

	public Daughter() {
		super();
		super.father();
		super.fatherInfo("Mohashin", 46, 'M', false);

		System.out.println(" Default Constructor");

	}

	public Daughter(String birthMonth, int age) {
		super(); // super method
		super.familyName = "Morol"; // super keyword
		System.out.println("Family name: " + familyName);
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println(" Daughter :" + birthMonth + "Age: " + age);
		System.out.println("Parameterized constructor");
	}

	public void daughter() {

		super.familyName = "Morol";
		System.out.println("Family name: " + familyName);
		System.out.println("Void type method");
	}

	public void daughterInfo(String birthMonth, int age) {

		System.out.println(" Daughter :" + birthMonth + "Age: " + age);

		System.out.println("Parameterized method");
	}

}
