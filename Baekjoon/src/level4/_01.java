package level4;


import java.util.Scanner;

public class _01 {

	public static void main(String[] args) {
		//원래는 num[]안 숫자는 -100<숫자<100여야함
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] = new int[num];
		int count = 0;
		int user;
		
		for(int i = 0 ; i<num; i++) {
			arr[i] = sc.nextInt();
		}
		user = sc.nextInt();
		for(int i = 0 ; i < arr.length; i++) {
			if(arr[i] == user) {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
