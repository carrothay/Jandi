package prac01;

import java.util.*;
//완주하지 못한 선수 문제풀이
//문제 url: https://programmers.co.kr/learn/courses/30/lessons/42576

public class Solution03 {
    public String solution(String[] participant, String[] completion) {
        /* 방법1) sorting 으로 풀기 
    	String answer = "";
        //1. 두 배열을 정렬한다
    	Arrays.sort(participant);
    	Arrays.sort(completion);
    	//2. 다를 때까지 찾는다
    	//3. 같다면, 마지막 주자가 완주하지 못한 선수다. 
    	for (int i=0; i<completion.length; i++) {
    			if (participant[i].equals(completion[i])) {
    				answer = participant[participant.length-1];
    				continue;
    			} else {
    			answer = participant[i];
    			break;
    			}
    		}
        return answer;
        */
    	/* 방법2) hash 로 풀기 */
    	String answer = "";
    	//1.hash map을 만든다 (participant)
    	HashMap<String, Integer> map = new HashMap<>();
    	for (String player : participant)
    		map.put(player, map.getOrDefault(player, 0) + 1);
    	//key에는 선수 이름, value 에는 player의 값 => 없으면 0을 주고(1로 set), 값이 있으면 거기에 1을 더해서 넣는다 (동명이인 가능성) 
    	
    	//2.hash map을 뺀다 ( completion)
    	for (String player : completion)
    		map.put(player, map.get(player) - 1);
    	
    	//3.value가 0 이 아닌 마지막 주자를 찾는다.
    	for (String key : map.keySet()) { //keyset: map이 가진 key들을 배열로 담음
    	if(map.get(key) != 0) { //값이 0이 아닌 key가 있다면 정답이 된다. 
    		answer = key;
    		break;
    	}
    	}
    System.out.println(map);
    	return answer;
    }
    
    public static void main(String[] args) {
    	String[] part = {"leo", "kiki", "eden"};
    	String[] comp = {"eden", "kiki"};
    	Solution03 sol = new Solution03();
    	System.out.println(sol.solution(part, comp));
    }
}
