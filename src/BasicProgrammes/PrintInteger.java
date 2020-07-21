package BasicProgrammes;

import java.util.Scanner;//java Programme to print intger

public class PrintInteger {

	public static void main(String[] args) {
		
		Scanner reader =new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		int number=	reader.nextInt();
		System.out.println("Your entered number: "+number);
   
	}

}
