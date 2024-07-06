package level2;
import java.util.*;

/* 
 * 짝지어 제거하기는, 알파벳 소문자로 이루어진 문자열을 가지고 시작합니다. 
 * 먼저 문자열에서 같은 알파벳이 2개 붙어 있는 짝을 찾습니다. 
 * 그다음, 그 둘을 제거한 뒤, 앞뒤로 문자열을 이어 붙입니다. 
 * 이 과정을 반복해서 문자열을 모두 제거한다면 짝지어 제거하기가 종료됩니다. 
 * 문자열 S가 주어졌을 때, 짝지어 제거하기를 성공적으로 수행할 수 있는지 반환하는 함수를 완성해 주세요. 
 * 성공적으로 수행할 수 있으면 1을, 아닐 경우 0을 리턴해주면 됩니다.
 * 
 * 예를 들어, 문자열 S = baabaa 라면
 * b aa baa → bb aa → aa →
 * 의 순서로 문자열을 모두 제거할 수 있으므로 1을 반환합니다.
 * */

public class Easy08 {
	
	public int solution(String s)
    {
		ArrayList<Integer> s_arr = new ArrayList<>();
		ArrayList<Integer> s_arr2 = new ArrayList<>();
		
		for(int i = 0 ; i < s.length(); i++) {
			s_arr.add((int)s.charAt(i));
		}

		for(int i = 0 ; i < s_arr.size(); i++) {
			//System.out.println(i+"번");
			if( (s_arr2.size() > 0) && s_arr.get(i) == s_arr2.get(s_arr2.size()-1)) {
				s_arr2.remove(s_arr2.size()-1);
			}else {
				s_arr2.add(s_arr.get(i));
			}
			//System.out.println(s_arr2.toString());

		}
        int answer = (s_arr2.size() > 0) ? 0 : 1;

        return answer;
    }

	public static void main(String[] args) {
		Easy08 asdasd = new Easy08();
		String s = "baaabaa";
		asdasd.solution(s);

	}

}
