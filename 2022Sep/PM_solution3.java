import java.util.*;

public class Solution {
    public int solution(int[] queue1, int[] queue2) {
    	Queue<Integer> q1 = new ArrayDeque<>(); //Queue 생성하기 
    	Queue<Integer> q2 = new ArrayDeque<>();
    	long s1 = 0, s2 = 0, sum;
    	for (int tmp : queue1) {
    		q1.add(tmp);s1 += tmp;
    	}
    	for (int tmp : queue2) {
    		q2.add(tmp);s2 += tmp;
    	}
    	sum = s1 + s2; //두 큐의 합 
    	if (sum % 2 ==1 ) return -1; //합이 홀수일 때 -1 
    
    	sum /= 2; //합 / 2
    	
    	int p1 = 0, p2 = 0, limit = (queue1.length + queue2.length) * 2;
    	//두 큐의 길이 두배를 최대수로 설정 
    	while (p1 <= limit && p2 <= limit) {
    		if (s1 == sum) return p1+p2;
    		if (s1 > sum) { //s1이 더 크다면, q1 에서 q2 로 숫자를 보낸다 (s1감소, s2증가)
    			s1 -= q1.peek();
    			s2 += q1.peek();
    			q2.add(q1.poll());
    			p1++;
    		} else {
    			s2 -= q2.peek();
    			s1 += q2.peek();
    			q1.add(q2.poll());
    			p2++;
    		}
    	}
    	return -1; //s1 == s2가 될 수 없으면 -1
    }
	
	public static void main(String args[]) {
		int[] q1 = {3,2,7,2};
		int[] q2 = {4,6,5,1};
		
		Solution s = new Solution();
		int result = s.solution(q1, q2);
		System.out.println(result);
	}
}

//return
//2

