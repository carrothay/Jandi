import java.util.*;

public class Solution {
    public int[] solution(String[] operations) {
    	int[] answer = {0, 0}; //비어있으면 0, 0 리턴
    	PriorityQueue<Integer> minQ = new PriorityQueue<>();
    	PriorityQueue<Integer> maxQ = new PriorityQueue<>(Collections.reverseOrder()); //우선순위 높은 순 
    	
    	int val = 0; //꺼내온 수 
    	
    	for(int i = 0; i < operations.length; i++) {
    		String op = operations[i]; 
    		String opType = op.substring(0,1); //I 또는 D
    			//1. 삭제
    			if(opType.equals("D")) {
    				//1-1. 최소값 삭제
    				if(op.charAt(2) == '-') { //최소값 삭제일 때
    					if(!minQ.isEmpty()) { //Q가 비어있지 않으면
    						val = minQ.peek(); //제일 작은 수 = val
    						minQ.poll(); //제일 작은 수 제거
    						maxQ.remove(val); //maxQ에서 val 제거
    					}
    				}
    				//1-2. 최대값 삭제
    				else {
    					if(!maxQ.isEmpty()) { //최대값 삭제일 때 Q가 비어있지 않으면
    						val = maxQ.peek(); //제일 큰 수 = val
    						maxQ.poll(); // 제일 큰 수 제거
    						minQ.remove(val); //minQ에서 val 제거
    					}
    				}
    			}
    			else { //2. 추가 
    				int value = Integer.parseInt(op.substring(2)); //op에서 세번째 인덱스부터 꺼내온 숫자
    				maxQ.offer(value); //maxQ에 추가하고
    				minQ.offer(value); //minQ에도 추가
    			}
    	}
    	if(!maxQ.isEmpty()) { //큐가 비어있지 않다면
    		answer[0] = maxQ.peek(); //maxQ에서 가장 큰 수 리턴
    		answer[1] = minQ.peek(); //minQ에서 가장 작은 수 리턴
    	}
    	return answer;
    
    }
	
	public static void main(String args[]) {
		String[] ope = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
		
		Solution s = new Solution();
		int[] result = s.solution(ope);
		System.out.println(Arrays.toString(result));
	}
}

//return
//[333, -45]
