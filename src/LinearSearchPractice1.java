
public class LinearSearchPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[]= {12,23,45,23,43,44};
		int key=23;
		boolean flag=false;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]==key) {
				System.out.println("elemenmt found at:"+arr1[i]);
				flag=true;
			  break;
			}
		}
		if(flag==false) {
			System.out.println("Element not found");
		}

	}

}
