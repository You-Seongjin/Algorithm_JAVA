package level0;
// 3페이지 주사위게임3
//1부터 6까지 숫자가 적힌 주사위가 네 개 있습니다. 네 주사위를 굴렸을 때 나온 숫자에 따라 다음과 같은 점수를 얻습니다.
//네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.
//세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)2 점을 얻습니다.
//주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.
//어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.
//네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.
//네 주사위를 굴렸을 때 나온 숫자가 정수 매개변수 a, b, c, d로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.


public class _037 {
	
	public int solution(int a, int b, int c, int d) {
        int answer = 0;
        //방법1 1 2 3 4 5 6의 갯수
        // index  0 1 2 3 4 5  < == > number 1 2 3 4 5 6
        int countnum[] = new int[6];

        int numabcd[] = new int[4]; // {a b c d}
        numabcd[0] = a;numabcd[1] = b; numabcd[2] = c;numabcd[3] = d;
        
        for(int i = 0 ; i < 6; i++) {
        	for(int k = 0 ; k < 4; k++) {
        		if(i+1 == numabcd[k]) {
        			countnum[i]++;
        		}
        	}
        }
        // 테스트 출력
        for(int i = 0 ; i < countnum.length; i++) {System.out.println(i+1 +" : "+countnum[i]);        }
  
        int casenum = 0; //switch case 숫자
        int p = 0;
        int q = 0;
        int r = 0;
        int maxnum = 0;
        // ex) numabcd = {a, b, c, d}
        // ex) numabcd = {2, 2, 2, 2} p = 2
        // ex) numabcd = {4, 1, 4, 4} p = 4 , q = 1
        // ex) numabcd = {3, 5, 3, 5} p = 3 , q = 5
        // ex) numabcd = {2, 5, 2, 6} p = 2 , q = 5 , r = 6
        // ex) numabcd = {6, 4, 2, 5} p = 2
        
        for(int i = 0 ; i < countnum.length; i++) {
        	
        	
        	
        	if(countnum[i] == 4) {
        		casenum = 4;
        		p = i+1;
        	}else if(countnum[i] == 3){
        		casenum = 3;
        		p = i+1;
        		for(int k = 0 ; k < countnum.length ; k++) {
        			if(countnum[k] == 1) {
        				q = k+1;
        			}
        		}
        	}else if(countnum[i] == 2) {
        		
        	}

        }
        
        //System.out.println("중복 숫자 : " + maxcountnum);

        return answer;
    }
	

	public static void main(String[] args) {
		_037 aa = new _037();
		//int result = aa.solution(2, 2, 2, 2);
		aa.solution(4, 1, 4, 4);
		//aa.solution(6, 3, 3, 6);
		//aa.solution(2, 5, 2, 6);
		//aa.solution(6, 4, 2, 5);
		//System.out.println(result);
		

	}

}
