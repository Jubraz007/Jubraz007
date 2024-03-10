package hw13Polymorphism;

public class TastFamily {

	public static void main(String[] args) {
		System.out.println("------Sister-----");

		Sister sister = new Sister();
		sister.sister();// void type method 01
		sister.sister(10, 15);
		sister.sister(20, 25, 24);
		sister.sister(28, "35", 23);
		sister.sister("50", 45, 34);
		sister.sister(28, 30, 35, 40);
		Sister.sister(20, 31, 37, 43, 49);// Static method has to be called with direct class name

		System.out.println("\n---- Niece----");
		// object of sister class
		Niece niece = new Niece();
		niece.sister();// void type method 01
		niece.sister(10, 15);
		niece.sister(20, 25, 24);
		niece.sister(28, "35", 23);
		niece.sister("50", 45, 34);
		// final and static method cannot be called because it was not override in child
		// class
		// final and static method can't be override
	}

}
