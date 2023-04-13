package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

public class hashmap {

	public static void main(String[] args) {
		HashMap<Integer, String> hp = new HashMap<Integer, String>(); //key pair vvalue
		hp.put(6, "Ganesh");
		hp.put(8, "Pornima");
		hp.put(9, "Rupali");
		hp.put(2, "Apeksha");
		hp.put(6, "Zunje");
		hp.put(null, "Muchate");
		
		System.out.println("hashmap key-pair valur: " + hp.get(6));//duplicate key take latest
		
		System.out.println("hashmap key-pair valur: " + hp.get(null));
		hp.remove(6);
		System.out.println(hp);
		
		Iterator<Integer> itr= hp.keySet().iterator();
		while(itr.hasNext())
		{
			Integer key= itr.next();
			String value = hp.get(key);
		//	System.out.println("key  = " + key  + "Value = " + value);
		}
		
		
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");

		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(3, "A");
		map2.put(2, "B");
		map2.put(1, "C");
	//	map2.put(4, "C");
	//	map2.put(6, "C");
	//	map2.put(8, "C");
		
	//	System.out.println("compare map1 and map2 :" + map1.equals(map2));
	//	System.out.println("compare map1 and map2 :" + map1.keySet().equals(map2.keySet())); //key
		
		HashSet<Integer> combineKeys = new HashSet<Integer>(map1.keySet());
		combineKeys.addAll(map2.keySet());
		System.out.println(combineKeys);
		System.out.println(new ArrayList<String>(map1.values()).equals(map2.values()));
		
		
		Iterator<Entry<Integer, String>> it1 = hp.entrySet().iterator();
		while (it1.hasNext()) {
					Entry<Integer, String> entry = it1.next();
					System.out.println("Key :::: " + entry.getKey() + " Value :::: " + entry.getValue());
				}
	}
	

}
