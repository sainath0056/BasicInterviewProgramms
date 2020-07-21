package ProgrammingJava;

public class SwapInt {

	public static void main(String[] args) {
		int a=10;
		int b=11;
		int t;
//		t=a;
//		a=b;
//		b=t;
		System.out.println(a);
		System.out.println(b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);

	}

}
