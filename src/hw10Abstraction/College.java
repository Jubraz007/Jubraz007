package hw10Abstraction;

public interface College {

	public void commonRoom();
	public abstract void laboratory();
	public String languageClub();

	public default void dorm(){
		
	}
	public static void studyRoom() {
		
	}
	
}
