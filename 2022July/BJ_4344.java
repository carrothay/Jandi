package bj_004;

import java.util.Scanner;

public class BJ_4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr;
		int c = sc.nextInt();
		
		for(int i = 0; i < c; i++) {
			int N = sc.nextInt(); //학생 수 
			arr = new int[N]; // 학생 수의 배열 
		
			double sum = 0; //누적성적 합 
			
			//성적 입력  
			for (int j = 0; j < N; j++) {
				int score = sc.nextInt();
				arr[j] = score;
				sum += score;
			}
			
			double above = (sum / N);
			double count = 0; //평균 넘는 학생 수 
			
			//평균 넘는 학생 비율
			for(int j = 0; j < N; j++) {
				if(arr[j] > above) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n",(count/N)*100);
			
		}
		sc.close();
	}
}
//출처 st-lab 
