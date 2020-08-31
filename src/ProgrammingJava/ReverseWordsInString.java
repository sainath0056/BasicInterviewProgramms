package ProgrammingJava;

import java.util.Scanner;

public class ReverseWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		 Scanner scanner = new Scanner(System.in);
//	        System.out.print("Original string : ");
//	 
//	        String originalStr = scanner.nextLine();
//	        scanner.close();
//	 
//	        String words[] = originalStr.split("\\s");
//	        String reversedString = "";
	 
//	        //Reverse each word's position
//	        for (int i = 0; i < words.length; i++) { 
//	            if (i == words.length - 1) 
//	                reversedString = words[i] + reversedString; 
//	            else
//	                reversedString = " " + words[i] + reversedString; 
//	        } 
//	 
//	        for(String w:words) {
//	        StringBuilder sb=new StringBuilder(w);
//	        sb.reverse();
//	        reversedString+=sb.toString()+"";
//	        // Displaying the string after reverse
//	       
//	        }
//	        System.out.print("Reversed string : " + reversedString.trim());
		
		
		
		
		String s[]="much very program this like i".split(" ");
		String rev="";
		for(int i=s.length-1;i>=0;i--) {
			rev=rev+s[i]+" ";
		}
		//System.out.println(rev.substring(0, rev.length()-1));
		System.out.println(rev);
	        
	        
	        
	}
	
	

}
