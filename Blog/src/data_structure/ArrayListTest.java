package data_structure;

import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
		//ArrayList 생성
		ArrayList<String> alist = new ArrayList<>();
		
		// 요소 추가
		alist.add("apple");
		alist.add("banana");
		alist.add("coffee");
		alist.add("dog");
		alist.add("element");
		
		// 접근
		System.out.println(alist.get(0));
		
		// 수정
		alist.set(0, "airplane");
		
		// 삭제
		alist.remove(2);
		
		// 출력 방법_1 | alist.size()는 ArrayList 크기 
		for (int i = 0 ; i<alist.size() ; i++) {
			System.out.println(alist);
		}
		
		// 구분선
		System.out.println();
		for(int i = 0 ; i<10; i++) {System.out.print("-");}
		System.out.println();
		
		// 출력 방법_2
		for (int i = 0 ; i<alist.size() ; i++) {
			System.out.println(alist.get(i));
		}
		
		// 구분선
		System.out.println();
		for(int i = 0 ; i<10; i++) {System.out.print("-");}
		System.out.println();
		
		// 출력 방법_3
		for (String aa : alist) {
            System.out.println(aa);
        }
	
	}

}
