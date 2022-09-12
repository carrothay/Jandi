class Main {
  public static void main(String[] args) {
    Main main = new Main();
    var result = main.gcd(48,18);
    System.out.println(result);
  }

  //GCD
  public int gcd(int a, int b) {
    if(a < 0 || b < 0){
      return -1;
    }
    if(b == 0){ //the stopping criterion
      //if b reaches 0, return a
      return a;
    }
    return gcd(b, a % b); //the flow
    //Euclidean algorithm
    //gcd(a, 0) = a
    //gcd(a, b) = gcd(b, a mod b)
  }
  //return 6
}
