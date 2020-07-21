package ProgrammingJava;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int firstnum=0;
		int secnum=1;
		int thirdnum=0;
		
		while(thirdnum<n) {
			
			thirdnum=firstnum+secnum;
			firstnum=secnum;
			secnum=thirdnum;
		}
		
		if(thirdnum==n) {
			
			System.out.println("It is a Fibonacci num");
		}else {
			System.out.println("It is not a fibonacci num");
		}
	}

}
