package ProgrammingJava;

public class SwapString {

	public static void main(String[] args) {
		
		String a="Hello";
		String b="World";
		
		System.out.println("BeforeSwapping:");
		System.out.println("The Value of a:"+a);
		System.out.println("The value of b:"+b);
		a=a+b;//HelloWorld
		b=a.substring(0,a.length()-b.length());//HelloWorld-World=Hello
		a=a.substring(b.length());//world
		System.out.println("After Swapping:");
		System.out.println("The valies of a:"+a);
		System.out.println("The value of b:"+b);
		

	}

}
