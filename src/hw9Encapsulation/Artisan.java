package hw9Encapsulation;

public class Artisan {
// Alternative way to call get and set method.
	
	private String stName;
	private int stAge;
	private char stGender;
	private boolean stCitizen;
	
	public Artisan(String stName, int stAge, char stGender, boolean stCitizen) {
		super();
		this.stName = stName;
		this.stAge = stAge;
		this.stGender = stGender;
		this.stCitizen = stCitizen;
	}

	public String getStName() {
		return stName;
	}

	public int getStAge() {
		return stAge;
	}

	public char getStGender() {
		return stGender;
	}

	public boolean isStCitizen() {
		return stCitizen;
	}
	
}
