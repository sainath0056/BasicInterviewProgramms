import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Scanner;

public class Arr2 {


	public static void main(String[] args) {
		
		String str="   Hello Geeks  .  Welcome ,    Do you love Geeks , Geeks  ? ";
		
		char[] strTochar=str.toCharArray();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<str.length();i++) {
			if(strTochar[i]!=' ' && strTochar[i]!='\t') {
				sb.append(strTochar[i]);
			}
		}
		System.out.println(sb.toString());
		
}
}