import java.util.LinkedHashSet;

public class LinkedHashsetExample {

	public static void main(String[] args) {
		
		LinkedHashSet<LinkedHashSetBookExample> hs =new LinkedHashSet<LinkedHashSetBookExample>();
		
		LinkedHashSetBookExample hs1=new LinkedHashSetBookExample(101,"Let us C","Yashwant Kanetkar","BPB",8);
		LinkedHashSetBookExample hs2=new LinkedHashSetBookExample(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
		LinkedHashSetBookExample hs3=new LinkedHashSetBookExample(103,"Operating System","Galvin","Wiley",6);
		
		
		hs.add(hs1);
		hs.add(hs2);
		hs.add(hs3);
		
		for (LinkedHashSetBookExample b:hs) {
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
		}
	}

}
