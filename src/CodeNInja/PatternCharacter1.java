package CodeNInja;

import java.util.Scanner;

public class PatternCharacter1 {

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n) {
				char jthchar=(char)('A'+j-1);
				System.out.print(jthchar);
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
