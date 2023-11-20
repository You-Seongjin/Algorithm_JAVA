package inputtest;

import java.io.*;

public class BufferedReaderTest {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("1. 문자열 입력 : ");
		String str1 = br.readLine();
		System.out.println("1. 출력 : "+str1);
		System.out.println();
		
		System.out.print("2. 숫자 입력 : ");
		int num1 = Integer.parseInt(br.readLine());//정수형태로 파싱
		System.out.println("2. 출력 : "+num1);
		
		
	}

}
