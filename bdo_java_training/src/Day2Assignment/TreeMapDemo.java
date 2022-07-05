package Day2Assignment;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		  TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(11,"Amit");    
	      map.put(9,"Ravi");    
	      map.put(13,"Vijay");    
	      map.put(15,"Rahul");    
	        
	      for(Map.Entry m:map.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }    
	      
//	      get the first (lowest) key and the last (highest) key currently in a map
	      System.out.println("Greatest key: " + map.firstKey());
		  System.out.println("Least key: " + map.lastKey());
		   
//		  get a key-value mapping associated with the greatest key and the least key in a map.
		  
//		  method-1
		  Entry<Integer, String> first =  map.firstEntry();
		  Entry<Integer, String> last =  map.lastEntry();
		  System.out.println("Least key: "+ first.getKey() + " "+" value: " + first.getValue());
		  System.out.println("Greatest key: "+ last.getKey() + " "+" value: " + last.getValue());
		  
//		  method-2
		  System.out.println("Least key: " + map.firstEntry());
		  System.out.println("Greatest key: " + map.lastEntry());
		  
		  Set<Integer> keyset = map.descendingKeySet();
		  System.out.println("TreeMap after reverse:");
	        for (Integer key : keyset) {
	            System.out.println(key + " = "
	                               + map.get(key));
	        }
       }
	  
	}


