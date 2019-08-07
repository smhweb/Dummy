package misc;
import java.util.Arrays;

public class FindSmallestLargestNumber {

	public static void main(String[] args) {

		int numbers[] = {-5, 10, -89, 66, 8989};
		
		int largest = numbers[0];
		int smallest = numbers[0];
		
		for(int i=1; i<numbers.length; i++) {
			if(numbers[i] > largest) {
				largest = numbers[i];
			} else if(numbers[i] < smallest){
				smallest = numbers[i];
			}
		}
		
		System.out.println("numbers array is :  "+Arrays.toString(numbers));
		System.out.println("Largest number is :  "+ largest);
		System.out.println("Largest number is :  "+ smallest);	
		
	}
}
