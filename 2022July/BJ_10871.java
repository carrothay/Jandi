package bj_003;

import java.util.Scanner;

public class BJ_10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int a : arr) {
			if (a < x) 
			System.out.print(a + " ");
		}
		sc.close();	
	}
}