
#include <stdio.h>
//boolean library
#include <stdbool.h>

/*
 * Write a function which returns true if a number is divisible by 3 and  
 * false if it is not.  Hint: use the modulo (%) operator.
 *
 * Modify your code so that your function now returns true if a number is divisible 
 * by 3 or 5 and false if it is not.
 *
*/

//global boolean declared
bool valueA(int);

int main(void) {
  //test integers - could also use scanf() for actual user input
  int testA = 15;
  int testB = 20;
  printf("Can %d be divided by 3?\n%d\n",testA,valueA(testA));
  printf("Can %d be divided by 3?\n%d\n",testB,valueA(testB));
  return 0;
}

//boolean function with integer declared in args
bool valueA(int number) {

  //conditional statement
  if (number % 3 == 0) {
    return true;
    
  }
    return false;
}