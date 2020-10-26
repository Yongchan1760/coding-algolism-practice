package al_test1026;

import java.util.PriorityQueue;

public class Priorityque {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.add(30);
		pq.add(40);
		pq.add(10);
		for (Integer a:pq) {
			System.out.println(a);
		}
		System.out.println("원소삭제");
		while(!pq.isEmpty()) {
			System.out.println(pq.remove());
		}

	}

}
