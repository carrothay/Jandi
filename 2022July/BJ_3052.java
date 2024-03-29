package bj_004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BJ_3052 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = 0; i < 10; i++) {
			hs.add(Integer.parseInt(br.readLine()) % 42);
			//입력받은 나머지 값을 add메소드를 통해 HashSet에 저장 
		}
		br.close();
		System.out.println(hs.size());
	}
}
