package hw10Abstraction;

public interface Hospital  {

	public  void  emergencyRoom() ;
		public abstract void surgeryRoom();
		public String cafeteria();
			
		public default void morgue() {
			
		}
		public static void pharmacy() {
			
		}
		
}
