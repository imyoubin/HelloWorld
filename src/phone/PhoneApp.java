package phone;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class PhoneApp {

	public static void main(String[] args) throws IOException{
		System.out.println("************************************");
		System.out.println("*        정화번호 관리 프로그램           *");
		System.out.println("************************************");
		
		InputStream in = new FileInputStream("C:\\javaStudy\\PhoneDB.txt");
		InputStreamReader isr = new InputStreamReader(in, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream out = new FileOutputStream("C:\\javaStudy\\PhoneDB-copy.txt");  //주스트림
		OutputStreamWriter osw = new OutputStreamWriter(out, "UTF-8");						//보조스트림
		BufferedWriter bw = new BufferedWriter(osw);
		while(true) {
			String str = br.readLine();
			if(str == null) {
				break;
		}
		bw.close();
		br.close();
		}
	}
}
