package abstractionPractice;

public abstract class AbstractClass {
	// abstraction means- hiding the implementation logic
	abstract void openAccount();
	
	public void closeAccount() {
		System.out.println("Closing account from AbstractClass.");
	}
	
	public static void write() {
		System.out.println("Writing");
	}
	

}
