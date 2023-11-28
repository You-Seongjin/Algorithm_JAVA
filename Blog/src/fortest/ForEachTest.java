package fortest;

public class ForEachTest {

	public static void main(String[] args) {
		int score[] = {7,8,9,10,11};
        for(int i : score) {
        	System.out.println(i);
        }
        
        System.out.println("--------------------------");
        
        int score2[] = {7,8,9,10,11};
        for(int i : score2) {
        	System.out.println(score2[i-1]);
        }

	}

}
