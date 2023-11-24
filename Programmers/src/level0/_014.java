package level0;
//연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
//12 ⊕ 3 = 123
//3 ⊕ 12 = 312
//양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.
//단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다.


public class _014 {

	public int solution1(int a, int b) {
        int answer = 0;
        String front = ""+a+b;
        String back = ""+b+a;
        int fb = Integer.parseInt(front);
        int bf = Integer.parseInt(back);
        
        if(fb == bf) {
        	answer = fb;
        }else {
        	answer = (fb > bf) ? fb:bf;
        }
        return answer;
    }

//test
	public static void main(String[] args) {
		
		_014 a = new _014();
		int qq = a.solution1(12,3);
		
		System.out.println(qq);
	}

}
