package stone;

public class Stone {

	public void su() {
		
	}
	public void fa() {
		
	}
	
	public static void main(String[] args) {
		// 초기 0으로 세팅 성공시 1 실패시 -1
		
		int pa_stone1[] = new int[10];
		int pa_stone2[] = new int[10];
		int na_stone1[] = new int[10];
		
		for(int i = 0 ; i<10; i++) {
			pa_stone1[i] = 0;
			pa_stone2[i] = 0;
			na_stone1[i] = 0;
		}
		for(int i = 0 ; i<10; i++) {
			System.out.print(pa_stone1[i]+" ");
		}System.out.println();
		for(int i = 0 ; i<10; i++) {
			System.out.print(pa_stone2[i]+" ");
		}System.out.println();
		for(int i = 0 ; i<10; i++) {
			System.out.print(na_stone1[i]+" ");
		}System.out.println();
		
		
		
		System.out.println("hi");
		System.out.println();

	}

}
