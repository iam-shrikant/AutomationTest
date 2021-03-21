package Package1;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {5,9,8,6,7};
		int largetNumber = 0;
		int secondLargeNumber = 0;
		
		for(int i =0;i<numbers.length;i++) {
			if(i==0) {
				largetNumber = numbers[i];
			}
			if(numbers[i] > largetNumber) {
				largetNumber = numbers[i];
			}
		}	
		
		for(int i =0;i<numbers.length;i++) {
			if(numbers[i] > secondLargeNumber && numbers[i]<largetNumber) {
				secondLargeNumber = numbers[i];
			}
		}	
		
		System.out.println("First Large number:"+largetNumber);
		System.out.println("Second Large number:"+secondLargeNumber);
		
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
	}
}
