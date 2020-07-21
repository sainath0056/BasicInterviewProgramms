package CodeNInja;

import java.util.Scanner;

public class PatternCharacter3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=n;
        while(i>=1){
            char p=(char)('A'+i-1);
            int j=n;
            while(j>=i){
                System.out.print(p);
                p=(char)(p+1);
                j--;
               
            }
            System.out.println();
            i--;
           
        }

	}

}
