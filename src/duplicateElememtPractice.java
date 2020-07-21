import java.util.HashSet;

public class duplicateElememtPractice {

	public static void main(String[] args) {
	String name[]= {"java","javascript","python","java"};
	
	for(int i=0;i<name.length;i++) {
		for(int j=i+1;j<name.length;j++) {
			if(name[i].equals(name[j])) {
				System.out.println("duplicate ele:" +name[i]);
				
			}
		}
		
	}
	
	HashSet<String> hs= new HashSet<String>();
	for(String names:name) {
		if(hs.add(names)==false) {
			System.out.println("duplicate ele:" +names);
		}
	}

	}

}
