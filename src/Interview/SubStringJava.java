package Interview;

public class SubStringJava {

	public static void printSubString(String str) {
		// we will be printing all substring starting with char at index start
//		for(int start=0;start<str.length();start++) {
//			for(int end=start;end<str.length();end++) {
//				System.out.println(str.substring(start, end+1));
//			}
//		}
//		
//	}
		
		for(int len=1;len<=str.length();len++) {
			for(int start=0;start<=str.length()-len;start++) {
				int end=start+len-1;
					System.out.println(str.substring(start, end+1));
			}
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="pqrs";
		printSubString(str);
	}

	

}
