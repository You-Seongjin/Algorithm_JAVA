package data_structure;

import java.util.*;

public class HashMapTest {

	public static void main(String[] args) {
		
		// HashMap 생성 <K,V> <키값,벨류값>
        HashMap<String, Integer> hashMap = new HashMap<>();

        // 추가
        hashMap.put("dog", 1);
        hashMap.put("bird", 2);
        hashMap.put("cat", 3);
        
        // 출력
        System.out.println(hashMap);
        
        // dog(키)에 해당하는 벨류값 출력
        System.out.println(hashMap.get("dog"));
        
        // 수정
        hashMap.put("dog", 4);
        
        // dog(키)에 해당하는 벨류값 출력
        System.out.println(hashMap.get("dog"));
        
        // 개행(구분선)
        for(int i = 0 ; i<20; i++) {System.out.print("-");}
        System.out.println();
        
        // 키,벨류 값 출력
        Iterator<String> keys = hashMap.keySet().iterator();
        //Iterator => 열거형 클래스
		
      	while(keys.hasNext()) { // keys.hasNext() => 
      		String key = keys.next(); // keys.next() => 데이터 가져오기
      		int value = hashMap.get(key);
      		System.out.println("key : "+key+" / value : "+value);
      	}
        
	}

}
