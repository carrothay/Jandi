package bj_002;

import java.util.Scanner;
//사분면 고르기 
public class BJ_14681 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		int q=0;
		x = sc.nextInt();
		y = sc.nextInt();
		if (x>0 && y>0) {q=1;}
		else if (x<0 && y>0) {q=2;}
		else if (x<0 && y<0) {q=3;}
		else if (x>0 && y<0) {q=4;}
		System.out.println(q);
		sc.close();
	}
}
