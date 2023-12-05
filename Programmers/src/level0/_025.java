package level0;

import java.lang.*;

//정수가 담긴 리스트 num_list가 주어집니다. 
//num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.

public class _025 {

	public int solution(int[] num_list) {
        int answer = 0;
        int odd_num[] = new int[num_list.length];//홀
        int odd_num_count = 0;
        int odd_sum = 0;
        
        int even_num[] = new int[num_list.length];//짝
        int even_num_count = 0;
        int even_sum = 0;
        
        for(int i = 0 ; i < num_list.length ; i++) {
        	if(num_list[i] % 2 == 1) {
        		odd_num[odd_num_count] = num_list[i];
        		odd_num_count++;
        	}else if(num_list[i] % 2 == 0) {
        		even_num[even_num_count] = num_list[i];
        		even_num_count++;
        	}
        }
        
        //홀수
        for(int i = 0; i < odd_num_count; i++ ) {
        	odd_sum = odd_sum + odd_num[i] * (int)Math.pow(10, odd_num_count - 1 - i);
        }
        //짝수
        for(int i = 0; i < even_num_count; i++ ) {
        	even_sum = even_sum + even_num[i] * (int)Math.pow(10, even_num_count - 1 - i);
        }
        
        answer = odd_sum + even_sum;
  
        return answer;
    }
	
	public static void main(String[] args) {
		int num_list[] = {3, 4, 5, 2, 1}; // => 393 , {5, 7, 8, 3} =>581
		
		
		_025 aaa = new _025();
		int result = aaa.solution(num_list);
		System.out.println(result);
		
		
	}

}
