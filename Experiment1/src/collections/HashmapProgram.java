package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapProgram {
	public static void main(String[] args) {

		HashMap<String,String> hs = new HashMap<String,String>();
		hs.put("Gadhiraju","Divya");
		hs.put("Guttula","Santhoshi");
		hs.put("Imandi", "Prathyusha");
		hs.put("Kalidindi","Prabha");
		hs.put("Maddula","Supriya");
		
		System.out.println(hs);
		System.out.println(hs.size());
		
		System.out.println(hs.get("Kalidindi") + "\n");
		hs.remove("Divya");
		Set set = hs.entrySet();
		Iterator i = set.iterator();
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry)i.next();
			System.out.println(me.getKey() + " : " + me.getValue());
		}
		
	}
}
