package bj_003;

import java.util.Scanner;
//EOF(End of File) ctrl+d 눌러서 종료 
public class BJ_10951_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) { //hasNextInt()사용  
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a + b);
		}
		sc.close();
}
}