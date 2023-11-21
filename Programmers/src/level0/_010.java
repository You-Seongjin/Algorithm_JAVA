package level0;

//문자열 my_string, overwrite_string과 정수 s가 주어집니다. 
//문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을 
//문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.

public class _010 {
	
	public String solution(String my_string, String overwrite_string, int s) {
		
		String answer = "";
		
		char[] myArray = my_string.toCharArray();
		char[] overArray = overwrite_string.toCharArray();
		
		for(int i = 0 ; i<my_string.length() ; i++) {
			if(i < s | i >= (s+overwrite_string.length())) {
				answer += myArray[i];
			}else {
				answer += overArray[i-s];
			}
		}

        return answer;
    }

//	test
//	public static void main(String[] args) {
//
//		String str1 = "Program29b8UYP";
//		String over1 = "merS123";
//		int num1 = 7;
//		String result = "";
//		//방법 생각 : replaceAll and charAt
//		char[] str1c = str1.toCharArray();
//		char[] over1c = over1.toCharArray();
//		
//		for(int i = 0 ; i<str1.length() ; i++) {
//			if(i < num1 || i >= (num1+over1.length())) {
//				result += str1c[i];
//			}else {
//				result += over1c[i-num1];
//			}
//		}
//		System.out.println(result);
//	}

}
