package al_test1030;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile1 {

	public static void main(String[] args) throws Exception{
		FileInputStream in=null;
		FileOutputStream out=null;
		
		try {
			in=new FileInputStream("1.txt");
			//input.txt파일에 입력스트림을 생성한다.
			out=new FileOutputStream("1_1.txt");
			//out.txt파일에 연결될 파일의 출력 스트림을 생성한다. 
			int c;
			while((c=in.read())!=-1){
				out.write(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(in!=null) {
				in.close();
			}
			if(out!=null) {
				out.close();
			}
		}

	}

}
