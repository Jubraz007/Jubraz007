package hw9Encapsulation;

public class Employee {

	private String stName;
	private int stAge;
	private char stGender;
	private boolean stCitizen;
	
	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}
	
	public int getStAge() {
		return stAge;
	}
	
	public void setStAge(int stAge) {
		this.stAge = stAge;
	}
	
	public char getStGender() {
		return stGender;
	}
	public void setStGender(char stGender) {
		this.stGender = stGender;
	}
	public boolean isStCitizen() {
		return stCitizen;
	}
	public void setStCitizen(boolean stCitizen) {
		this.stCitizen = stCitizen;
	}
	
	
}
