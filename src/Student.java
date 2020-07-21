import java.util.Iterator;
import java.util.*; 
import java.util.Set;
public class Student {

	public static void main(String[] args) {
		
		ArrayList<String> Al1=new ArrayList<String>();
		Al1.add("mah");
		Al1.add("hjk");
		Al1.add("asd");
		HashSet<String> set1=new HashSet(Al1);  
        set1.add("One");    
        set1.add("Two");    
        set1.add("Three");   
        set1.add("Four");  
        set1.add("Five"); 
        set1.remove("One");
        Iterator<String> i=set1.iterator();  
        while(i.hasNext())  
        {  
        System.out.println(i.next());  
        }  
		
	}

}
