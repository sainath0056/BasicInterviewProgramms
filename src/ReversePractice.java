
public class ReversePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  String str="Hello Sainath  how are you";
//  String rev="";
// int len=str.length();
// 
// for(int i=len-1;i>=0;i--) {
//	 
//	 rev=rev+str.charAt(i);
// }
// System.out.println(rev);
		
		int num=1995;
		int rev=0;
		while(num!=0) {
			
			rev=rev*10+num%10;
			num=num/10;
			
		}
		System.out.println(rev);
	}

}
