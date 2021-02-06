package collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashtableProgram {
	public static void main(String args[]) {
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		ht.put(1216, "Divya");
		ht.put(1217, "Santhoshi");
		ht.put(1218, "Prathyusha");
		ht.put(1219, "Prabha");
		ht.put(1220, "Supriya");
		
		System.out.println(ht);
		System.out.println(ht.size());
		
		System.out.println(ht.get(1219));
		ht.remove(1216);
		for (Map.Entry it : ht.entrySet()) {
		      System.out.println("key: " + it.getKey() + ", value: " + it.getValue());  
		}
	}
}
