
public class MyMath{

  //a double value that is closer than any other to pi, the ratio of the circumference of a circle to its diameter.
  public static double PI = 3.14;

  // addition 
  public static int add(int x, int y){
    return x+y;
  }

  // subtraction 
  public static int sub(int x, int y){
    return x-y;
  }

  // multiplication
  public static int mult(int x, int y){
    return x*y;
  }

  // division 
  public static int div(int x, int y){
    return x/y;
  }

  // raise x to the power y - x^y
  //returns the value of the first argument raised to the power of the second argument
  public static int pow(int x, int y){
    //java.lang.Math method
    return (int) Math.pow(x,y);
  }

  // square root
  //returns the correctly rounded positive square root of a double value.
  public static double sqrt(int x){
    //java.lang.Math method
    return Math.sqrt(x);
  }

}