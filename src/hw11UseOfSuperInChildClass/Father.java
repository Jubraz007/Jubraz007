package hw11UseOfSuperInChildClass;

public class Father {

	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String familyName;
	

	// default constructor
	public Father() {
		System.out.println("This is a default constructor from the Father class");

	}

//parameterized constructor
	public Father(String name, int age, char sex, boolean usCitizen) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		
		System.out.println("Father name: " + name + "Age: " + age +" Sex: " + sex + " Us Citizen: " + usCitizen);
	}
//void type or return type method or none parameterized method
	public void father() {

		System.out.println("Void type method from Father class");
	}
//parameterized method
	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
		System.out.println("Father name: " + name + "Age: " + age +" Sex: " + sex + " Us Citizen: " + usCitizen);
	}

}
