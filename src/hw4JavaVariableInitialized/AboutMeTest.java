package hw4JavaVariableInitialized;


public class AboutMeTest {

	public static void main(String[] args) {
		AboutMe Houseloan = new AboutMe();// Constructor initialized
		Houseloan.name = " RCGmortgage";// variable initialized
		Houseloan.homePrice = 4000000;
		Houseloan.loanTerm = 30;
		Houseloan.homeInsurance = 1500;
		Houseloan.validation = 223443343544543000l;
		Houseloan.interestRate = 6.25f;
		Houseloan.propertyTaxes = 1.2222;
		Houseloan.quality = 'A';
		Houseloan.parking = true;
		Houseloan.aboutMe();// method Initialized

		System.out.println("----------------------");

		AboutMe Alex = new AboutMe();
		Alex.name = "Alex Mortgage";
		Alex.homePrice = 8000000;
		Alex.loanTerm = 30;
		Alex.homeInsurance = 1555;
		Alex.validation = 1222376288290l;
		Alex.interestRate = 7.24f;
		Alex.propertyTaxes = 1.2255;
		Alex.quality = 'B';
		Alex.parking = false;
		Alex.aboutMe(); // Method Initialized
	}

}
