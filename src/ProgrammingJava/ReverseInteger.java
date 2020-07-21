package ProgrammingJava;

public class ReverseInteger {

	public static void main(String[] args) {
		//using algo
		long num=123124135;
		long rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
       System.out.println(rev);
       
       long num1=4564560;
       StringBuffer sf=new StringBuffer(String.valueOf(num1)).reverse();
       System.out.println(sf);
       
	}

}
