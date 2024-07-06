package level2;
//속도 향상

public class Easy06_01 {
	
	public int solution(int n) {
        int answer = 0;
        int sum = 0;
        int start = 1;
        
        while (start <= n) {
            sum = 0;
            for (int i = start; sum < n; i++) {
                sum += i;
                if (sum == n) {
                    answer++;
                    break;
                }
            }
            start++;
        }
        
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
