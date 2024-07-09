package drm_java_test;

import java.util.*;
import java.util.stream.Stream;

public class Codingtest {
	
	private int [] getIntArray(String[] inputStringArray) {
	   	// Your code here
		
		// 문자열 배열을 스트림으로 변환
		Stream<String> toStream = Arrays.stream(inputStringArray);
		
		//mapToint()로 문자열을 정수형으로 바꾸고, toArray()로 배열로 변환
	   	int [] results = toStream.mapToInt(Integer::parseInt).toArray();
	   	
	   	return results;
	}

	public static void main(String[] args) {
		String [] inputargs = {"1", "2", "3", "4", "100"};
		Codingtest ct = new Codingtest();
		int[] results = ct.getIntArray(inputargs);
	   	int sum = Arrays.stream(results).sum();
	   	System.out.println("결과 : " + sum);
	}

}
