package al_test1025;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Star1{
	public Star1(int count,int age) {
		this.age=age;
		this.count=count;
	}
	int count;
	int age;
}

public class Linkedlist_2{
	public static void main(String[] args) {
		List<Star1>Li=new LinkedList<Star1>();
		int num=0;
		while(true) {
			int input=(new Scanner(System.in)).nextInt();
			if(input==999) {
				System.out.println("999가 입력되어 프로그램 종료");
				break;		
			}
			for(int i=0;i<Li.size();) {
				int rn=(new Random()).nextInt(2);
				if(rn%2==0) {
					Li.remove(i);
				}
				else {
					Li.get(i).age++;
					i++;
				}
			}
		}
	}
}