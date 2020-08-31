package ProgrammingJava;

import java.util.Set;
import java.util.TreeSet;

public class CommonCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\\
		
		 String firstString = "sauiygjhgf jhfjh fjhfj";
         
	        String secondString = "hjfjfj hfhjfjhfj hf";
	        
	        char[] firstStringcharArray=firstString.replaceAll("\\s+", "").toCharArray();
	        char[] SecondStringcharArray=secondString.replaceAll("\\s+", "").toCharArray();
	        Set<Character> firstStringSet=new TreeSet<>();
	        Set<Character> SecondStringSet=new TreeSet<>();
	        for(char c:firstStringcharArray) {
	        	firstStringSet.add(c);
	        }
	        for(char c:SecondStringcharArray) {
	        	SecondStringSet.add(c);
	        }
	        firstStringSet.retainAll(SecondStringSet);
	        System.out.println(firstStringSet);

	}

}
