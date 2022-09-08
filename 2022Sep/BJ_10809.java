package bj_006;

import java.util.Scanner;

public class BJ_10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[26];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1; //-1로 초기화
		}
		
		String s = sc.nextLine();
		
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i); //해당 자리의 알파벳을 ch에 담은 후
			
			if(arr[ch - 'a'] == -1) { //해당 자리가 -1이라면 계속, 아니라면 중복이므로 빠져나간다.
			arr[ch-'a'] = i;} //ch 에서 a 를 뺀 arr의 인덱스에 i를 넣는다. b라면 arr[1] = 0이 된다.
					//arr[1]은 알파벳 b의 자리이며 0은 0번째 자리에 처음 나타난 것을 의미한다.
		}
		
		for(int val : arr) {
			System.out.println(val + " ");
		}
	}

}
//출처 https://st-lab.tistory.com/62
