package Arrays;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {23,29,2,3,7,6};
		int n=a.length;
		for(int i=0;i<n-1;i++) {//Number of passes
			for(int j=0;j<n-1;j++) {//Iterations in each pass
				if(a[j]>a[j+1]) {
				int	temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("element after swapping:"+ Arrays.toString(a));

	}

}
