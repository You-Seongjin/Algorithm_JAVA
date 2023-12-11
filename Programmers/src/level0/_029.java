package level0;

// 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [i, j] 꼴입니다.
// 각 query마다 순서대로 arr[i]의 값과 arr[j]의 값을 서로 바꿉니다.
// 위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.

public class _029 {
	
	public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        int a = 0;
        int b = 0; 
        int aa = 0;
        int bb = 0;
        
        for(int i = 0 ; i<queries.length; i++) {
        	for(int k = 0 ; k<queries[i].length; k++) {
        		if(k == 0) {
        			a = queries[i][k];
        		}else if(k == 1) {
        			b = queries[i][k];
        		}
        	}
        	aa = answer[a];
        	bb = answer[b];
        	answer[a] = bb;
        	answer[b] = aa;
        }

        return answer;
    }

	public static void main(String[] args) {
		int arr[] = {0, 1, 2, 3, 4};
		int queries[][] = {{0, 3},{1, 2},{1, 4}};
		
		_029 aaa = new _029();
		int[] result = aaa.solution(arr, queries);
		
		for(int i = 0 ; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

}
