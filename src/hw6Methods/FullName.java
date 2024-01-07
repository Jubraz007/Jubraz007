package hw6Methods;


public class FullName {

	public String fullName(String firstName,String lastName) {
		String name = firstName+" "+lastName;
	System.out.println("Family Member: "+ name);
		
		return name;
		}
	public static void main(String[] args) {
		
		FullName fullName= new FullName();
		fullName.fullName("Md Jubraz" , "Morol");
		fullName.fullName("Md Mohashin", "Morol");
	}




}
