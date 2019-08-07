package misc;

public class PalindromNumber {
	
	public static void isPalindrome(int num) {
		
		int r = 0;
		int sum = 0;
		int t = num;
		
		while(num>0){
			r = num%10;
			sum = (sum*10)+r;
			num = num / 10;
		}
		
		if(t==sum) {
			System.out.println("Given number is a Palindrome : "+t);
		}else {
			System.out.println("Given number is NOT a Palindrome : "+t);
		}
	}

	public static void main(String[] args) {
		isPalindrome(191);
		isPalindrome(1);
		isPalindrome(111);
		isPalindrome(919);
		isPalindrome(12321);
		isPalindrome(122);
		isPalindrome(0);
	}

}
