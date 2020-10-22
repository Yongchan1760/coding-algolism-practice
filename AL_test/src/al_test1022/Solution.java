package al_test1022;

public class Solution {

	public String Solution(int n) {
		String answer="";
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				answer+="수";
			}else {
				answer+="박";
			}
		}
		return answer;
		// TODO Auto-generated method stub
		
	}

}
