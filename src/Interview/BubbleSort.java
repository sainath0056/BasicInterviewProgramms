package Interview;

import java.util.Arrays;

public class BubbleSort {
	 static int n = 5;
	static  int[] arr= {90,10,50,100,40};
	private static int temp;
	public static void main(String[] args) {
		
		
		for(int i=0;i<n-1;i++) {
			 for(int j=0;j<n-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					  int temp = arr[j];
					  arr[j]=arr[j+1];
					  arr[j+1]=temp;
					 
				 }
				 
			 }
		 }
	  
		System.out.println(Arrays.toString(arr));
		
		
		}
	

}
