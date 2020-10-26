package al_test1026;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEX {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("java");
		list.add("jdbc");
		list.add("servlet/jsp");
		list.add(2,"database");
		list.add("ibatis");
		int size=list.size();
		System.out.println("총 객체수:"+size);
		System.out.println();
		//삽입하면 인덱스가 뒤로밀림
		//배열은 특정인덱스의 값을 찾거나 맨뒤에 값을 
		//추가할때 유용하다
		
		String skill=list.get(2);
		System.out.println("2:"+skill);
		System.out.println();
		
		for (String i :list) {
			System.out.println(i);
		}System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("ibatis");
		
		for(String i:list) {
			System.out.println(i);
		}
	}

}
