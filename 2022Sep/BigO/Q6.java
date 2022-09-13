import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    Main main = new Main();
    int[] customArray = {1,3,4,5};
    main.reverse(customArray);
  }

void reverse(int[] array){
  for(int i = 0; i < array.length/2; i++){ //배열 중간까지만 루프
    //***O(N/2)-> O(N)*** 2가 생략됨 
    int other = array.length-i-1; //O(1) //i가 0부터 시작하므로 1을 더 빼줌
    int temp = array[i]; //O(1)
    array[i] = array[other]; //O(1)
    array[other] = temp; //O(1)
  }
  System.out.println(Arrays.toString(array)); //O(1)
}
}
//Create a method which takes an array as a parameter and reverses it
//return [5, 4, 3, 1]
//Time Complexity: O(N)
