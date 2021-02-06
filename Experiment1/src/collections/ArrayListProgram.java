package collections;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListProgram {
	public static void main(String[] args) {
		ArrayList <String> stlist = new ArrayList<String>();
		stlist.add("divya");
		stlist.add("santhoshi");
		stlist.add("prathyusha");
		stlist.add("prabha");
		stlist.add("supriya");
		stlist.add("sanjana");
		
		System.out.println(stlist);
		System.out.println("Size of list : " + stlist.size());
		stlist.add(2,"lavanya");
		stlist.set(3,"rineesha");
		stlist.remove("sanjana");
		System.out.println(stlist);
		
		for(String s:stlist) {
			System.out.println(s);
		}
		Collections.sort(stlist);  
		System.out.println("\nList after sorting:"+stlist);
	}
}
