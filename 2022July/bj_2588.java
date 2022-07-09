package bj_001;
import java.util.Scanner;
public class bj_2588 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		int num1 = a * (b % 10);
		int num2 = a * (b % 100 / 10); //a * 8 
		int num3 = a * (b / 100); //a * 3
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num1 + num2*10 + num3*100); // = a*b
	}
}
