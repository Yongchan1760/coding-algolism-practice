package al_test1026;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class HashSetEX {

	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		
		set.add("java");
		set.add("jdbc");
		set.add("servlet.jsp");
		set.add("java");
		set.add("ibatis");
		
		int size=set.size();
		System.out.println(size);
		System.out.println();
		
		Iterator<String> iterator=set.iterator();
		while(iterator.hasNext()) {
			String element=iterator.next();
			System.out.println(element);
		}
		
		set.remove("jdbc");
		set.remove("ibatis");
		
		System.out.println("총객체수:"+set.size());
		
		for(String i:set) {
			System.out.println(set);
		}System.out.println();
		
		iterator=set.iterator();
		for(String element:set) {
			System.out.println(element);
		}System.out.println();
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어있음");
		}
	}

}
