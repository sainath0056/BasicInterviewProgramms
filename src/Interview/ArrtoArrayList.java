package Interview;

import java.util.ArrayList;
import java.util.Collections;
//Array to Arraylist conversion
public class ArrtoArrayList {

	public static void main(String[] args) {
	
	String[] students= {"sai","sam","kam","dam","bam"};
	
	ArrayList<String> ar=new ArrayList<String>();
    Collections.addAll(ar, students);
    System.out.println(ar);
	

	}

}
