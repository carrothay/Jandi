package bj_002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2525 {

	public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str = br.readLine();
	StringTokenizer st = new StringTokenizer(str, " ");
	
	int h = Integer.parseInt(st.nextToken());
	int m = Integer.parseInt(st.nextToken());
	int t = Integer.parseInt(br.readLine());
	
	m = m + t;				//분 = 분 + 요리시간 
	while (m >= 60) {		//분이 60보다 크다면 while loop
	if (m >= 60) {			//분이 60 이상이면
		h++;				//시 + 1
		m = m - 60; 		//분은 60을 빼고 남은 수 
		if (h >= 24) {		//단, 시가 24 이상이면 0시로 바꿔준다 
			h = 0;
		}
	}
	}
	/*
	 * 모든 시간을 분으로 바꾸는 솔루션 
	 *int a = h*60 + m + t;
	 *h = a/60;
	 *m = a%60;
	 *if (h >= 24){
	 *h = h-24;}
	 */
	System.out.println(h+" "+m);
	br.close();
	}
}
