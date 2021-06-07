
/*
 * Implement the methods below.
 */ 

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    //Object
    Main mainMethod = new Main();

    //test values
    int mOne = 33;
    int mTwoIntOne = 55;
    int mTwoIntTwo = 10;
    int mThreeOne = 4;
    //int mThreeTwo = 5;
    //int mThreeThree = 6;

    //Print divisible method
    System.out.println(mOne + "can be divisible by 3" + mainMethod.isModThree(mOne));

    //Print multiplication method
    System.out.println("The multiplication sum of " + mTwoIntOne + " and " + mTwoIntTwo + " is = " + mainMethod.multiply(mTwoIntOne,mTwoIntTwo));

    //Print fib method
    System.out.println("The fibonacci sequence for the integer " + mThreeOne + " is " + mainMethod.fib(mThreeOne));
    //System.out.println("The fibonacci sequence for the integer " + mThreeTwo + " is " + mainMethod.fib(mThreeOne));
    //System.out.println("The fibonacci sequence for the integer " + mThreeThree + " is " + mainMethod.fib(mThreeOne));
  }

  // Method which returns true if a number is divisible by 3 and  
  // false if it is not.  Hint: use the modulo (%) operator.
  public boolean isModThree(int n){
      if (n%3==0){
          return true;
      }
      else {
          return false;
      }
  }

  // Recursive method which performs multiplication of two 
  // numbers without using the inbuilt * sign
  public int multiply(int n, int by){
      int x, i;
      x = 0;
      i=1;
      while ( i <= by){
          x = x + n;
          i++;
      }
      return (x);
  }

  /*
   * Complete the fibonacci method below such that it calculates the 
   * nth term of the Fibonacci sequence using iteration.
   * 
   * The first 4 terms of the Fibonacci sequence in this example 
   * are  1, 1, 2, 3
   *
   * For example if we call fibonacci(1) we should get the value 1 returned,
   * if we call fibonacci(4) we should get the value 3 returned. 
   */
   public int fib(int term){
     int now, before, after, i;
     now = 1;
     before =1;
       if (term == 1){
           return 1;
       }
       for (i = 2; i < term; i++){
           after = before + now;
           before = now;
           now = after;
       }
       return now;
   }
}