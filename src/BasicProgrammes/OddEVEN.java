package BasicProgrammes;

import java.util.Scanner;

//Check number wether it is an even or odd
public class OddEVEN {

	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		
		System.out.println("Please enter a nnumber:");
		
		int num=s.nextInt();
		
		if(num%2==0) {
			System.out.println("Number is a even");
			
		}else
		{
			System.out.println("Number is odd");
		}
	
		
	}

}
