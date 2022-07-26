package bj_004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2577_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
		int[] arr = new int[10];

		while (num != 0) {
			arr[num % 10]++;
			num /= 10;
		}
		for (int result : arr) {
			System.out.println(result);
		}
	}

}
//출처: https://st-lab.tistory.com/45
