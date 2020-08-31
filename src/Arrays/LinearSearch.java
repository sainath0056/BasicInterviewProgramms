package Arrays;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {12,13,14,15,20};
		int search_ele=19;
		
		boolean flag=false;

		
		for(int i=0;i<a.length;i++) {
			if(a[i]==search_ele) {
				System.out.println("elemenmt found at:"+a[i]);
				flag=true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("Element not found");
		}
	}

}
