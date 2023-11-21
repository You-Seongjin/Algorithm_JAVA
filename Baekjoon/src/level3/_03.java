package level3;

import java.io.*;

public class _03 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int i,sum=0;
		for (i=1;i<=num;i++) {
			sum = sum + i;
			
		}System.out.println(sum);

	}

}
