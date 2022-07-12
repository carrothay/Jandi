package bj_002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2884_2 {

	public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	String str = br.readLine();
	StringTokenizer st = new StringTokenizer(str, " ");
	int h = Integer.parseInt(st.nextToken());
	int m = Integer.parseInt(st.nextToken());
	
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
	}
}
