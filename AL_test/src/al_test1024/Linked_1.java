package al_test1024;

import java.util.*;

public class Linked_1 {

	public static void main(String[] args) {
		List<String> list=new LinkedList<>();
		list.add("홍길동");
		list.add("김길동");
		list.add("최길동");
		list.add(0,"김구락");
		String s=list.get(0);
		int size=list.size();
		for (int i = 0; i < size; i++) {
			System.out.print(" - "+list.get(i));
		}

	}

}
