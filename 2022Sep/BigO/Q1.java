class Main {
  public static void main(String[] args) {
    Main main = new Main();
    int[] customArray = {1,3,4,5};
    main.spofArray(customArray);
  }

void spofArray(int[] array){
  int sum = 0; //O(1)
  int product = 1; //O(1)

  for(int i = 0; i < array.length; i++){ //O(N)
    sum += array[i]; //O(1)
  }
  for(int i = 0; i < array.length; i++){ //O(N)
    product *= array[i]; //O(1)
  }
  System.out.println(sum+", "+product); //O(1)
  }
}
//Create a function which calculates the sum and product of elements of array
//return 13, 60
//Time Complexity: O(N)
