package level2;

import java.io.*;

public class _3 {

public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1 = Integer.parseInt(br.readLine());
		
		if (num1 % 400 == 0) {System.out.println(1);}
		else if (num1 % 100 == 0) {System.out.println(0);}
		else if (num1 % 4 == 0) {System.out.println(1);}
		else {System.out.println(0);}

	}
}
