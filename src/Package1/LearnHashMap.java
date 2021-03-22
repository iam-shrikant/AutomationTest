package Package1;

import java.util.HashMap;
import java.util.Map;

public class LearnHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm = new HashMap<>();
		
		hm.put(1, "Shrikant");
		hm.put(2, "Aishwarya");
		hm.put(3, "Ashish");
		
		System.out.println("Hashmap Size"+hm.size());
		
		//check key is presetn or not\
		
		if(hm.containsKey(1)) {
			String val = hm.get(1);
			System.out.println("Value for key 1 "+val);
		}
		
		for(Map.Entry<Integer, String> e : hm.entrySet()) {
			System.out.println("Key :"+e.getKey()+" Value :"+e.getValue());
		}
	}

}
