package level3;

import java.io.IOException;

public class _01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int i, sum=0;
		
		int num = System.in.read()-48;
			
		for (i = 1; i<= 9; i++) {
			sum = num*i;
			System.out.println(num+" * "+i+" = "+sum);
			
		}
		
		
	}

}
