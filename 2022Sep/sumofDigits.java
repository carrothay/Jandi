class Main {
  public static void main(String[] args) {
    Main main = new Main();
    var result = main.sumofDigits(112);
    System.out.println(result);
  }

  public int sumofDigits(int n) {
    if(n<0){
      return 0;
    }
    if(n == 0){ //the stopping criterion
      return 0;
    }
    return n%10 + sumofDigits(n/10);
    //***f(n) = n%10 + f(n/10)*** //the flow
    //(1) 2 + sumofDigits(11)
    //(2) 1 + sumofDigits(1)
    //(3) 1 + sumofDigits(0)
    //(4) 0
    //(5) 2+1+1+0 = 4
    //return 4
  }
}
