package BasicProgrammes;
//Check whtehr alphabet is vowel or consonent
public class VowelConsenent {

	public static void main(String[] args) {
       char ch='k';
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(ch +" is vowel");
			
			break;

		default:
			System.out.println(ch + " is consosnent");

	}

		if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			
			System.out.println(ch +" is vowel");
		}else
		{
			System.out.println(ch +" is consosnent");
		}
		
}
}
