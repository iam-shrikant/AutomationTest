  package Package1;

import java.util.HashMap;
import java.util.Map;

public class LearnHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,String> hmk = new HashMap<>();
		
		hmk.put("SHRIKANT", "all caps");
		hmk.put("shrikant", "all small");
				
		System.out.println("hmk: "+hmk.toString());
		
		HashMap<Integer,String> hm = new HashMap<>();
		
		hm.put(1, "Shrikant");
		hm.put(2, "Aishwarya");
		hm.put(3, "Ashish");
		hm.put(4, "shrikant");
		hm.put(null, "shrikant_null");
		
		System.out.println("Hashmap Size"+hm.size());
		
		//check key is presetn or not\
		
		/*if(hm.containsKey(1)) {
			String val = hm.get(1);
			System.out.println("Value for key 1 "+val);
		}*/
		
		for(Map.Entry<Integer, String> e : hm.entrySet()) {
			System.out.println("Key :"+e.getKey()+" Value :"+e.getValue());
		}
		
		HashMap<String,Integer> hmn = new HashMap<>();
		
		String s = "This This is is a map";
		
		String[] s2 = s.split(" ");
		for(String ss : s2) {
			//System.out.println(ss);
			
			if(hmn.containsKey(ss)) {
				
				int count = hmn.get(ss)+1;
				
				hmn.put(ss, count);
			}else {
				hmn.put(ss, 1);
			}
		}
		
		for(Map.Entry<String, Integer> e : hmn.entrySet()) {
			System.out.println("Key :"+e.getKey()+" Value :"+e.getValue());
		}		
	}

}
