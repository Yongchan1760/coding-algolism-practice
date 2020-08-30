# cod_test_830
코드 테스트 하루 한문제 풀기
//배열 객체를 생성하고 그안에 5개의 숫자를 랜덤으로 저장 하고
package cod_test;

public class Test_830 {
	private static void Changhi(int[] input) {
		int max = 0;
		int min = 100;
		int i;
		for(i=0;i<input.length;i++) {
			if(max<input[i]) {
				max=input[i];
			}
		}
		for(i=0;i<input.length;i++) {
			if(min>input[i]) {
				min=input[i];
			}
		}
		System.out.println("최대값 max="+max+" "+"최소값 min="+min);
	}
	public static void main(String[] args) {
		int [] input=new int[5];
		//조심 객체 생성이아니라 배열 5개가 생긴것
		System.out.println("무작위 정수 저장");
		int i;
		for(i=0;i<input.length;i++) {
			input[i]=(int)(Math.random()*100); 
		}
		for(i=0;i<input.length;i++) {
			System.out.println(input[i]);
		}
		Changhi(input);
	}
}
