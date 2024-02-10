 package hw11UseOfSuperInChildClass;


public class TestFamily {
 public static void main(String[] args) {
	System.out.println("\n------Default constructor initialized from the Father class");
	Father father1 = new Father();
	 
	System.out.println("\n------Parametrized constructor initialized from the Father class");
	Father father2 = new Father("Mohashin ", 46,'M' , false);
	
	System.out.println("\n-------Void type method Initialize from the Father class");
	father2.father();
	System.out.println("\n-------Parametrized method initialized from the Father calss");
	father2.fatherInfo("Mohashin",46,'M' , false);
 
	System.out.println("\n Default constructor initialized from the Daughter");
	Daughter daughter = new Daughter();
	
	System.out.println("\n Parametrized constructor initialized from the Daughter");
	Daughter daughter1 = new Daughter("February ", 11);
	
	System.out.println("\n Void type method initialized from the Daughter");
	daughter1.daughter();
	
	System.out.println("\n Parametrized method initialized from the Daughter");
	daughter1.daughterInfo("February ", 11);
	
 }
 
	 
}

