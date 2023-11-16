package level2;

import java.io.*;

public class _5 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int h = Integer.parseInt(br.readLine()); // 시
		int m = Integer.parseInt(br.readLine()); // 분
				
		
		if(m >= 45) 
		{ 
			m = m-45; // 분(m)이 45분 이상이면 그대로 뺌
			System.out.println(h+" "+m); //출력
		}
		else if (m < 45){
			
			if (h == 0) { h=h+24; } // ex) 0시 0분일때 -45분을 하면 23시 15분이 출력되야함 so 시(h)에 24를 더함
			// 분(m)이 45분 미만일땐 시(h)에서 -1을 하여 60분을 가져옴 m = m + 60-45
			m = m + 15; // m = m + 60 - 45 -> m = m + 15
			h = h - 1; // 60분을 가져왔기 때문에 -1을 해줌
			System.out.println(h+" "+m);
			
		}
	}
	
}
