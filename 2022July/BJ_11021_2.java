package bj_003;

import java.io.*;

public class BJ_11021_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			String[] ss = br.readLine().split(" ");
			bw.write("Case #" + (i + 1) + ": " + (Integer.parseInt(ss[0]) + Integer.parseInt(ss[1])) + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
