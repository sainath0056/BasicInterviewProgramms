
public class MissingArraypractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[]= {1,2,4,5,6,7,8,9,10};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			
			sum=sum+arr[i];
			
		}
        System.out.println(sum);
        
        
        int sum1=0;
        for(int i=1;i<=10;i++) {
        	sum1=sum1+i;
        	
     }
        System.out.println(sum1);
        
        System.out.println(sum1-sum);
	}

}
