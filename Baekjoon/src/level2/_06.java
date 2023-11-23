package level2;

import java.io.*;

public class _06 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int h = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int add_m = Integer.parseInt(br.readLine());
		
		int sum_m = m + add_m;
		int remainder_m = sum_m % 60; // 나머지
		int quotient_m = sum_m / 60; // 몫
		int sum_h = h + quotient_m;
		
		
		if ((h >= 0 && h< 24) && ( m >= 0 && m < 60) && (add_m >=0)){
			
			if( sum_h >=24 ) {
				sum_h = sum_h-24;
				System.out.println(sum_h+" "+remainder_m);
			}else {
				System.out.println(sum_h+" "+remainder_m);
			}
			
		}else { System.out.println("잘못입력"); }

	}
	
}
