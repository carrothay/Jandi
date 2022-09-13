class Main {
  public static void main(String[] args) {
    Main main = new Main();
    int[] customArray = {1,3,4,5};
    main.printPairs(customArray);
  }

void printPairs(int[] array){
  for (int i = 0; i < array.length; i++){ //O(N)
    for (int j = 0; j < array.length; j++){ //O(N)
      System.out.println(array[i] + "," +array[j]); //O(1)
    }
  }
}

}
//Create a function which prints to the console the pairs from given array
//Time Complexity: O(N^2)
