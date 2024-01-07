package hw3JavaVariables;

public class AboutMe {

	public String name = "RCG Mortgage";
	public int homePrice = 4000000;
	public byte downPaymentPersentage = 20;
	public byte loanTerm = 30;
	public short homeInsurance = 1500;
	public long validation = 223443343544543000l;
	public float interestRate = 6.25f;
	public double propertyTaxes = 1.2222;
	public char quality = 'A';
	public boolean parking = true;

	public AboutMe() {
		System.out.println("I am aboutMe method");
	}

	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe();
		System.out.println(aboutMe.name);
		System.out.println(aboutMe.homePrice);
		System.out.println(aboutMe.downPaymentPersentage);
		System.out.println(aboutMe.loanTerm);
		System.out.println(aboutMe.homeInsurance);
		System.out.println(aboutMe.validation);
		System.out.println(aboutMe.interestRate);
		System.out.println(aboutMe.propertyTaxes);
		System.out.println(aboutMe.quality);
		System.out.println(aboutMe.parking);

	}

}
