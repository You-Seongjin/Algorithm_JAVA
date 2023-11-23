package level2;

import java.io.*;

public class _07 {

	public static void main(String[] args) throws IOException {

		int num1 = System.in.read()-48;
		System.in.skip(1);
		int num2 = System.in.read()-48;
		System.in.skip(1);
		int num3 = System.in.read()-48;
		System.in.skip(2);
		
		//System.out.println(num1+" "+num2+" "+num3);
		
		int temp=0;
		int money = 0;
		
		if (num1==num2 && num2==num3 && num1==num3) {
			money = 10000 + num1*1000;
			System.out.println(money);
			
		}else if (num1==num2 || num2==num3 || num1==num3) {
			if (num1==num2) {
				money = 1000 + num1 * 100;
				System.out.println(money);}
			else if (num2 == num3) {
				money = 1000 + num2 * 100;
				System.out.println(money);
			}
			else if (num1 == num3) {
				money = 1000+num3*100;
				System.out.println(money);
			}
			
			
		}else if (num1!=num2 && num1!=num3 && num2!=num3) {// 숫자가 전부 다를때
			if(num1>num2) {
				temp = num1;
				if (num3>temp) {
					temp = num3;
					money = temp*100;
					System.out.println(money);
				}else {
					money = temp*100;
					System.out.println(money);}
			}
			else {
				temp = num2;
				if (num3>temp) {
					temp = num3;
					money = temp*100;
					System.out.println(money);
				}else {
					money = temp*100;
					System.out.println(money);}
				}
			
		}

	}

}
