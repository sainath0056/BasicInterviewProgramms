package BasicProgrammes;
//Programme to swap two numbers
public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		System.out.println("Before Swapping:");
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("After Swapping:");
//		int temp;
//		temp=a;
//		a=b;
//		b=temp;
//		System.out.println("a="+a);
//		System.out.println("b="+b);
		a=a-b;//-10
		b=a+b;//10
		a=b-a;//20
		System.out.println("a="+a);
		System.out.println("b="+b);
		

	}

}
