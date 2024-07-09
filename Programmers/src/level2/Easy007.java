package level2;
/*
자연수 n이 주어졌을 때, n의 다음 큰 숫자는 다음과 같이 정의 합니다.

조건 1. n의 다음 큰 숫자는 n보다 큰 자연수 입니다.
조건 2. n의 다음 큰 숫자와 n은 2진수로 변환했을 때 1의 갯수가 같습니다.
조건 3. n의 다음 큰 숫자는 조건 1, 2를 만족하는 수 중 가장 작은 수 입니다.
예를 들어서 78(1001110)의 다음 큰 숫자는 83(1010011)입니다.

자연수 n이 매개변수로 주어질 때, 
n의 다음 큰 숫자를 return 하는 solution 함수를 완성해주세요.

제한 사항
n은 1,000,000 이하의 자연수 입니다.
*/

public class Easy007 {
	
	public int solution(int n) {
		int answer = 0;
        int num_count = 0;//숫자 n의 2진수 1의 갯수
        String num_2 = Integer.toBinaryString(n);//숫자 n의 2진수화
        int stack = 0;
        int count = 0;
        int numtemp2_count = 0;
        String numtemp="";
        
        for(int i = 0 ; i < num_2.length();i++) {
        	if(num_2.charAt(i) == '1') {
        		num_count++;
        	}
        }
        
        while(count != 1) {
        	numtemp2_count=0;
        	stack++;
        	numtemp = Integer.toBinaryString(n+stack);
        	
        	for(int i = 0 ; i < numtemp.length();i++) {
            	if(numtemp.charAt(i)=='1') {
            		numtemp2_count++;
            	}
            }
        	
        	if(numtemp2_count == num_count) {
        		count++;
        	}
        }
        answer = n+stack;
        
        return answer;
    }
	
	public static void main(String[] args) {

		Easy007 asd = new Easy007();
		int a = asd.solution(78);
		System.out.println(a);
	}

}
