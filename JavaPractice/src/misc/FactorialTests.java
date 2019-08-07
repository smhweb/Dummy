package misc;
public class FactorialTests {
	//  factorial 4 = 4*3*2*1 = 24, f(0)=1, f(1)=1	
	
	// without Recursive - use for loop	
	public static int findFactorial(int num) {
		int fact = 1;
		if(num==0)
			return 1;
		for(int i=1; i <=num; i++) {
			fact = fact*i;
		}		
		return fact;
	}
	
	// 2. with Recursive function : calling itself repeatedly.
	
	public static int findFactTotals(int num) {
		if(num==0)
			return 1;
		else
			return (num * findFactTotals(num - 1));
	}
	
	public static void main(String[] args) {		
		System.out.println(findFactorial(5));
		System.out.println(findFactorial(1));
		System.out.println(findFactorial(0));

		System.out.println(findFactTotals(0));
		System.out.println(findFactTotals(4));
		System.out.println(findFactTotals(1));
	}
}
