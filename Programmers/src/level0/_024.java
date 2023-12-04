package level0;

// 정수가 담긴 리스트 num_list가 주어질 때, 
// 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.

public class _024 {

	public int solution(int[] num_list) {
        int answer = 0;
        int sum = 1;
        int ssuumm = 0;
        
        for(int i = 0 ; i < num_list.length; i++) {
        	sum *= num_list[i];
        	ssuumm += num_list[i];
        }
        ssuumm *= ssuumm;
        if(sum < ssuumm) {
        	answer = 1;
        }else if(sum > ssuumm) {
        	answer = 0 ;
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
}
