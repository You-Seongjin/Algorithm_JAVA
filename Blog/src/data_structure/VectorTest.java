package data_structure;

import java.util.*;

public class VectorTest {

	public static void main(String[] args) {
		
		// Vector 생성
		Vector<String> vector = new Vector<>();
		vector.add("dog");
		vector.add("bird");
		vector.add("cat");
		
		// vector 출력
		System.out.println(vector);
		
		// index 2번째 요소 출력
		System.out.println(vector.get(2));
		
		// 수정
		vector.set(0, "Java");
		
		// 삭제
		vector.remove("bird");
		
		// 출력
		System.out.println(vector);
		
		// vector 출력
		System.out.println(vector.size());
		
		
	}

}
