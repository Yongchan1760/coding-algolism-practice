package al_test1031;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteStream {

	public static void main(String[] args) throws Exception{
		try {
			InputStream inputStream=new FileInputStream("a.png");
			OutputStream outputStream=new FileOutputStream("b.png");
			int c;	
			while((c=inputStream.read())!=-1) {
				outputStream.write(c);
			}
		
		} catch(Exception exception){
			
		}finally {
			System.out.println("1");
		}
		
	}

}
