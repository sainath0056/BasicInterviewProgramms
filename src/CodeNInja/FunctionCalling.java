package CodeNInja;

public class FunctionCalling {
	
	public static int sum(int a,int b) {
		
		int res=a+b;
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=10;
		int b=20;
		int res=sum(a,b);
		System.out.println(res);
	}

}
