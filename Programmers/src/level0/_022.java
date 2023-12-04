package level0;

// 두 정수 a, d와 길이가 n인 boolean 배열 included가 주어집니다. 
// 첫째항이 a, 공차가 d인 등차수열에서 included[i]가 i + 1항을 의미할 때, 
// 이 등차수열의 1항부터 n항까지 included가 true인 항들만 더한 값을 
// return 하는 solution 함수를 작성해 주세요.

public class _022 {

	public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int included_length = included.length;
        int int_arr[] = new int[included_length];
        for(int i = 0 ; i < int_arr.length;i++) {
        	if(included[i] == true) {
        		int_arr[i] = a + i*d;
        	}
        }
        for(int i = 0 ; i < int_arr.length;i++) {
        	answer += int_arr[i];
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		_022 asd = new _022();
		int a = 3;//7
		int d = 4;//1
		boolean included1[] = {true, false, false, true, true};
		boolean included2[] = {false, false, false, true, false, false, false};
		int result = asd.solution(a, d, included1);
		System.out.println(result);
		

	}

}
