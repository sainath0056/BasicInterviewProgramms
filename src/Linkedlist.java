import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("sd");
		ll.add("mm");
		ll.add("vam");
		System.out.println("Startlist:"+ll);
		ll.add(1,"ds");
		System.out.println(ll);
		LinkedList<String> ll2=new LinkedList<String>();
		ll2.add("ghg");
		ll2.add("jhgj");
		System.out.println("ll2:"+ll2);
		ll.addAll(ll2);
		System.out.println(ll);
		LinkedList<String> ll3=new LinkedList<String>();
		ll3.add("mah");
		ll3.add("manj");
		ll.addAll(1, ll3);
		System.out.println(ll);
		ll.addFirst("sai");
		System.out.println(ll);
ll.clone();
System.out.println(ll);
	}

}
