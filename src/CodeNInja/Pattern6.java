package CodeNInja;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {

		Scanner s1=new Scanner(System.in);
		int n=s1.nextInt();

		int i=1;
		while(i<=n) {
			int j=1;
			//int num=2*i-1;
			int num=2*i-1;
			while(j<=n) {
				//int j1=2*i-1;
				//int p=2*j-1;
				num=num+2;
				System.out.print(num);
				//p++;
				j++;


			}
			System.out.println();
			i++;
			num=num+2;
		}


	}

}
