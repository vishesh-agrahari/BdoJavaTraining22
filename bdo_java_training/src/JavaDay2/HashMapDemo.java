package JavaDay2;
// refer this https://www.programiz.com/java-programming/library/hashmap/keyset
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap();
		map.put(1, "Vishesh");
		map.put(90, "Shashant");
		map.put(3, "Rakesh");
		for (Entry<Integer, String> me :map.entrySet()) {
			
           System.out.print(me.getKey() + ":");
           System.out.println(me.getValue());
       }
		Set st = new HashSet(map.entrySet());
		
		Set<Integer> keys = new HashSet(map.keySet());
		Iterator<Integer> itr = keys.iterator();
		while(itr.hasNext()) {
		   System.out.println(itr.next());
		}
		
		List<String> value = new ArrayList(map.values());
		Iterator<String> itr1 = value.iterator();
		while(itr1.hasNext()) {
		   System.out.println(itr1.next());
		}

	}

}
