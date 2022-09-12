class Main {
  public static void main(String[] args) {
    Main main = new Main();
    var result = main.decimalToBinary(13);
    System.out.println(result);
  }

  //Decimal To Binary
  public int decimalToBinary(int n) {
    if(n == 0){ //the stopping criterion
      return 0;
    }
    return n % 2 + 10 * decimalToBinary(n / 2); //the flow
    //f(n) = n mod 2 + (10 * f(n / 2))
  }
  //return 1101
}
