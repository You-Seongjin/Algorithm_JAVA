package level2;
/*
1부터 n까지 번호가 붙어있는 n명의 사람이 영어 끝말잇기를 하고 있습니다. 영어 끝말잇기는 다음과 같은 규칙으로 진행됩니다.

1번부터 번호 순서대로 한 사람씩 차례대로 단어를 말합니다.
마지막 사람이 단어를 말한 다음에는 다시 1번부터 시작합니다.
앞사람이 말한 단어의 마지막 문자로 시작하는 단어를 말해야 합니다.
이전에 등장했던 단어는 사용할 수 없습니다.
한 글자인 단어는 인정되지 않습니다.
다음은 3명이 끝말잇기를 하는 상황을 나타냅니다.

tank → kick → know → wheel → land → dream → mother → robot → tank

위 끝말잇기는 다음과 같이 진행됩니다.

1번 사람이 자신의 첫 번째 차례에 tank를 말합니다.
2번 사람이 자신의 첫 번째 차례에 kick을 말합니다.
3번 사람이 자신의 첫 번째 차례에 know를 말합니다.
1번 사람이 자신의 두 번째 차례에 wheel을 말합니다.
(계속 진행)
끝말잇기를 계속 진행해 나가다 보면, 3번 사람이 자신의 세 번째 차례에 말한 tank 라는 단어는 이전에 등장했던 단어이므로 탈락하게 됩니다.

사람의 수 n과 사람들이 순서대로 말한 단어 words 가 매개변수로 주어질 때, 
가장 먼저 탈락하는 사람의 번호와 그 사람이 자신의 몇 번째 차례에 탈락하는지를 구해서 return 하도록 solution 함수를 완성해주세요.
*/

import java.util.*;
public class Easy011 {
	
	public int[] solution(int n, String[] words) {
        HashSet<String> qwe1 = new HashSet<>();
        ArrayList<String> qwe2 = new ArrayList<>();
        int incorrectIndex_A = 0;
        int incorrectIndex_B = 0;
        int humanNum = 0; // 가장 먼저 탈락하는 사람의 번호
        int orderNum = 0; // 그 사람이 자신의 몇 번째 차례에 탈락하는지
        int incorrectCount =0;
        int hi=0;
        
		// 글자 중복
		for(int i = 0 ; i < words.length; i++) {
			qwe1.add(words[i]);
			qwe2.add(words[i]);
			if(qwe1.size() != qwe2.size()) {
				incorrectIndex_A=i+1;
				incorrectCount++;
				break;
			}
		}
		// 끝말잇기 틀림
		for(int i = 0 ; i < words.length-1; i++) {
			if(words[i].charAt(words[i].length()-1) != words[i+1].charAt(0)) {
				incorrectIndex_B = i+2;
				incorrectCount++;
				break;
			}
		}
		
		if(incorrectCount == 0 ) {
			humanNum = 0;
			orderNum = 0;
		}else if(incorrectCount == 1) {
			hi = incorrectIndex_A > incorrectIndex_B ? incorrectIndex_A : incorrectIndex_B;
			humanNum = hi % n;
			humanNum = humanNum == 0 ? humanNum+n : humanNum;
			orderNum = (hi-1) / n +1;
			
		}else if(incorrectCount == 2) {
			humanNum = incorrectIndex_A < incorrectIndex_B ? (incorrectIndex_A % n): (incorrectIndex_B % n);
			humanNum = humanNum == 0 ? humanNum+n : humanNum;
			orderNum = incorrectIndex_A < incorrectIndex_B ? ((incorrectIndex_A-1) / n +1) : ((incorrectIndex_B-1)/ n +1);
		}
		
		//System.out.println( (5-1)/3 +2 );
		//System.out.println(incorrectIndex_A+"_A/B_"+incorrectIndex_B);
		//System.out.println(humanNum+"/"+orderNum);
		
		
		int[] answer = {humanNum,orderNum};

        return answer;
    }

	public static void main(String[] args) {
		Easy011 asd = new Easy011();
		int n = 3;
		String[] ddd = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		asd.solution(n,ddd);
		
		;

	}

}
