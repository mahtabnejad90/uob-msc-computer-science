import java.util.Scanner;
/*
 * Implement below a method (or methods) which allows the user to
 * type in their name, age and height in cm and prints to the terminal
 * their name, age, year of birth and height in feet and inches.
 *
 * For example, you might print out,
 *
 * "Hello <name>, you are <age> and were born in <year>.
 * You are <?> feet and <?> inches tall"
 */

class Main {
  public static void main(String[] args) {

    //System.out.println("Hello world!");
    userInput();
  }

private static void userInput(){
  Scanner userInput = new Scanner(System.in);

  String fullName;
  System.out.println("Print your full name please");
  fullName = userInput.nextLine();
  System.out.print("Your name is: " + fullName + '\n');

  int age;
  System.out.println("Print your age please");
  age = userInput.nextInt();
  System.out.println("Your age is: " + age);

  Double height;
  System.out.println("Enter your height in CM please");
  height = userInput.nextDouble();
  System.out.println("Your Height in CM is: " + height);

  int currentYear = 2021;
  int birthYear = currentYear - age;
  System.out.println("Your birth year is: " + birthYear);

 int totalInches, feet, inches;

totalInches = (int) (height / 2.54);
inches = totalInches % 12;
feet = totalInches / 12;

System.out.println("Your height is " + feet + " feet and " + inches + " inches tall");
userInput.close();
  
}
}