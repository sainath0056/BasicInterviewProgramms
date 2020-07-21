package BasicProgrammes;

import java.util.Scanner;

//how to find Ascii value of a character
public class Asciicharcter {

public static int sqrt(int n){
        
        if(n==0 ||n==1){
             return n;
        }
        
        int i=1, result=1;
        while(result<=n){
            
        	   i++;
            result=i*i;
         
        }
         return i-1;
        
    }
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
        System.out.println(sqrt(n));

	}

}
