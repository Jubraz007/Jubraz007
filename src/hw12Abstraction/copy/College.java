package hw12Abstraction.copy;

public interface College {

	public void commonRoom();
	public abstract void laboratory();
	public String languageClub();

	public default void dorm(){
		
	}
	public static void studyRoom() {
		
	}
	
}
