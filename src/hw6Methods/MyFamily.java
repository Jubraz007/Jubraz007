package hw6Methods;

public class MyFamily {

	public int child1Age=10;
	public int child2Age=20;
	public int child3Age=30;  
	 
	public int myFamily() {
		int sum = child1Age+child2Age+child3Age;
		System.out.println("The sum of my childrens age is: " + sum);
		return sum;
		
	
	}
	public static void main(String[] args) {
		MyFamily myFamily = new MyFamily();
		myFamily.myFamily();
	
	
	}	


}

  