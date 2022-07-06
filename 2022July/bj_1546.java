import java.util.Scanner;

public class bj_1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int[] score = new int[s]; //@1
		
		for(int i=0; i<score.length; i++) {
			score[i] = sc.nextInt(); //@2
		}
		
		long max =0; //최대값
		long sum =0; //합
		for(int j=0; j<score.length; j++) {
			if (max<score[j]) //@3
				max = score[j];
			sum += score[j]; //@4
		}

		System.out.println(sum * 100.0 / max / s); //@5
	}
}
/*
 * @1 s개의 int를 배열로 받는다 
 * @2 score의 길이만큼 돌면서 스캐너에서 int를 받는다 (스페이스로 가능) 
 * @3 j로 돌리면서 최대값을 구한다
 * @4 j로 돌리면서 합계를 구한다
 * @5 점수의 합계 * 100 을 / 최대값으로 나누고 /점수의 개수(s)만큼 나누면 
 * 		새로운 평균이 나온다.
 */