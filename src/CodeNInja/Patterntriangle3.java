package CodeNInja;

import java.util.Scanner;

public class Patterntriangle3 {

	public static void main(String[] args) {
		
	Scanner s=new Scanner(System.in);
	int n=	s.nextInt();
	int i=1;

	while(i<=n) {
		int p=i;
		int j=1;
		while(j<=i) {
			 System.out.print(p);
			 p++;
			j++;
			
		}
		System.out.println();
		i++;
	}

	}

}
