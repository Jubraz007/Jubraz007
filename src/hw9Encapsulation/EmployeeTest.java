package hw9Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setStName("Md Jubraz Morol");
		employee.setStAge(28);
		employee.setStGender('M');
		employee.setStCitizen(true);
		
		System.out.println("Employee name:" + employee.getStName()+ "\nEmployee Age:" + employee.getStAge() + "\nEmployee Gender:" + 
		employee.getStGender() + "\nEmployee Citizen:"+ employee.isStCitizen());	
		
	}
	
}

