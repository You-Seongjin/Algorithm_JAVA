package level2;

public class Easy07_01 {
	
	public int solution(int n) {
        int answer = 0;
        int num_count = 0;//숫자 n의 2진수 1의 갯수
        String num_2 = Integer.toBinaryString(n);//숫자 n의 2진수화
        int stack = 0;
        int count = 0;
        int numtemp2_count = 0;
        StringBuilder numtemp = new StringBuilder();
        
        for(int i = 0 ; i < num_2.length();i++) {
        	if(num_2.charAt(i) == '1') {
        		num_count++;
        	}
        }
        
        while(count != 1) {
        	numtemp2_count=0;
        	numtemp.delete(0, numtemp.length());
        	stack++;
        	numtemp.append(Integer.toBinaryString(n+stack));
        	
        	for(int i = 0 ; i < numtemp.length();i++) {
            	if(numtemp.charAt(i)=='1') {
            		numtemp2_count++;
            	}
            }
        	
        	if(numtemp2_count == num_count) {
        		count++;
        	}
        	
        }
        answer = n+stack;
        return answer;
    }

	public static void main(String[] args) {
		Easy07_01 asd = new Easy07_01();
		int a = asd.solution(78);
		System.out.println(a);

	}

}
