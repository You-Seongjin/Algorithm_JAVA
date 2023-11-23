package level2;

import java.io.*;

public class _02 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1 = Integer.parseInt(br.readLine());
		
		int num2=num1/10;
		
		switch(num2) {
		case 10: 
		case 9: System.out.println("A"); break;
		case 8: System.out.println("B"); break;
		case 7: System.out.println("C"); break;
		case 6: System.out.println("D"); break;
		default : System.out.println("F");
		}

	}

}
