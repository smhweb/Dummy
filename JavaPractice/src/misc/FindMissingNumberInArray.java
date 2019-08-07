package misc;

public class FindMissingNumberInArray {

	public static void main(String[] args) {

		int[] array = {1, 5, 4 , 2, 6, 7, 8, 9, 10};
		
		int sum = 0;
		
		for(int i=0; i<array.length; i++) {
			sum = sum + array[i];
		}
		System.out.println("Sum of numbers in array :  "+sum);
		
		int sumWithNissingNumber = 0;
		
		for(int j=1; j<=10; j++) {
			sumWithNissingNumber = sumWithNissingNumber + j;			
		}
		System.out.println("Sum of numbers from 1 to 10 :  "+sumWithNissingNumber);		
		System.out.println("Missing number in array :  "+(sumWithNissingNumber - sum));
	}
}
