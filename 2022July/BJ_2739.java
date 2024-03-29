package bj_003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2739 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int dan = Integer.parseInt(br.readLine());
		
		for (int i=1; i<10; i++) {
			System.out.println( dan + " * " + i + " = " + dan*i);
		}
		br.close();
	}
}
