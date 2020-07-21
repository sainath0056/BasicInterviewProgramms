package ProgrammingJava;

public class Palnedrome {

	
	public static void isPalendrome(int num) {
		int r=0;
		int sum=0;
		int t;
		
		t=num;
		
		while(num!=0) {
			r=num%10;
			sum=sum*10+r;
			num=num/10;
			
		}
		
		if(t==sum) {
			
			System.out.println("Palendrome:"+sum);
		}else {
			System.out.println("Not a Palendromne:"+sum);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		isPalendrome(121);
	}

}
