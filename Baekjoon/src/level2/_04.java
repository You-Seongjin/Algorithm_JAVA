package level2;

import java.io.*;

public class _04 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		
		if (num1 == 0 || num2 == 0) {System.out.println("사분면을 판단할 수 없습니다.");}
		else if (num1 > 0 && num2 > 0) {System.out.println("1");}
		else if (num1 < 0 && num2 > 0) {System.out.println("2");}
		else if (num1 < 0 && num2 < 0) {System.out.println("3");}
		else if (num1 > 0 && num2 < 0) {System.out.println("4");}

	}
	
}
