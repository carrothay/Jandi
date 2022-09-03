package bj_005;

public class BJ_4673 {

	public static void main(String[] args) {
		boolean[] check = new boolean[10001]; //10001개의 불린형 배열을 선언한다. 
		
		for(int i = 1; i < 10001; i++) {
			int n = d(i); //리턴되는 수는 셀프넘버가 아니므로 출력하지 않는다.
			if(n < 10001) { //10000이하의 수만 체크 
				check[n] = true; //check 배열 해당 인덱스를 true로 바꿔준다.d함수로 나눈 결과는 셀프넘버가 아니다.  
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i < 10001; i++) {
			if (!check[i]) { //check 배열에서 false값을 갖는 원소의 위치 인덱스를 출력한다. 
				sb.append(i).append('\n');
				}
		}
		System.out.println(sb);
	}
	
	public static int d(int number) { //1. 함수 생성 
		int sum = number; //초기화를 기존의 수로 둔다
		while (number != 0) { //0이 될 때 까지 
			sum = sum + (number % 10); //첫째자리 수를 더해준다. 
			number = number/10; //첫째자리를 없앤다.
			}
		return sum;
	}
}

 //출처  https://st-lab.tistory.com/53  
