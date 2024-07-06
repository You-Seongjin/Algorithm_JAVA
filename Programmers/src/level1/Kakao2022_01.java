package level1;

import java.util.*;

/* -- 시간초과
신입사원 무지는 게시판 불량 이용자를 신고하고 처리 결과를 메일로 발송하는 시스템을 개발하려 합니다. 
무지가 개발하려는 시스템은 다음과 같습니다.

각 유저는 한 번에 한 명의 유저를 신고할 수 있습니다.
신고 횟수에 제한은 없습니다. 서로 다른 유저를 계속해서 신고할 수 있습니다.
한 유저를 여러 번 신고할 수도 있지만, 동일한 유저에 대한 신고 횟수는 1회로 처리됩니다.
k번 이상 신고된 유저는 게시판 이용이 정지되며, 해당 유저를 신고한 모든 유저에게 정지 사실을 메일로 발송합니다.
유저가 신고한 모든 내용을 취합하여 마지막에 한꺼번에 게시판 이용 정지를 시키면서 정지 메일을 발송합니다.
*/

public class Kakao2022_01 {
	
	public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        ArrayList<String> realreport = new ArrayList<>();
        int[] banNum = new int[id_list.length];//신고당한 횟수
        int ban[] = new int[id_list.length];//정지된 ID
        
        //중복 리폿 방지
        for(int i = 0 ; i < report.length; i++) {
        	int count = 0 ;
        	if(i == 0) {
        		realreport.add(report[0]);
        	}else {
        		for(int h = 0 ; h < realreport.size(); h++) {
        			if(report[i].equals(realreport.get(h))) {//같은것이 있다면
        				count++;
        				break;
        			}
        		}
        		if(count == 0) {//같은것이 없다면
        			realreport.add(report[i]);
        		}
        	}
        }

        for(int i = 0 ; i < realreport.size(); i++) {
        	for(int h = 0 ; h < id_list.length ; h++) {
        		if(realreport.get(i).substring(realreport.get(i).indexOf(" ")+1).equals(id_list[h])) {
        			banNum[h] += 1;
        		}
        	}
        }

        for(int i = 0 ; i < banNum.length ; i++) {
        	if(banNum[i] >= k) {
        		ban[i] = 1;
        	}
        }

        for(int i = 0 ; i < ban.length ; i++) {
        	if(ban[i]==1) {
        		for(int h = 0 ; h < realreport.size(); h++) {
        			if(id_list[i].equals(realreport.get(h).substring(realreport.get(h).indexOf(" ")+1))) {
        				for(int d = 0 ; d < id_list.length ;d++) {
        					if(id_list[d].equals(realreport.get(h).substring(0,realreport.get(h).indexOf(" ")))) {
        						answer[d] += 1;
        					}
        				}
        				
            		}
        		}
        		
        	}
        }

        //
        for(int i = 0 ; i< realreport.size() ; i++) {
			System.out.println(realreport.get(i));
		}
        System.out.println("=====================");
        for(int i = 0 ; i < id_list.length ; i++) {
        	System.out.println(id_list[i]);
        }
        System.out.println("===밴먹은친구===========");
        for(int i = 0 ; i < ban.length ; i++) {
        	if(ban[i]==1) {
        		System.out.println(i+" : "+id_list[i]);
        	}
        }
        System.out.println("=====================");
        for(int i = 0 ; i < answer.length; i++) {
        	System.out.println(answer[i]);	
        }

        return answer;//정지시킨 사용자의 수 파악
    }

	public static void main(String[] args) {
		
		String id_list[] = {"muzi", "frodo", "apeach", "neo"};
		String report[] = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;//신고횟수
		//String id_list[] = {"con", "ryan"};
		//String report[] = {"ryan con", "ryan con", "ryan con", "ryan con"};
		
		//System.out.println(report[1].substring(0,report[1].indexOf(" ")));
		//System.out.println(report[1].substring( report[1].indexOf(" ")+1 ));
		
//		for(int i = 0 ; i < report.length; i++) {
//        	System.out.println(report[i]);	
//        }System.out.println("--------------------");

		Kakao2022_01 asd = new Kakao2022_01();
		asd.solution(id_list, report, k);

	}

}
