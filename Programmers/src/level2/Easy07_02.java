package level2;

public class Easy07_02 {
	
	public int solution(int n) {
		int postPattern = n & -n, 
				smallPattern = ((n ^ (n + postPattern)) / postPattern) >> 2;
	    return n + postPattern | smallPattern;
	}
	
	

	public static void main(String[] args) {
		Easy07_02 asd = new Easy07_02();
		int a = asd.solution(78);
		System.out.println(a);

	}

}
