package bj_005;

import java.util.Scanner;

public class BJ_1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(arithmetic_sequence(n));
	}
	
	public static int arithmetic_sequence(int num) {
		int cnt = 0;
		
		if(num < 100) //1~99까지는 모두 등차수열이다. 
			return num;
		
		else {
			cnt = 99; //100이상일 경우, 최소값은 99이다. 
			
			for(int i=100; i<=num; i++) { //100부터 num까지 반복하면서 한수의 개수 카운팅 
				int hun = i/100;
				int ten = (i/10)%10;
				int one = i%10;
				
				if((hun-ten) == (ten-one)) //각 자릿수가 수열을 이루면 카운팅 추가 
					cnt++;
			}
		}
		return cnt;
	}

}
//주의 등차수열은 자릿수의 순서대로 차이를 구해야 한다.
//출처 https://st-lab.tistory.com/54 
