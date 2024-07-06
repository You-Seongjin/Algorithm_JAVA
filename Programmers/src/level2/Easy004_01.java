package level2;

public class Easy004_01 {
	
	public String solution(String s) {
        String answer = "";
        StringBuffer answer_cal = new StringBuffer();
        
        for(int i = 0 ; i < s.length(); i++) {
        	if(i == 0 || s.charAt(i-1)==' ') {
        		if(s.charAt(i) >= 97 && s.charAt(i) <= 122) {
        			answer_cal.append("" + (char)(s.charAt(i)-32));
        			
        		}else {
        			answer_cal.append("" + s.charAt(i));
        		}
        		
        	}else {
        		if(s.charAt(i) >= 65 && s.charAt(i) <= 90) {
        			answer_cal.append("" + (char)(s.charAt(i)+32));
        		}
        		else {
        			answer_cal.append("" + s.charAt(i));
        		}
        	}
        }
        answer=answer_cal.toString();
        
        return answer;
    }

	public static void main(String[] args) {
		String s = "3people unFollowed me";

		Easy004_01 asd = new Easy004_01();
		asd.solution(s);
	}

}
