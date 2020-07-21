
public class largestPracrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {1,23,45,29,-10,-50,100};
		int largest=num[0];
		int smallest=num[0];
		for(int i=1;i<num.length;i++) {
			
			if(num[i]>largest) {
				largest=num[i];
				
			}else if(num[i]<smallest) {
				smallest=num[i];
				
			}
		}
		System.out.println(largest);
		System.out.println(smallest);
	}

}
