package level0;

import java.util.Scanner;

public class _004 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		for(int i = 0 ; i < a.length(); i++) {
			int num1 = a.charAt(i);
			//대문자일때
			if(num1>=65 &&num1<=90) {
				char num2 = (char)(num1+32);
				System.out.print(num2);
			//소문자일때
			}else if(num1>=97 &&num1<=122){
				char num2 = (char)(num1-32);
				System.out.print(num2);
			}
		}
	}
}
