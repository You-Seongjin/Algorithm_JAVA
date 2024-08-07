package level2;
/*
괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻입니다. 
예를 들어
"()()" 또는 "(())()" 는 올바른 괄호입니다.
")()(" 또는 "(()(" 는 올바르지 않은 괄호입니다.
'(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때, 문자열 s가 올바른 괄호이면 true를 return 하고, 
올바르지 않은 괄호이면 false를 return 하는 solution 함수를 완성해 주세요.

제한사항
문자열 s의 길이 : 100,000 이하의 자연수
문자열 s는 '(' 또는 ')' 로만 이루어져 있습니다.
*/
public class Easy002 {

	boolean solution(String s) {
        boolean answer = true;
        int[] s_num = new int[s.length()];
        int sum = 0;
        
        if((s.length() % 2 == 1) || (s.charAt(0) == ')') || (s.charAt(s.length()-1) == '(')) {
        	return false;
        }else {
        	for(int i = 0 ; i<s.length() ; i++) {
            	if(s.charAt(i) == '(') {
            		s_num[i] = 1;
            	}else if(s.charAt(i) == ')'){
            		s_num[i] = 0;
            	}
            	sum = sum+s_num[i];
            	if(i+1 > sum*2) {
            		return false;
            	}
            }
        	
        }
        if(!(s.length()==sum*2)) {
    		return false;
    	}

        return answer;
    }
	
	public static void main(String[] args) {
		//String s = "(()())()";
		String s = "())((()))(()";
		//String s = "()";
		Easy002 asd = new Easy002();
		boolean a = asd.solution(s);

		System.out.println(a);
	}

}
