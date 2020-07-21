package Interview;

import java.util.HashMap;
import java.util.Map;

public class HashMap_HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,String> hs=new HashMap<String,String>();
		hs.put("id","12");
		hs.put("name", "sai");
		hs.put("city", "Bangalore");
		for(Map.Entry m:hs.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
