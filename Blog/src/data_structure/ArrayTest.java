package data_structure;

public class ArrayTest {

	public static void main(String[] args) {
		
		// 정수형 배열 선언 _방법1
		int numArray1[] = new int[5];
		// 초기화
		numArray1[0] = 1;
		numArray1[1] = 3;
		numArray1[2] = 5;
		numArray1[3] = 7;
		numArray1[4] = 9;
		
		// 정수형 배열 선언 _방법2
		int numArray2[] = new int[5];
		//for문을 이용한 초기화
		for(int i = 0; i < numArray2.length; i++) {
			numArray2[i] = i;
		}
		
		// 정수형 배열 선언 및 초기화 _방법3
        int[] numArray3 = {6, 7, 8, 9};
        
        // 정수형 배열 선언 및 초기화 _방법4
        int numArray4[] = {0, 2, 4, 6, 8, 10};
        
		String stringArray1[] = new String[3];
		
        // 문자열 배열 선언 및 초기화
        String[] fruits = {"Apple", "Banana", "Orange", "Grapes"};

	}

}
