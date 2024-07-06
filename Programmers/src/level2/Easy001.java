package level2;

import java.util.*;

/*
문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다. 
str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수, 
solution을 완성하세요.
예를들어 s가 "1 2 3 4"라면 "1 4"를 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.

제한 조건
s에는 둘 이상의 정수가 공백으로 구분되어 있습니다.
*/
public class Easy001 {
	
	public String solution(String s) {
        String answer = "";
        String[] num_s = s.split(" ");
        int[] num = new int[num_s.length];

        for(int i = 0 ; i < num_s.length; i++) {
        	num[i] = Integer.parseInt(num_s[i]);
        }
        // 최댓값 최솟값 구하기
        int min=0;
        int max=0;
        for(int i = 0 ; i < num.length; i++) {
        	if(i == 0) {
        		min = num[i];
        		max = num[i];
        	}else {
        		min = min < num[i] ? min: num[i];
        		max = max > num[i] ? max: num[i];
        	}
        }
        answer = ""+min+" "+max+"";
        return answer;//"최소 최대"
    }

	public static void main(String[] args) {
		//String s = "1 2 3 4";
		//String s = "-1 -2 -3 -4";
		String s = "-1 2 -3 -4";
		Easy001 asd = new Easy001();
		String aaaa = asd.solution(s);
		System.out.println(aaaa);
	}

}
