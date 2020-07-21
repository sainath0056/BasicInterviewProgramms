package ProgrammingJava;

import java.util.HashSet;

public class DuplicateElementInArray {

	public static void main(String[] args) {

		//Comparison approiach
		String names[]= {"java","javaScript","python","dotnet","java","python"};
		for(int i=0;i<names.length;i++) {
			for(int j=i+1;j<names.length;j++) {
				if(names[i].equals(names[j])) {
					System.out.println("it is a duplicate element:"+names[i]);
				}
			}
		}
		System.out.println("*******************");
		//Using Hashset
		HashSet<String> hs =new HashSet<String>();
		for(String name:names) {
			if(hs.add(name)==false) {

				System.out.println("It is a dupilcate element:"+name);
			}

		}

	}

}
