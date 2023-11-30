package level1;

import java.util.*;

/*
얀에서는 매년 달리기 경주가 열립니다. 
해설진들은 선수들이 자기 바로 앞의 선수를 추월할 때 추월한 선수의 이름을 부릅니다. 
예를 들어 1등부터 3등까지 "mumu", "soe", "poe" 선수들이 순서대로 달리고 있을 때, 
해설진이 "soe"선수를 불렀다면 2등인 "soe" 선수가 1등인 "mumu" 선수를 추월했다는 것입니다. 
즉 "soe" 선수가 1등, "mumu" 선수가 2등으로 바뀝니다.

선수들의 이름이 1등부터 현재 등수 순서대로 담긴 문자열 배열 players와 해설진이 부른 이름을 담은 문자열 배열 callings가 매개변수로 주어질 때, 
경주가 끝났을 때 선수들의 이름을 1등부터 등수 순서대로 배열에 담아 return 하는 solution 함수를 완성해주세요.
*/

public class _001 {
	
	public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        
        // 방법 1 정답 But 시간초과
//        answer = players;
//        String temp = "";
//        for(int i = 0 ; i < callings.length ; i++) {
//        	for(int k = 0 ; k < answer.length ;k++) {
//        		if(callings[i].equals(answer[k])) {
//        			temp = answer[k-1];
//        			answer[k-1] = answer[k];
//        			answer[k] = temp;
//        		}
//        	}
//        }

        
        //방법 2 정답 StringBuilder 사용 But 런타임 에러
//        answer = players;
//        StringBuilder sb = new StringBuilder();
//        
//        for(int i = 0 ; i < callings.length ; i++) {
//	        for(int k = 0 ; k < answer.length ;k++) {
//	        	if(callings[i].equals(answer[k])) {
//	        		sb.append(answer[k-1]);
//	        		answer[k-1] = answer[k];
//	        		answer[k] = sb.toString();
//	        		sb.delete(0, answer[k-1].length());
//	        	}
//	        }
//        }
        
        //방법 3 실패
//        int call_name[] = new int[players.length];
//        for(int i = 0 ; i<call_name.length; i++) {
//        	call_name[i] = 0;
//        }
//        
//        for(int i = 0 ; i < callings.length; i++) {
//        	for(int k = 0 ; k < players.length; k++) {
//        		if(callings[i].equals(players[k])) {
//        			call_name[k]++;
//        		}
//        	}
//        }
//        
//        int rank[] = new int[players.length];
//        for(int i = 0 ; i < players.length; i++) {
//        	rank[i] = i+1;
//        }
//        
//        for(int i = 0 ; i < rank.length; i++) {
//        	if(call_name[i] > 0) {
//        		int num = call_name[i];
//        		rank[i] = rank[i] - num;
//        		rank[i - num] += num;
//        	}	
//        }
//        
//        for(int i = 0 ; i < answer.length; i++) {
//        	for(int k = 0 ; k < rank.length ;k++) {
//        		if(i == (rank[k]-1)) {
//        			answer[i] = players[k];
//        		}
//            }
//        }
        
        
        // 방법 4 정답 But 시간초과
//	      answer = players;
//	      String temp = "";
//	      for(int i = 0 ; i < callings.length ; i++) {
//	      	for(int k = 0 ; k < answer.length ;k++) {
//	      		if(callings[i].equals(answer[k])) {
//	      			temp = answer[k-1];
//	      			answer[k-1] = answer[k];
//	      			answer[k] = temp;
//	      		}
//	      	
//	      	}
//	      }
        
        //방법 5 ArrayList
//        ArrayList<String> alist = new ArrayList<>();
//        for(int i = 0 ; i < players.length ;i++) {
//        	 alist.add(players[i]);
//        }
//        
//        for(int i = 0 ; i<callings.length; i++) {
//        	for(int k = 0 ; k < alist.size() ;k++) {
//        		if(callings[i].equals(alist.get(k))) {
//        			alist.set(k, alist.get(k-1));
//        			alist.set(k-1, callings[i]);
//        			
//        		}
//        	}
//        }
//        
//        for(int i = 0; i < answer.length;i++) {
//        	answer[i] = alist.get(i);
//        }
        
        //방법 5 hashmap
        HashMap<String, Integer> hashMap = new HashMap<>();
       // Iterator<String> keys = hashMap.keySet().iterator();
        
        for(int i = 0 ; i < answer.length; i++) {
        	hashMap.put(players[i],i);
        }
        
        for(int i = 0 ; i<callings.length; i++) {
        	if(hashMap.get(callings[i]) != null) {
        		
        		hashMap.put(callings[i], hashMap.get(callings[i])-1);
        		//hashMap.put
        	}
        }
        
        
        
        
        
        
        return answer;
    }
	
        
        
        
        
        

	public static void main(String[] args) {
		_001 a = new _001();
		
		String players[] = {"mumu", "soe", "poe", "kai", "mine"};
		String callings[] = {"soe","mumu","kai", "kai", "mine", "mine"};
		
		
		//test start
//		int call_name[] = new int[players.length];
//        for(int i = 0 ; i<call_name.length; i++) {
//        	call_name[i] = 0;
//        }
//        
//        for(int i = 0 ; i < callings.length; i++) {
//        	for(int k = 0 ; k < players.length; k++) {
//        		if(callings[i].equals(players[k])) {
//        			call_name[k]++;
//        		}
//        	}
//        }
//        
//        int rank[] = new int[players.length];
//        for(int i = 0 ; i < players.length; i++) {
//        	rank[i] = i+1;
//        }
//        
//        for(int i = 0 ; i < rank.length; i++) {
//        	if(call_name[i] > 0) {
//        		int num = call_name[i];
//        		rank[i] = rank[i] - num;
//        		rank[i - num] += num;
//        	}	
//        }
//		
//        for(int i = 0 ; i < rank.length ; i++) {
//        	System.out.println(rank[i]);
//        }
//        
		//test end
		
		String result[] = a.solution(players, callings);
		
		for(int i = 0 ; i<result.length; i++) {
			System.out.println(result[i]);
		}

	}

}
