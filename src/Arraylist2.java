import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist2 {

	public static void main(String[] args) {
		ArrayList<String> arlist=new ArrayList<String>();
		arlist.add("sai");
		arlist.add("s5i");
		arlist.add("sfi");
		arlist.add("sari");
		arlist.add("sasi");
		arlist.add("saai");
		arlist.add("safi");
		
//		for(String str:arlist) {
//			System.out.println(str);
//		}
		
	Iterator itr=arlist.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
	
	}

}
