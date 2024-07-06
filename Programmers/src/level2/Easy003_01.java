package level2;

// 최적화 버전 - 퀵정렬과 같은 알고리즘 사용(자바에서 제공하는 Arrays 사용)

import java.util.*;

public class Easy003_01 {
	
	public int solution(int []A, int []B){
		int answer = 0;
		int len = A.length;
		Arrays.sort(A);
		Arrays.sort(B);

		for(int i = 0 ; i < len; i++) {
			answer = answer + A[i] * B[len-1-i];
		}

		return answer;
	}

	public static void main(String[] args) {
//		int A[] = {1, 4, 2};
//		int B[] = {5, 4, 4};
		
		int A[] = {1, 2};
		int B[] = {3, 4};
		
		Easy003_01 asd = new Easy003_01();
		asd.solution(A, B);

	}

}
