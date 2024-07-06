package level1;

public class ParkWalk {

	public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        // 1. park의 최대 가로 구함 
        int xMax = 0 ;
		for(int i = 0 ; i < park.length; i++) {
			xMax = (xMax < park[i].length()) ? park[i].length() : xMax;
		}
        int [][] parkMap = new int[park.length][xMax];
        int[] start = {0,0};
        int[] node = new int[2];
        
        // 2차원 배열화로 매핑
        for(int i = 0 ; i < park.length; i++) {
        	for(int j = 0 ; j < park[i].length(); j++) {
        		if(park[i].charAt(j) == 'S') {
        			parkMap[i][j] = 1;
        			start[0]=i;
        			start[1]=j;
        		}else if(park[i].charAt(j) == 'O') {
        			parkMap[i][j] = 1;
        		}else if(park[i].charAt(j) == 'X') {
        			parkMap[i][j] = 0;
        		}
        	}
        }
        
        node[0]=start[0];
        node[1]=start[1];
        
        int num = 0;
        int stack = 0;
        for(int i = 0 ; i < routes.length; i++) {
        	try {
        		num = Integer.parseInt(routes[i].substring(2));//start(1,1)
        		if(routes[i].charAt(0) == 'S') {
        			stack=0;
        			for(int j = 1 ; j <= num ;j++) {
        				if(parkMap[node[0]+j][node[1]] == 0) {
        					break;
        				}else if(parkMap[node[0]+j][node[1]] == 1) {
        					stack++;
        					if(stack == num) {
        						System.out.println("틀림");
        						node[0] = node[0] + num;
        					}else {
        						continue;
        					}
        				}
        			}
        		}else if(routes[i].charAt(0) == 'E') {
        			stack=0;
        			for(int j = 1 ; j <= num ;j++) {
        				if(parkMap[node[0]][node[1]+j] == 0) {
        					break;
        				}else if(parkMap[node[0]][node[1]+j] == 1) {
        					stack++;
        					if(stack == num) {
        						node[1] = node[1] + num;
        					}else {
        						continue;
        					}
        				}
        			}
        		}else if(routes[i].charAt(0) == 'W') {
        			stack=0;
        			for(int j = 1 ; j <= num ;j++) {
        				if(parkMap[node[0]][node[1]-j] == 0) {
        					break;
        				}else if(parkMap[node[0]][node[1]-j] == 1) {
        					stack++;
        					if(stack == num) {
        						node[1] = node[1] - num;
        					}else {
        						continue;
        					}
        				}
        			}
        		}else if(routes[i].charAt(0) == 'N') {
        			stack=0;
        			for(int j = 1 ; j <= num ;j++) {
        				if(parkMap[node[0]-j][node[1]] == 0) {
        					break;
        				}else if(parkMap[node[0]-j][node[1]] == 1) {
        					stack++;
        					if(stack == num) {
        						node[0] = node[0] - num;
        					}else {
        						continue;
        					}
        				}
        			}
        		}
    		} catch (Exception e) {
    			continue;
    		}
        }

        answer[0]=node[0];
        answer[1]=node[1];
        return answer;
    }
	
	public static void main(String[] args) {
		//String park[] = {"SOO","OOO","OOO"};
		//String routes[] = {"E 2","S 2","W 1"};
		//(2,1)
		
		//String park[] = {"SOO","OXX","OOO"};
		//String routes[] = {"E 2","S 2","W 1"};
		//(0,1)
		
		String park[] = {"OSO","OOO","OXO","OOO"};
		String routes[] = {"E 2","S 3","W 1"};
		//(0,0)
		
		ParkWalk asd = new ParkWalk();
		int answer[] = asd.solution(park, routes);
		System.out.println(answer[0]+", "+answer[1]);
	}

}
