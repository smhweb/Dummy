package misc;

public class ArmstronNumber {
	
	public static void isArmstrongNumber(int num) {
		
		System.out.println("The Number under test is:  "+num);
		
		int cube = 0;
		int r;
		int t;
		
		t = num;
		
		while(num>0) {
			r = num%10;
			num = num / 10;
			cube = cube + (r*r*r);
		}
		
		if(t == cube) {
			System.out.println("This is armstrong number: "+cube);
		} else {
			System.out.println("This is NOT armstrong number: "+cube);
		}		
	}
	
	

	public static void main(String[] args) {

		isArmstrongNumber(0);
		isArmstrongNumber(1);
		isArmstrongNumber(111);
		isArmstrongNumber(153);
		isArmstrongNumber(370);
		isArmstrongNumber(999);
		isArmstrongNumber(444);

	}

}
