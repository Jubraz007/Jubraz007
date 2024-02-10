package hw13Polymorphism;
/*
 * When different method existWhen different methods exist 
 * with the same method name with same parameters or signature.
 *  but with different syntax or logic, it is called method overriding. 
 *  Method Overriding occurs during run time.
 */

public class Niece extends Sister {

	@Override
	public void sister() {
		System.out.println("This is from void type method of Niece");
	}

	@Override
	public void sister(int age1, int age2) {
		int total1 = age1 / 5 + age2 * 2;
		System.out.println(" Total area from Sister: " + total1);
	}

	@Override
	public int sister(int age1, int age3, int age4) {
		int total2 = age1 + 4 * 6 + age3 / 2 + age4 + 12;
		System.out.println("Total area From Sister:" + total2);
		return total2;
	}

	@Override
	public int sister(int age3, String age4, int age5) {
		int total3 = (int) age3 / 2 + Integer.parseInt(age4) + 8 + (int) age5; // This formula is not a part of
																				// polymorphism, we converted them to
																				// int
		System.out.println("Total area from sister:" + total3);
		return total3;
	}

	@Override
	public int sister(String age4, int age5, int age6) {
		int total4 = (int) age5 + Integer.parseInt(age4) / 5 + (int) age6 + 10; // This formula is not a part of
																				// polymorphism, we converted them to
																				// int
		System.out.println("Total area from sister:" + total4);
		return total4;
	}

//return type parameterized method which is final and implemented
// Final type method cannot be Overriden [imptnt interview question
// Cannot overriden the final method from Sister
	/*
	 * @Override public final int sister( int age1, int age2, int age3, int age4) {
	 * int total5 = age1+age2+age3+age4; //local variable
	 * System.out.println("Total area from sister:" + total5); return total5; }
	 */

	// Static type void Method (7) implemented
	// [imptnt interview question]
	// This below method - Sister can't override or Implemented because static is a
	// local member of a class
	// So, static method can't be override, if we remove @override it will work as
	// it is considered as the static method of this modern calculator class
	/*
	 * @Override public static void sister( int age1, int age2, int age3, int age4 ,
	 * int age5) { int total6 = age1+age2+age3+age4+age5;//local variable
	 * System.out.println("Total area from sister:" + total6); }
	 */

}
