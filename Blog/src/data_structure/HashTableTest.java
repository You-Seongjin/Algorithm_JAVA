package data_structure;

import java.util.*;

public class HashTableTest {

	public static void main(String[] args) {

		// HashTable 생성 <K,V> <키값,벨류값>
		Hashtable<String, Integer> hashtable = new Hashtable<>();
		
		// 값 추가
        hashtable.put("One", 1);
        hashtable.put("Two", 2);
        hashtable.put("Three", 3);
        
        System.out.println(hashtable);
        
        // 값 찾기
        int value = hashtable.get("Two");
        System.out.println("Value for key 'Two': " + value);

        // Iterator를 이용한 순회
        for (Map.Entry<String, Integer> entry : hashtable.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

	}

}
