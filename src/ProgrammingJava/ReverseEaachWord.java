package ProgrammingJava;

public class ReverseEaachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String str="My name is Sainath is a good boy";
	//Splitting string in to words
	String[] words=str.split(" ");
	String rev="";
	for(int i=0;i<words.length;i++) {
		//Taking each word and reversing it
		String word=words[i];
		String revword="";
		for(int j=word.length()-1;j>=0;j--) {
			revword+=word.charAt(j);
		}
		//Append reverseword to reverseString
		rev+=revword+" ";
	}
System.out.println(rev);
	}

}
