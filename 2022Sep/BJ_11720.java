package bj_006;

import java.util.Scanner;

public class BJ_11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		int sum = 0;
		
		for(int i = 0; i < str.length(); i++) {
			sum += str.charAt(i)-'0'; //-'0'을 해주면 입력받은 숫자 값 그대로 사용할 수 있다. 
		}
		System.out.print(sum);

	}

}
