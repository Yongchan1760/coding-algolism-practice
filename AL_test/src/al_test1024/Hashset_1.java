package al_test1024;


import java.util.*;
public class Hashset_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet<>();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		System.out.println(set);
		set.add("a");
		System.out.println("a"+set);
	}

}
