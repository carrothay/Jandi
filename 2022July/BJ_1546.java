package bj_004;

import java.util.Scanner;

public class BJ_1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		long max = 0;
		long sum = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] > max) {
				max = arr[i];
			}
			sum += arr[i];
		}
		sc.close();

		double avg = 0;
		avg = (sum * 100.0) / max / n;
		System.out.println(avg);

	}
}
