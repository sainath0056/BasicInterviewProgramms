package CodeNInja;

public class DivideNumbers {
	
	public static int divideNumbers(int num,int deno) {
		if(deno==0) {
			return Integer.MIN_VALUE;
		}
		
		return num/deno;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num=8;
		int deno=4;
		int result=divideNumbers(num,deno);
		System.out.println(result);

	}

}
