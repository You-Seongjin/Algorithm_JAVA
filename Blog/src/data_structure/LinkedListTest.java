package data_structure;

import java.util.*;

public class LinkedListTest {

	public static void main(String[] args) {
		// LinkedList 생성
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("dog");
        linkedList.add("bird");
        linkedList.add("cat");
        
        // 요소 출력
        System.out.println(linkedList);

        // 추가
        linkedList.add(1, "tiger");
        
        // 요소 출력
        System.out.println(linkedList);
        
        // 인덱스 2번쨰 출력
        System.out.println(linkedList.get(2));
        
        // 수정
        linkedList.set(1,"apple");
        
        // 삭제
        linkedList.remove("cat");
        
        // 요소 출력
        System.out.println(linkedList); 
        
        
        
	}

}
