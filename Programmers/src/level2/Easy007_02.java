package level2;

public class Easy007_02 {
	
	public int solution(int n) {
		int postPattern = n & -n, 
				smallPattern = ((n ^ (n + postPattern)) / postPattern) >> 2;
	    return n + postPattern | smallPattern;
	}
	
	

	public static void main(String[] args) {
		Easy007_02 asd = new Easy007_02();
		int a = asd.solution(78);
		System.out.println(a);

	}

}
