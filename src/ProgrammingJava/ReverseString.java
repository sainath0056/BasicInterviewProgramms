package ProgrammingJava;

public class ReverseString {

	public static void main(String[] args) {
      
		
		String str="Sainath";
		int len=str.length();
		String rev="";
		//Using for Loop
		for(int i=len-1;i>=0;i--) {

			rev=rev+str.charAt(i);//htaniaS String is immuatable
		}
		System.out.println(rev);
		
		//Using StringBuffer
		StringBuffer  sf=new StringBuffer(str);
		System.out.println(sf.reverse());
	}

}
