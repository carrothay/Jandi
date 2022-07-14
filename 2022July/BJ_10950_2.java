package bj_003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//방법2 BufferedReader
public class BJ_10950_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int t = Integer.parseInt(br.readLine());
	StringTokenizer st;
	StringBuilder sb = new StringBuilder();
	
	for (int i=0; i < t; i++) {
		st = new StringTokenizer(br.readLine(), " ");
		sb.append(Integer.parseInt(st.nextToken())+ Integer.parseInt(st.nextToken()));
		sb.append('\n');
	}
	System.out.println(sb);
	}
}
