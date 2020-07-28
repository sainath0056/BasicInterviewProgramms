package ProgrammingJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCountOccurence {

	
	private static void characterCount(String inputString) {
		// TODO Auto-generated method stub
		HashMap<Character,Integer> charcountMap=new HashMap<Character,Integer>();
		
		char[] strArray=inputString.toCharArray();
		
		for(char c:strArray) {
			if(charcountMap.containsKey(c)) {
				charcountMap.put(c,charcountMap.get(c)+1);
			}else {
				charcountMap.put(c, 1);
			}
		}
		for(Map.Entry entry:charcountMap.entrySet()) {
			if(entry.getKey().equals("\n")) {
				//System.out.println("WhiteSpcae:" +entry.getKey());
			}
			System.out.println(entry.getKey() +" "+entry.getValue());
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		String inputString= s.nextLine();
		characterCount(inputString); 
		
	}

	

}
