import java.util.*;

/*
 * Implement the methods marked with a * in the comments below.
 *
 * You can test your implementations by calling them from
 * the main method,
 *
 * e.g. double[] newArray = m.convertIntArray(exampleArray);
 *      m.printArray(newArray);
 */

class Main {
  public static void main(String[] args) {
    Main m = new Main();

    //testing print array functions
    m.printArray(m.convertIntArray(new int[]{1,2,3,4}));
    m.printArrayList(m.convertIntArrayToArrayList(new int[]{1,2,3,4}));
  }

  // * - method to convert an array of ints to an array of doubles
  public double[] convertIntArray(int[] array) {
    int i;
    //double used to print out decimal points
    double[] arrayNew = new double[array.length];
    for (i = 0; i < array.length; i++) {
    arrayNew[i] = array[i];
    }
    return arrayNew;
  }

  // * - method to convert an array of ints to an ArrayList
  public ArrayList<Integer> convertIntArrayToArrayList(int[] array) {
    ArrayList<Integer> newList = new ArrayList<>();
    int i;
    for (i = 0; i < array.length; i++) {
      newList.add(array[i]);
    }
    return newList;
  }

  // ---------------------------------------------------
  // helpful methods to print arrays of different types
  // ---------------------------------------------------
  public void printArray(int[] array){
    System.out.print("[");
    for(int i=0; i<array.length; i++){
      System.out.print(array[i] + " ");
    }
    System.out.println("]");
  }

  public void printArray(double[] array){
    System.out.print("[");
    for(int i=0; i<array.length; i++){
      System.out.print(array[i] + " ");
    }
    System.out.println("]");
  }

  public void printArrayList(ArrayList array){
    System.out.print("[");
    for(int i=0; i<array.size(); i++){
      System.out.print(array.get(i) + " ");
    }
    System.out.println("]");
  }
}
