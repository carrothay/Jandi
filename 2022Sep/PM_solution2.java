import java.util.*;

public class Solution01 {
    public String solution(String[] survey, int[] choices) {
    	String answer = "";
        HashMap<Character, Integer> hashmap = new HashMap<>();
        
        for(int i = 0; i < survey.length; i++) {
        	int value = choices[i];
        	if (value > 0 && value < 4) {
        		char ch = survey[i].charAt(0);
        		hashmap.put(ch, hashmap.getOrDefault(ch, 0) + 4 - value);
        	} else if(value > 4){
        		char ch = survey[i].charAt(1);
        		hashmap.put(ch, hashmap.getOrDefault(ch, 0) + value - 4);
        	}
        }
        
        return new StringBuilder()
        		.append(hashmap.getOrDefault('R', 0) >= hashmap.getOrDefault('T', 0) ? 'R' : 'T')
        		.append(hashmap.getOrDefault('C', 0) >= hashmap.getOrDefault('F', 0) ? 'C' : 'F')
        		.append(hashmap.getOrDefault('J', 0) >= hashmap.getOrDefault('M', 0) ? 'J' : 'M')
        		.append(hashmap.getOrDefault('A', 0) >= hashmap.getOrDefault('N', 0) ? 'A' : 'N')
        		.toString();
    }
	
	public static void main(String args[]) {
		String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
		int[] choices = {5,3,2,7,5};
		
		Solution01 s = new Solution01();
		String result = s.solution(survey, choices);
		System.out.println(result);
	}
}

//return
//TCMA

