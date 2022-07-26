package bj_004;

import java.util.Scanner;

public class BJ_2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = (sc.nextInt() * sc.nextInt() * sc.nextInt());
		String str = Integer.toString(num);
		sc.close();

		for (int i = 0; i < 10; i++) { // i 0~9까지 돌면서
			int count = 0;
			for (int j = 0; j < str.length(); j++) { // j가 str의 길이만큼 돌면서
				if ((str.charAt(j) - '0') == i) {// 문자열의 j번 인덱스의 char과 i가 같은지 확인 단,
												//charAt을 쓸 때는 - '0' 또는 - 48 사용  
					count++; // 같으면 count 1 증가
				}
				System.out.println(count);
			}
		}
	}

}
//출처: https://st-lab.tistory.com/45