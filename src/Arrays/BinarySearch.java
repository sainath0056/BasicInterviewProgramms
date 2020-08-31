package Arrays;

public class BinarySearch {

	
	public static int binarySearch(int[] arr, int s, int e,int ele) {
		
		int mid=(s+e)/2;
		while(s<=e) {
		
		if(arr[mid]>ele) {
			e=mid-1;
		}else if(arr[mid]<ele) {
			s=mid+1;
		}else {
			return mid;
		}
			
		}
		return -1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,4,7,10,20,35,40};
		int ele=10;
		int e=arr.length-1;
		int index=binarySearch(arr,0,e,ele);
		System.out.println(index);

	}

}
