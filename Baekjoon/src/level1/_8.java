package level1;

import java.util.Scanner;

public class _8 {

	public static void main(String[] args){
		int y = 0;
		Scanner sc = new Scanner(System.in);
				
		do {
			y=sc.nextInt();
		}
		while(!(y>=1000 && y<=3000));
		
		System.out.println(y-543);
		
	}
	
}
