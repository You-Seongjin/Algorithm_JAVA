package level3;

import java.io.*;

public class _05 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());		
		int i;
		for (i=4;i<=num;i+=4) {
			System.out.print("long ");
		} System.out.print("int");

	}

}
