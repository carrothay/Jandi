package bj_002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2480 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int prize = 0;

		if (a == b && a == c && b == c) {
			prize = 10000 + (a * 1000);
		} else if (a == b || a == c) {
			prize = 1000 + (a * 100);
		} else if (b == c) {
			prize = 1000 + (b * 100);
		} else {
			prize = (Math.max(a, Math.max(b, c)) * 100);
		}
		System.out.println(prize);
		br.close();
	}
}
