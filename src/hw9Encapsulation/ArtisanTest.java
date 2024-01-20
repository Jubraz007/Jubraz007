package hw9Encapsulation;

public class ArtisanTest {
//Artisan is the synonyms of Employee
	// This is another way to do getter and setter method
	public static void main(String[] args) {
		Artisan employee = new Artisan("Md Jubraz Moro", 28, 'M', true);

		System.out.println("Employee name:" + employee.getStName() + "\nEmployee Age:" + employee.getStAge()
				+ "\nEmployee Gender:" + employee.getStGender() + "\nEmployee Citizen:" + employee.isStCitizen());

	}

}
