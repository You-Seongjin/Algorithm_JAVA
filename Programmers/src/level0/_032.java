package level0;
//정수 l과 r이 주어졌을 때, l 이상 r이하의 정수 중에서 
//숫자 "0"과 "5"로만 이루어진 모든 정수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
//만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.
import java.util.*;

public class _032 {
	
	public int[] solution(int l, int r) {
		ArrayList<Integer> aa = new ArrayList<>();
		int count1 = 0;
		int count2 = 0; 
        for(int i = l ; i <= r; i++) {
        	if(i % 5 == 0) {
        		count2 = 0;
        		String str = ""+i+"";
        		for(int k = 0 ; k < str.length(); k++) {
        			if(str.charAt(k) == '0' || str.charAt(k) == '5') {
        				count2++;
        			}else {
        				continue;
        			}
        			if(count2 == str.length()) {
            			aa.add(i);
            			count1++;
            		}
        		}
        		
        	}
        }
        
        if(count1 == 0) {
        	int [] answer = new int[1];
        	answer[0] = -1;
        	return answer;
        }else {
        	int[] answer = new int[count1];
        	for(int i = 0 ; i < count1; i++) {
            	answer[i] = aa.get(i);
            }
        	return answer;
        }
       
        
    }

	public static void main(String[] args) {
		_032 aa = new _032();
		aa.solution(5, 555);
		//aa.solution(10, 20);

	}

}
