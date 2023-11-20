package inputtest;

import java.io.*;

public class ReadTest {

	public static void main(String[] args) throws IOException{
		
		System.out.print("1. 'a' 입력: ");
		char c1 = (char)System.in.read();
		System.in.skip(2);
		System.out.println("1. 'a' 출력 : "+ c1);
		System.out.println();
		
		System.out.print("2. 'a' 입력: ");
		int c2 = System.in.read();
		System.in.skip(2);
		System.out.println("2. 'a'의 아스키 코드 : "+ c2);
		System.out.println();
		
		System.out.print("3. '1' 입력: ");
		int num2 = System.in.read()-'0';
		System.in.skip(2);
		System.out.println("3. 출력 : "+ num2);
		System.out.println();
		
		System.out.print("4. '1' 입력: ");
		int num1 = System.in.read();
		System.in.skip(2);
		System.out.println("4. '1'의 아스키코드 : "+ num1);
		System.out.println();


	}

}
