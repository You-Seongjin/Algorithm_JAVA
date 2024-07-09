package level2;
import java.util.*;

public class Easy009 {
	
	public int[] solution(int brown, int yellow) {
		ArrayList<Integer> buf = new ArrayList<>();
		int tileSum = brown + yellow;//타일의 총 갯수 48 // 8 6 O / 6 4 X
		int tempx = 0;
		int tempy = 0;
		int exy = 0; 
		
		for(int i = tileSum ; i >= 1; i--) {
			if(tileSum % i != 0) {continue;}
			//System.out.print("x : "+i+" / ");
			exy = tileSum / i;
			//System.out.println("y : "+exy);           
			if( (i-2)*(exy-2) == yellow ) {
				buf.add(i);
				System.out.print("x : "+i+" / ");
				System.out.println("y : "+exy);
			}
		}
		
		if(buf.size() % 2 == 0 ) { //짝수
			tempx = buf.get(buf.size()/2 -1);
			tempy = buf.get((buf.size()/2));
			
		}else { //홀수
			tempx =  buf.get(buf.size()/2);
			tempy =  buf.get(buf.size()/2);
		}

        int[] answer = {tempx,tempy};
        return answer;
    }

	public static void main(String[] args) {
		Easy009 asd = new Easy009();
		int asdasd[] = asd.solution(18, 6);
		System.out.println(asdasd[0]+","+asdasd[1]);

	}

}
