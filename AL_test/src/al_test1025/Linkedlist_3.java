package al_test1025;

import java.util.*;
public class Linkedlist_3 {

	public static void main(String[] args) {
		
		LinkedList<Integer>Li=new LinkedList<Integer>();
		//생성 소멸 갱신 보여주기
		//우유 몇개있냐고 질문!
		
		System.out.println(Li.size());
		//가지고있는 우유 몇개에요??
		Li.add(100);//문자열에 100추가 그러니 사이즈도1
		System.out.println("Li 속 값"+Li);
		//우유 100개 추가
		System.out.println("추가된 사이즈는"+Li.size());
		for (int i = 0; i < 10; i++) {
			Li.add(i*10+i);
		}System.out.println();
		System.out.println(Li.size());
		//reading 
		System.out.println(Li);
		System.out.println();
		//창고안의 내용을 모두 확인
		//int size=Li.size();//함수호출 비용을 고려하여
		//함수호출을 이용하는것은 비용이 많이들기에 이렇게 사용한다.
		for (int i = 0,size=Li.size(); i < size; i++) {
			System.out.print("안에 들은값"+Li.get(i)+" ");
			int n=Li.get(i); 
			System.out.print("따로 저장"+n+" ");
			//get을 이용해서 리딩하는방법 아줌마 1번 ~11번 주세요
			//값을 받은거 이제
		}
		System.out.println();
	}

}
