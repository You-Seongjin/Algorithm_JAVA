package data_structure;

import java.util.*;

public class TreeMapTest {

	public static void main(String[] args) {
		// TreeMap 생성
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        
        // 추가
        treeMap.put("dog", 1);
        treeMap.put("bird", 2);
        treeMap.put("cat", 3);
        
        // 요소 출력 (정렬된 순서로 출력됨)
        System.out.println(treeMap);
        
        
        // dog(키)에 해당하는 벨류값 출력
        System.out.println(treeMap.get("dog"));
        
        // 수정
        treeMap.put("dog", 4);
        
        // dog(키)에 해당하는 벨류값 출력
        System.out.println(treeMap.get("dog"));
        
        // 개행(구분선)
        for(int i = 0 ; i<20; i++) {System.out.print("-");}
        System.out.println();
        
        // 키,벨류 값 출력
        Iterator<String> keys = treeMap.keySet().iterator();
        //Iterator => 열거형 클래스
		
      	while(keys.hasNext()) { // keys.hasNext() => 
      		String key = keys.next(); // keys.next() => 데이터 가져오기
      		int value = treeMap.get(key);
      		System.out.println("key : "+key+" / value : "+value);
      	}
        
        

	}

}
