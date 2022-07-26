package bj_004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2577_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10]; //**** 기본 int배열 초기값은 모두 0이다.****
		int num = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
		
		String str = String.valueOf(num);
		for (int i = 0; i < str.length(); i++) {
			arr[(str.charAt(i) - 48 )]++;
		}
		
		for (int v : arr) {
			System.out.println(v);
		}
	}

}
//출처: https://st-lab.tistory.com/45