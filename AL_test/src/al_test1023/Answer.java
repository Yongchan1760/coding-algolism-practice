package al_test1023;

import java.util.Random;

public class Answer {//2.정답지를 토대로 3명의 사람이 답지를 확인한다 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []sumi=new int[5];//수포자들 
		int []yong=new int[5];
		int []goguma=new int[5];
		int []answer={5,1,2,2,1};//정답지
		int ant=0;//nt는 정답을 맞춘개수
		int bnt=0;
		int cnt=0;
		Random rn= new Random();
		for(int i=0;i<5;i++) {
			sumi[i]=rn.nextInt(5)+1;//수포자들이 1번~5번까지 맘대로 정답을 찍음 
			yong[i]=rn.nextInt(5)+1;
			goguma[i]=rn.nextInt(5)+1;//3.누가 누가 더많이 맞췄을까 맞은 정답 개수를 알아내자!!!
		}
		System.out.println("=========정답지==========");
		for(int i=0;i<5;i++) {
			System.out.println((i+1)+"번 문항의 정답은"+answer[i]);
		}
		for(int i=0;i<5;i++) {
			if(answer[i]==sumi[i]) {
				ant++;
			}
			else if(answer[i]==yong[i]) {
				bnt++;
			}
			else if(answer[i]==goguma[i]) {
				cnt++;
			}
		}
		System.out.println("수미가 맞춘 개수는"+ant+"용이 맞춘 개수는"+bnt+"고구마가 맞춘 개수는"+cnt);
	}

}
