package level6;

import java.io.*;

public class _03 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//int num = Integer.parseInt(br.readLine());
		int num = 5;
		int num2 = 2*num-1;//9
		for (int i = 1 ; i<=num2;i++) {
			int max = num+i-1;
			int min = num-i+1;
			int rmax = num2-i+num;
			int rmin = i-num+1;
			for(int k = 1 ; k<=num2;k++) {
				if (i > num) {
					if(k<=rmax && k>=rmin) {System.out.print("*");}
					else {System.out.print(" ");}
				}else {
					if(k<=max && k>=min) {System.out.print("*");}
					else {System.out.print(" ");}
				}
			}
			System.out.println();
		}
	}

}
