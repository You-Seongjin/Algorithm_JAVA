package level1;
/*
선물을 직접 전하기 힘들 때 카카오톡 선물하기 기능을 이용해 축하 선물을 보낼 수 있습니다. 
당신의 친구들이 이번 달까지 선물을 주고받은 기록을 바탕으로 다음 달에 누가 선물을 많이 받을지 예측하려고 합니다.

두 사람이 선물을 주고받은 기록이 있다면, 이번 달까지 두 사람 사이에 더 많은 선물을 준 사람이 다음 달에 선물을 하나 받습니다.
예를 들어 A가 B에게 선물을 5번 줬고, B가 A에게 선물을 3번 줬다면 다음 달엔 A가 B에게 선물을 하나 받습니다.
두 사람이 선물을 주고받은 기록이 하나도 없거나 주고받은 수가 같다면, 선물 지수가 더 큰 사람이 선물 지수가 더 작은 사람에게 선물을 하나 받습니다.
선물 지수는 이번 달까지 자신이 친구들에게 준 선물의 수에서 받은 선물의 수를 뺀 값입니다.
예를 들어 A가 친구들에게 준 선물이 3개고 받은 선물이 10개라면 A의 선물 지수는 -7입니다. 
B가 친구들에게 준 선물이 3개고 받은 선물이 2개라면 B의 선물 지수는 1입니다. 
만약 A와 B가 선물을 주고받은 적이 없거나 정확히 같은 수로 선물을 주고받았다면, 다음 달엔 B가 A에게 선물을 하나 받습니다.
만약 두 사람의 선물 지수도 같다면 다음 달에 선물을 주고받지 않습니다.
위에서 설명한 규칙대로 다음 달에 선물을 주고받을 때, 당신은 선물을 가장 많이 받을 친구가 받을 선물의 수를 알고 싶습니다.

친구들의 이름을 담은 1차원 문자열 배열 friends 이번 달까지 친구들이 주고받은 선물 기록을 담은 1차원 문자열 배열 gifts가 매개변수로 주어집니다. 
이때, 다음달에 가장 많은 선물을 받는 친구가 받을 선물의 수를 return 하도록 solution 함수를 완성해 주세요.
*/

public class Kakao2024_01 {
	
	
	public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        
        int gift_num[][] = new int[friends.length][friends.length];
		int gift_sum[] = new int[friends.length];// 선물 지수
		int gift_destiny[] = new int[friends.length];// 예상 선물
		
		for(int i = 0 ; i < gifts.length; i++) {
			for(int k = 0 ; k < friends.length ; k++) {
				if(gifts[i].substring(0,gifts[i].indexOf(" ")).equals(friends[k])) {
					for(int h = 0 ; h < friends.length; h++) {
						if(gifts[i].substring(gifts[i].indexOf(" ")+1).equals(friends[h])) {
							gift_num[k][h]++;
						}
					}
				}
			}
		}
        
		for(int i = 0 ; i < gift_sum.length; i++) {
			int give = 0; // 준선물
			int receive = 0; // 받은선물
			
			for(int k = 0 ; k < gift_num.length; k++) {
				give += gift_num[i][k];
				receive += gift_num[k][i];
			}
			gift_sum[i]= give - receive;
		}
		
		//gift_destiny 받을 선물
		for(int i = 0 ; i < gift_destiny.length; i++) {
			for(int k = 0 ; k < gift_num[i].length ; k++) {
				if(i == k) {
							
				}
				else if(gift_num[i][k] > gift_num[k][i]) {
					gift_destiny[i] += 1;
				}else if(gift_num[i][k] == gift_num[k][i]) {
					if(gift_sum[i] > gift_sum[k]) {
						gift_destiny[i] +=1;
					}
							
				}
			}
		}
		
		for(int i = 0 ; i < gift_destiny.length ; i++) {
			if(answer < gift_destiny[i]) {
				answer =  gift_destiny[i];
			}
		}

        return answer;
    }

	public static void main(String[] args) {
		
		String friends[] = {"muzi", "ryan", "frodo", "neo"};
		String gift[] = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
		
		Kakao2024_01 abc = new Kakao2024_01();
		int answer = abc.solution(friends,gift);

		System.out.println(answer);

	}

}
