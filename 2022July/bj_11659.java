import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_11659 {

	public static void main(String[] args) throws IOException {
		
BufferedReader bufferedReader =
	new BufferedReader(new InputStreamReader(System.in));

StringTokenizer stringTokenizer =
	new StringTokenizer(bufferedReader.readLine());

		int suNo = Integer.parseInt(stringTokenizer.nextToken()); //숫자 개수  
		int quizNo = Integer.parseInt(stringTokenizer.nextToken()); //질의 개수  

		long[]S = new long[suNo + 1]; //1부터 시작하는 이유는 0번째를 제외하기 위해 	 //구간 합을 담을 배열 
		
		stringTokenizer = new StringTokenizer(bufferedReader.readLine()); //숫자 입력 받기 

		for (int i=1; i<=suNo; i++) {
		//1부터 시작하는 이유는 0번째를 제외하기 위해 	
		S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken()); //@1
		//구간 합을 입력과 동시에 바로 S배열에 담는다 
		}

		for (int q=0; q<quizNo; q++) { //질의 개수 만큼 돌면서 i와 j를 받는다 
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			int i = Integer.parseInt(stringTokenizer.nextToken());
			int j = Integer.parseInt(stringTokenizer.nextToken());
			
			System.out.println(S[j]-S[i-1]); //각 질의에 대한 구간 합 바로 출력하기 //@2
		}
	}
}
/*
 * @1 합 배열 공식 S[i] = S[i-1] + A[i] 
 * @2 구간 합 공식 S[j] - S[i-1]
 * */

