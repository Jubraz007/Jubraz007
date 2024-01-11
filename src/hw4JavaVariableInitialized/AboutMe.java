package hw4JavaVariableInitialized;

public class AboutMe {

	public String name;// variable declared
	public int homePrice;
	public byte downPaymentPercentage;
	public byte loanTerm;
	public short homeInsurance;
	public long validation;
	public float interestRate;
	public double propertyTaxes;
	public char quality;
	public boolean parking;

	// Constructor declared
	public AboutMe() {
		System.out.println("-----This all about us-----");
	}

	// method implemented
	public void aboutMe() {
		System.out.println("AboutMe" + name + " homeprice:" + homePrice + ",downPaymentPersentage:"
				+ downPaymentPercentage + ",loanTerm:" + loanTerm + ",homeInsurance:" + homeInsurance + "\n validation:"
				+ validation + ",\ninterestRate" + interestRate + ",propertyTaxes:" + propertyTaxes + ",quality:"
				+ quality + " and parking:" + parking);
	}

}
