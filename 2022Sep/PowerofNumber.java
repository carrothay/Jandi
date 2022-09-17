class Main {
  public static void main(String[] args) {
    Main main = new Main();
    var result = main.power(2,5);
    System.out.println(result);
  }

  public int power(int base, int exp) {
    if(base <0){
      return -1;
    }
    if(exp == 0){ //the stopping criterion
      return 1;
    }
    return base * power(base, exp-1); //the flow
    //x^n = x * x^n-1
    //return 32
  }
}
