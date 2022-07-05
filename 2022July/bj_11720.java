import java.util.Scanner;

public class bj_11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s =sc.next();
		
		int answer = 0;
		
		for(int i=0; i<n; i++) {
			answer += Integer.parseInt(s.substring(i, i+1));
		}
		
		System.out.println(answer);
	}
}
