package level2;

/*
Leo는 집으로 돌아와서 아까 본 카펫의 노란색과 갈색으로 색칠된 격자의 개수는 기억했지만, 전체 카펫의 크기는 기억하지 못했습니다.
Leo가 본 카펫에서 갈색 격자의 수 brown, 
노란색 격자의 수 yellow가 매개변수로 주어질 때 카펫의 가로, 
세로 크기를 순서대로 배열에 담아 return 하도록 solution 함수를 작성해주세요.
 */

public class Easy009_01 {
	
	public int[] solution(int brown, int yellow) {
		int tileSum = brown + yellow;//타일의 총 갯수 12
		int tempx = 0;
		int tempy = 0;
		int xySum = tileSum + 1;
		// 1 12 .. 2 6 .. 3 4 .. 4 3.. 6 2 .. 12 1
		
		for(int x = tileSum ; x > 0 ; x--) {
			for(int y = 1 ; y <= x; y++) {
				if(tileSum == x*y && xySum> (x+y)) {
					tempx = x;
					tempy = y;
				}
			}
		}
        int[] answer = {tempx,tempy};
        return answer;
    }

	public static void main(String[] args) {
		Easy009_01 asd = new Easy009_01();
		int asdasd[] = asd.solution(10, 2);
		System.out.println(asdasd[0]+","+asdasd[1]);

	}

}
