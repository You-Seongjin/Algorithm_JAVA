package level1;

import java.io.*;

public class _02 {

	public static void main(String[] args) throws IOException{

		int num1 = System.in.read()-'0';
		System.in.skip(1);
		int num2 = System.in.read()-'0';
		
		int sum = num1 + num2;
		
		System.out.print(sum);

	}

}
