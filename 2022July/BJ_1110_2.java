package bj_003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1110_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		int copy = n;

		do {
			n = ((n % 10) * 10) + (((n / 10) + (n % 10)) % 10); // 일의자리가 10 이상이 될 수 있으므로 10 나머지 연산자 사용
			cnt++;
		} while (n != copy);
		System.out.println(cnt);
	}
}
