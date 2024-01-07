package hw3JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe();//Constructor initialize
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
		
		System.out.println("About Me" + aboutMe.name + " homeprice:" + aboutMe.homePrice+ ",downPaymentPersentage:"
				+ aboutMe.downPaymentPersentage + ",loanTerm:" + aboutMe.loanTerm + ",homeInsurance:"
				+ aboutMe.homeInsurance + "\n validation:" + aboutMe.validation + ",\ninterestRate" + aboutMe.interestRate
				+ ",propertyTaxes:" + aboutMe.propertyTaxes + ",quality:" + aboutMe.quality + " and parking:"
				+ aboutMe.parking);
	}
	
	// variable is declared inside the class between curly brace 
	// variable is initialized when the value assigned

}
