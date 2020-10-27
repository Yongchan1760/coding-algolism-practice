package al_test1027;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list=new ArrayList<Integer>();
		for (int i = 1; i < 10; i++) {
			list.add(i);
		}
		Collections.shuffle(list);
		System.out.println(list);
	}

}
