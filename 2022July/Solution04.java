package prac01;
//문제 url: https://programmers.co.kr/learn/courses/30/lessons/42577

import java.util.*;

public class Solution04 {
	    public boolean solution(String[] phone_book) {
	        /*
	        //방법1) sorting + loop
	        //1. phone book 을 정렬한다
	        Arrays.sort(phone_book);
	        
	        //2. 1중 Loop 돌면셔 앞번호가 뒷번호의 접두어인지 확인한다.
	        for (int i=0; i< phone_book.length-1; i++ ) {
	        	if(phone_book[i+1].startsWith(phone_book[i]))
	        		return false;
	        }
	        //3. 여기까지 왔다면 접두어가 없는 것이다.
	        return true;
	    	*/
	        
	        
	        //방법2) 
	        //1.HashMap을 만든다.
	        HashMap<String, Integer> map = new HashMap<>();
	        for (int i=0; i< phone_book.length; i++) {
	        	map.put(phone_book[i],1);
	        }
	        //2. 모든 전화번호의 접두어가 HashMap에 있는지 확인한다.
	        for (int i=0; i< phone_book.length; i++) {
	        	for (int j=1; j<phone_book[i].length();j++)
	        		if(map.containsKey(phone_book[i].substring(0,j)))
	        			return false;
	        }
	        //i는 map에 있는 key 들, 돌면서 
	        //j는 전화번호의 각 번호를 증가하면서 돈다 (6789라면, 6, 67, 678 까지. (자기자신은 제외  ))
	        //i의 0부터 j까지 길이의 번호가,map에 있는지 containsKey로 확인하여
	        //있으면 false 리턴.
	        
	        //3. 여기까지 왔다면 접두어가 없다는 것이다. 
	        return true;
	        
	    }
	public static void main(String[] args) {
	String[] phone_book = {"119","97674223","1195524421"};
	Solution04 sol = new Solution04();
	System.out.println(sol.solution(phone_book));
	}
}
