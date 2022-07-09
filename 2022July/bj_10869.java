package bj_001;
import java.util.Scanner;
public class bj_10869 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = a+b;
		int sub = a-b;
		int mul = a*b;
		int div = a/b;
		int rem = a%b;
		System.out.println(sum + "\n" + sub + "\n" + mul +  "\n" + div + "\n" +rem);
	}
}
