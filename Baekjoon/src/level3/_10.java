package level3;

import java.io.*;

public class _10 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());		
		int i,k;
		
		for (i=1;i<=num;i++) {
			for(k=1;k<=num;k++) {
				if(num-k >= i) {System.out.print(" ");}
				else {System.out.print("*");}
			}
			System.out.println();
		}

	}

}
