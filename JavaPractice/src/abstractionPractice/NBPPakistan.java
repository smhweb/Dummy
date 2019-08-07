package abstractionPractice;

public class NBPPakistan extends AbstractClass implements FDICInterface, CanadianBankInterface {
	
	public void checkingAccount() {
		System.out.println("NBP Pakistan self method.");		
	}

	@Override
	public void savingAccount() {
		System.out.println("NBP Pakistan - FDICInterface overriden method.");			
	}

	@Override
	public void deposit() {
		System.out.println("NBP Pakistan - CanadianBankInterface overriden method.");		
	}

	@Override
	public void withdraw() {
		System.out.println("NBP Pakistan - FDICInterface overriden method.");			
	}

	@Override
	void openAccount() {
		// TODO Auto-generated method stub
		
	}	
	@Override
	public void closeAccount() {
		System.out.println("Closing account from AbstractClass in NBPPakistan.");
	}
	
}
