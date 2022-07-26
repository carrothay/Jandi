package bj_004;

import java.util.Scanner;

public class BJ_2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int max = arr[0];
		int maxIndex = 0;
		
		for (int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] > max) {
				max = arr[i];
				maxIndex = i+1;}
		}
		sc.close();
		
		System.out.println(max);
		System.out.println(maxIndex);
	}

}
