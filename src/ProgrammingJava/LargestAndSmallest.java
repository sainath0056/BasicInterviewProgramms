package ProgrammingJava;

import java.util.Arrays;

public class LargestAndSmallest {

	public static void main(String[] args) {
		
		int numbers[]= {10,20,-70,30,789,1000};
		
		int largest=numbers[0];
		int smallest=numbers[0];
		
		for(int i=1;i<numbers.length;i++) {
			
			if(numbers[i]>largest) {
				
				largest=numbers[i];
			}else if(numbers[i]<smallest) {
				
				smallest=numbers[i];
			}
		}
		System.out.println("Given Array:"+ Arrays.toString(numbers));
		System.out.println("Largest:"+ largest);
		System.out.println("Smallest:"+ smallest);

	}

}
