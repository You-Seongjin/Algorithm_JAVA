package data_structure;

import java.util.*;

public class HashSetTest {

	public static void main(String[] args) {
		
		// HashSet 생성
        HashSet<String> hashSet = new HashSet<>();

        // 값 추가
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Apple"); // 중복된 값은 무시됨

        // 값 순회
        for (String value : hashSet) {
            System.out.println(value);
        }
		

	}

}
