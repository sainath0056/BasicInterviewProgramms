
public class BubblesortPractice {
//Binary Search
	
	public static int binarySearch(int[] arr, int i) {
		
		int start=0;
		int end=arr.length-1;
		
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]>i) {
				end=mid-1;
			}else if(arr[mid]<i) {
					start=mid+1;
				}else {
					return mid;
				}
			}
		return -1;
		}
	
		
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {23,34,22,56,34,21};
		int index=binarySearch(arr,56);
		System.out.println(index);
		

	}

	

}
