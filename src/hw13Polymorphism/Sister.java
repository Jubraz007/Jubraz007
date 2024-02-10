package hw13Polymorphism;

/*
Summary of method overloading
method can be void type or return type
Parameterized or non parameterized
count number of parameter, if parameter number is same , then see the sequence of data type parameter

*/
public class Sister {
  
	//void type non parameterized method (1) is implemented 
	public  void sister() {
		System.out.println("This is from void type method from Sister");
	}
	
	// void type parameterized method (2) implemented
	//method name can be same as class name but in lower case
	public void sister (int age1, int age2) {
		int total1 = age1 + age2;
		System.out.println(" Total area from Sister: " + total1);
	}
     // return type parameterized method (3) Implemented
    // if you write like (int c,int b,int a) in a separate method or like (int d, int e, int f) it will not work
	// same variable type is problem, how many variables this is not an issue
	//it allow the same number of variable, if variables type are different as parameter in a different combination 
		public int sister(int age1, int age3, int age4) {
			int total2= age1+age3+age4;
			System.out.println("Total area From Sister:"+ total2);
			return total2;
		}
		// return type parameterized method (4) Implemented
		// line 21 vs 29 , although number of parameter same, method name same, but parameter type is different
		// same number of parameter , same type of parameter with same position is not allowed
		// different position is okay
	public int sister(int age3, String age4,int age5) {
		int total3 = (int) age3 + Integer.parseInt(age4) + (int) age5; // This formula is not a part of polymorphism, we converted them to int
		System.out.println("Total area from sister:" + total3);
		return total3;
	}
	// return type parameterized method (5) Implemented
	public int sister( String age4, int age5, int age6) {
		int total4 = (int) age5 + Integer.parseInt(age4) + (int) age6; // This formula is not a part of polymorphism, we converted them to int
		System.out.println("Total area from sister:" + total4);
		return total4;
	}

	// return type parameterized method which is final in nature and implemented -06
	// Also called final method, final method can't be changed
	// Final type method can be overloaded -- [important interview question]****
	// it is not mandatory the final method to be return type
	public final int sister( int age1, int age2, int age3, int age4) {
		int total5 = age1+age2+age3+age4; //local variable
		System.out.println("Total area from sister:" + total5);
		return total5;
	}
	//Static type void Method (7) implemented
	//Static method can be overloaded [imptnt interview question]
	public  static void sister( int age1, int age2, int age3, int age4 , int age5) {
		int total6 = age1+age2+age3+age4+age5;//local variable
		System.out.println("Total area from sister:" + total6);
		
	}
	
	
}
