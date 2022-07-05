package JavaDay2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("python");
		hs.add("java");
		hs.add("python");
		hs.add(null);
		hs.add("cpp");
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
		   System.out.println(itr.next());
		}
	}

}
