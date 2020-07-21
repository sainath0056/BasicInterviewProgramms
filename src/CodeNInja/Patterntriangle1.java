package CodeNInja;

import java.util.Scanner;

public class Patterntriangle1 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int n=s1.nextInt();
		
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=i) {
				System.out.print(j);
				j++;
				
			}
			System.out.println();
			i++;
		}

	}

}
