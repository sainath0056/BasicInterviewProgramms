package BasicProgrammes;

import java.util.Scanner;

public class SumOFNumbers {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		int n;
		n=s.nextInt();
		int sum=0;
		int i=1;
		while(i<=n) {
			
			sum=sum+i;
			i++;
		}
   System.out.println(sum);
	}

}
