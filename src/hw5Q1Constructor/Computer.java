package hw5Q1Constructor;

public class Computer {
	public String Samsung; // variable are declared
	public int model;
	public int operatingSystem;
	public int price;
	public char grad;
	public boolean madeInUSA;

	public Computer() {
		System.out.println("This Constructor is from Computer Class");// default constructor declared
	}

	public Computer(String Samsung, int model, int operratingSystem, int price, char grad, boolean madeInUSA) { // here  is Parameter Variable
		this.Samsung = Samsung;
		this.model = model;
		this.operatingSystem = operratingSystem;
		this.price = price;
		this.grad = grad;
		this.madeInUSA = madeInUSA;

		System.out.println("Brand Name: " + Samsung + " \n Model : " + model + " Book3 Ultra " + operratingSystem
				+ "\n Intel: core i7, " + price + " \n Price: 2,990$ ," + grad + " Grad ," + madeInUSA + " Made in KOREA.");

	}

}
