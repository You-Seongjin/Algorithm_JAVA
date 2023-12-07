package level0;

// 정수 배열 numLog가 주어집니다. 
// 처음에 numLog[0]에서 부터 시작해 "w", "a", "s", "d"로 이루어진 문자열을 입력으로 받아 순서대로 다음과 같은 조작을 했다고 합시다.
// "w" : 수에 1을 더한다.
// "s" : 수에 1을 뺀다.
// "d" : 수에 10을 더한다.
// "a" : 수에 10을 뺀다.
// 그리고 매번 조작을 할 때마다 결괏값을 기록한 정수 배열이 numLog입니다. 즉, numLog[i]는 numLog[0]로부터 총 i번의 조작을 가한 결과가 저장되어 있습니다.
// 주어진 정수 배열 numLog에 대해 조작을 위해 입력받은 문자열을 return 하는 solution 함수를 완성해 주세요.

public class _028 {
	
	public String solution(int[] numLog) {
        String answer = "";
        //String arrLog[] = new String[numLog.length -1];
        StringBuffer arrLog = new StringBuffer("");//문자열 조작이 많을 수 있어서
        int num;
        
        for(int i = 0 ; i < numLog.length-1; i++) {
        	num = numLog[i+1] - numLog[i];
        	switch(num) {
        		case 1 : arrLog.append("w"); break;
        		case -1 : arrLog.append("s"); break;
        		case 10 : arrLog.append("d"); break;
        		case -10 : arrLog.append("a"); break;
        	}
        }
        answer = arrLog.toString();//String 형태로
        
        return answer;
    }

	public static void main(String[] args) {
		//String control = "wsdawsdassw"; 11개
		int numLog[] = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};//12개
		_028 aaa = new _028();
		String result = aaa.solution(numLog);
		System.out.println(result);
		
		
		

	}
}
