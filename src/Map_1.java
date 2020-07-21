import java.util.HashMap;
import java.util.Map;

public class Map_1 {

	public static void main(String[] args) {
		
	Map<Integer,String> map =new HashMap<Integer,String>();
	map.put(101, "Sai");
	map.put(102, "vam");
	map.put(105, "lal");
	//Elements can traverse in any order 
	for(Map.Entry m:map.entrySet()) {
		
		System.out.println(m.getKey()+" "+m.getValue());
	}
	

	}

}
