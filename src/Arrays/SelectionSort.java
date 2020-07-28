package Arrays;

public class SelectionSort {
	
	public static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		int n=arr.length;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}

	public static void selectionSort(int[] arr) {
		// TODO Auto-generated method stub
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			//Insert element at ith Position
			int min=Integer.MAX_VALUE;
			int min_index=-1;
			for(int j=i;j<n;j++) {
				//Finding minimum element among j positions
				if(arr[j]<min) {
					min=arr[j];
					min_index=j;
				}
			}
			//Swap element at minInddex with ithElement
			int temp=arr[min_index];
			arr[min_index]=arr[i];
			arr[i]=temp;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[]= {1,6,4,7,0,3,5};
     selectionSort(arr);
     printArray(arr);
	}


	
	
}
