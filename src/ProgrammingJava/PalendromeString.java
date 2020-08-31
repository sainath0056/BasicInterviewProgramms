package ProgrammingJava;

public class PalendromeString {
	
	

	public static void main(String[] args) {
	
		String str="amma";
		int len=str.length();
		String rev="";
		String temp;
		temp=str;
       
		
		for(int i=len-1;i>=0;i--) {
			
			rev=rev+str.charAt(i);
			
		}//
		
		if(temp.equals(rev)) {
			
			System.out.println("Palendrome:"+rev);
		}
		else {
			System.out.println("Not a palnedrome:"+rev);
		}
		}
		

}
