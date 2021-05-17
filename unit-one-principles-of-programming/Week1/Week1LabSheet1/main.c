#include <stdio.h>

void printHelloWorld(void);
void printXTenTimes(void);
void convertMetricToImperialHeights(void);
void fibonacci(void);
void volumeOfACylinder(float h, float r);

int main(void) {
  printf("Question 1\n");
  printHelloWorld();

  printf("\nQuestion 2\n");
  printXTenTimes();

  printf("\nQuestion 3\n");
  convertMetricToImperialHeights();

  printf("\nQuestion 4\n");
  fibonacci();

  printf("\nQuestion 5\n");
  volumeOfACylinder(7.0,4.0);
  volumeOfACylinder(20.0,3.0);
  volumeOfACylinder(14.7,5.2);
  return 0;
}

/* 
 * Lab Sheet 1:
 */

 /* Question 1: 
 
 Adapt the “HelloWorld” code below to produce a program that defines a variable capable of holding an integer of your choice. The program should add 3 to that number, multiply the result by 2, subtract 4, subtract twice the original number, add 3, then print the result and a new line.
 */
 
void printHelloWorld(void){

    //initial integer is declared and its default state is 0
    int m;

    //calculation of the integer, the (m*2) will be used for subtracting twice the original number, and as m is set to 0 by default, then the calculation of (m*2) will be zero.
    int newInt = (m + 3) * 2 - 4 - (m  * 2) + 3;

    //this prints out the initial integer which hasn't been set to anything and therefore it will print out 0
  printf("Initial Integer: %d\n",m);

    //this will print out the calculation of m in a newly declared integer
  printf("Integer after caculation: %d\n", newInt);
}

 /* Question 2: 
 
 Complete the function below so that it prints every integer from x to x + 10.  Do not use loops. 
 
 Call this function from the main to test your program.
 */

void printXTenTimes(void){

  //Declare x here
  int x;

  //First value for x will be defined as 1
  printf("x = %d\n", x= 1);

  //using addition assignment operator to add 1 to each time
  printf("x = %d\n", x += 1);
  printf("x = %d\n", x += 1);
  printf("x = %d\n", x += 1);
  printf("x = %d\n", x += 1);
  printf("x = %d\n", x += 1);
  printf("x = %d\n", x += 1);
  printf("x = %d\n", x += 1);
  printf("x = %d\n", x += 1);
  printf("x = %d\n", x += 1);

}

 /* Question 3: 
 
 Complete the function below so that it converts the height of a person from centimetres to feet and inches. Use integer division (rounding down is acceptable, which is the default for integer division). 
 
 Hint: 254 cm is exactly 100 inches and 12 inches is exactly 1 foot. 
 
 Call this function from the main to test your program.  For example you could test your program with the follow five values, where "?" replaced with the true value.

 101 cm is 3 feet 3 inches to the nearest inch.
 3 cm is 0 feet 1 inches to the nearest inch.
 15 cm is ? feet ? inches to the nearest inch.
 192 cm is ? feet ? inches to the nearest inch.
 124 cm is ? feet ? inches to the nearest inch.
 */

void convertMetricToImperialHeights(void){

//initial height in cm
int heightCM = 156;

//prints total height in CM
  printf("value of height in centimeters is %d\n", heightCM);

//declaring other integers
int totalInches, totalFeet, nearestinch;

//calculating height in inches
totalInches = 100 * heightCM / 254;
//Prints height in inches
  printf("value of height in inches is %d\n", totalInches);

//Calculating the height in feet
totalFeet = totalInches / 12;
//Prints height in feet
  printf("value of height in feet is %d\n", totalFeet);

//Calculating the nearest inch
nearestinch = totalInches - (totalFeet * 12);
  printf("value of nearest inch of height is %d\n", nearestinch);

//prints the converted  height from centimeters to feet and inches
  printf("%d centimeters is %d feet & %d inches to the nearest inch", heightCM, totalFeet, nearestinch);
}

 /* Question 4: 
 
 Complete the function below so that it uses three variables (current, previous, next) to calculate and print out the first ten numbers of the Fibonacci sequence, each on a new line: i.e. the first four lines should be as follows:

 0 
 1 
 1 
 2
 
 Call this function from the main to test your program.
 */

void fibonacci(void){
  //variables defined as integers
  int pre=1, cur=1, nxt;

  //initial values defined to previous an current 
  int m;

  //prints out 0 & 1
  printf("%d\n%d\n", pre, cur);

  //initialisation step is used for 'for loop', loop starting at 2 as we've already printed out 0 & 1, for loop repeats the process only 10 times
  for (int m = 1; m < 3; m++) {

  //if the condition in the for loop initialisation step is true, then the rest of the code below will be executed
    nxt = pre + cur;
    pre = cur;
    cur = nxt;
    printf("%d\n", nxt);
  }
  }

 /* Question 5: 
 
 Complete the function below so that it uses two variables: height and radius. Use these two variables and print to the screen, the volume of a cylinder. 

 Call this function from the main to test your program.  For example, you could test your program with the following values, 

 height 7.0cm and radius 4.0cm
 height 20.0cm and radius 3.0cm
 height 14.7cm and radius 5.2cm
 
 Which print out, the cylinder with height 7.0cm and radius 4.0cm has a volume of 351.86cm^3
 
*/

void volumeOfACylinder(float h, float r){
  float pI = 3.14159;
  float volume = h * pI * r * r;
  printf("The cylinder with height %.1ecm and radius %.1ecm has a volume of %.2ecm^3\n", h, r, volume);
}