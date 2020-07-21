package Interview;

import java.util.Iterator;
import java.util.TreeSet;

public class Student_Tree {

	public static void main(String[] args) {
		

		TreeSet<Integer> set=new TreeSet<Integer>();
		
		set.add(4);
		set.add(41);
		set.add(14);
		set.add(2);
		set.add(33);
		set.add(8);
		System.out.println(set.pollFirst());
		System.out.println(set.pollLast());
//		
//		Iterator itr= set.iterator();
//		while(itr.hasNext()) {
//		System.out.println(itr.next());
//		}
		
//		Iterator itr=set.descendingIterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		
	}

}
