package CodeNInja;

public class PrintAllPairs {
	
	public static void printAllpairs(int[] arr) {
		
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				
				System.out.println("("+ arr[i]+","+arr[j]+")");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,2,3,4,5,6};
		printAllpairs(arr);

	}

}
