package bj_002;
//알람 시계
import java.util.Scanner;

public class BJ_2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h, m;
		h = sc.nextInt();
		m = sc.nextInt();

		if (m < 45) {
			h = h - 1; //시 감소 
			m = 60 - (45 - m); //분 감소 
			if (h < 0) {
				h = 23; //단 시가 0보다 작으면 23시로 변경 
			}
		} else {
			m = m - 45;
		}

		System.out.println(h + " " + m);
		sc.close();
	}
}
