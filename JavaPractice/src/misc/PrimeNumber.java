package misc;

public class PrimeNumber {
	
	public static boolean isPrimeNumber(int num) {		
		if(num<=1) {
			return false;
			}		
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void getPrimeNumbers(int num) {
		for(int i=2; i<num; i++) {
			//if(isPrimeNumber(i)) 
				if(i%2==0)	
				System.out.print(i+ " ");
		}
	}	
	
	public static void main(String[] args) {
		
		System.out.println(isPrimeNumber(10));
		System.out.println(isPrimeNumber(11));
		System.out.println(isPrimeNumber(2));
		System.out.println(isPrimeNumber(6));
		System.out.println("================");
		getPrimeNumbers(20);
		System.out.println();
		System.out.println("================");
		getPrimeNumbers(6);

	}
}
