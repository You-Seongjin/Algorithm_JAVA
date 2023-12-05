package level0;
// 정수 리스트 num_list가 주어질 때, 
// 마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을 
// 마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여 return하도록 solution 함수를 완성해주세요.

public class _026 {
	
	public int[] solution(int[] num_list) {
        int[] answer = {};
        
        int beforeAnswer[] = new int[num_list.length + 1];
        
        for(int i = 0 ; i < num_list.length; i++) {
        	beforeAnswer[i] = num_list[i];
        }

        if(num_list[num_list.length - 1] > num_list[num_list.length - 2]){
        	beforeAnswer[num_list.length] = num_list[num_list.length - 1] - num_list[num_list.length - 2];
        }else {
        	beforeAnswer[num_list.length] = 2 * num_list[num_list.length - 1];
        }
        answer = beforeAnswer;
        
        return answer;
    }

	public static void main(String[] args) {
		int num_list[] = {3, 4, 5, 2, 1}; // => 393 , {5, 7, 8, 3} =>581
		
		
		_026 aaa = new _026();
		int result[] = aaa.solution(num_list);
		for(int i = 0 ; i < result.length; i++) {
			System.out.print(result[i]+",");
		}
	}

}
