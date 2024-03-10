package hw14Abstraction;

// if both extend and implements present, extend keyword used before implements keyword
// if extend keyword not needed , we can use implements keyword alone
public class NYUniversity implements University{

	public void anthropology() {
		
		System.out.println("Anthropology is from NY University");
	}

	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void laboratory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String languageClub() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String cafeteria() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void classSize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playGround() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String teacher() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
