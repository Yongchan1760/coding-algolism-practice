package al_test1025;

import java.util.*;
class Star{
	int count;
	int age;
}
public class Linkedlist {

	public static void main(String[] args) {
		while(true) {
			int input=(new Scanner(System.in)).nextInt();
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < input; j++) {
					System.out.println(j+" ");
				}System.out.println();
			}
			if(input==999) {
				System.out.println("999가 입력되어 프로그램종료");
				break;
			}
		}
		List<Integer>Li=new LinkedList<>();
		Iterator<Integer>it=Li.iterator();
		while(it.hasNext()) {
			//데이터가 있으면 시작
			Integer n=it.next();
			Random a=new Random();
			it.remove();
			System.out.println(Li);
			/* 1,2 중 포문으로 숫자를 나열하고 
			 * 2번째 줄 초기화 포문 첫번째 랜덤하게 삭제
			 * 검색하고 찾고 삭제하고 할때 쓴다 */
		}
	}

}
