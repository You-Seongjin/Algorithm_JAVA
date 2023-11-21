package level3;

import java.io.*;

public class _09 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());		
		int i,k;
		
		for (i=1;i<=num;i++) {
			for(k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
