
package ProgrammingJava;
import java.util.*;
public class UniqueNumber {
//  static int[] arr= {1,2,2,3,4};
//	 public static int findUnique(int[] arr){
//			//Your code goes here
//	        int a = 0;
//	        for(int i=0;i<arr.length;i++){
//	            a = a^arr[i];
//	        }
//	        return a;
//		}
	 
	 public static void main(String[] args) {
		 int[] arr= {1,2,2,3,4};
		 int a = 0;
	        for(int i=0;i<arr.length;i++){
	            a = a^arr[i];
	        	System.out.println( a);
	        }
	 return;
		 
	 }
}
