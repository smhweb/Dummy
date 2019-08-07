package abstractionPractice;

public class TestAbstraction {		// Interfaces = 100% Abstraction,  Abstract Class = 0 to 100% Abstraction

	public static void main(String[] args) {

		NBPPakistan nbp = new NBPPakistan();		
		nbp.checkingAccount();
		nbp.deposit();
		nbp.savingAccount();
		nbp.withdraw();
		nbp.closeAccount();
		nbp.openAccount();
		
		CanadianBankInterface cbi = new NBPPakistan();
		cbi.savingAccount(); // other methods will not work with this object.
		
		FDICInterface fdici = new NBPPakistan();
		fdici.deposit();
		fdici.withdraw(); // other methods will not work with this object.
		
		AbstractClass ac = new NBPPakistan();
		ac.openAccount();
		ac.closeAccount();  // other methods will not work with this object.
				
	}
}
