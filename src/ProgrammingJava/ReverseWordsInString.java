package ProgrammingJava;

import java.util.Scanner;

public class ReverseWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Original string : ");
	 
	        String originalStr = scanner.nextLine();
	        scanner.close();
	 
	        String words[] = originalStr.split("\\s");
	        String reversedString = "";
	 
	        //Reverse each word's position
	        for (int i = 0; i < words.length; i++) { 
	            if (i == words.length - 1) 
	                reversedString = words[i] + reversedString; 
	            else
	                reversedString = " " + words[i] + reversedString; 
	        } 
	 
	        // Displaying the string after reverse
	        System.out.print("Reversed string : " + reversedString);
		
	}

}
