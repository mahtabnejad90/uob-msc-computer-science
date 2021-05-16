#include <stdio.h>

/* 
 * In the code below,
 * 
 * 1. change the value stored in n to 24
 *
 * Now, using the printf function in the stdio.h library (imported above),
 * 
 * 2. print out the value of n 
 * 3. change the value of n to 4 and in a new variable, 
 * store the value of n multiplied by 3 and print it out
 *
*/

int main(void) {
  // initial declaration is 14
  int n = 14;

  //changing value of n to 24
  n = 24;

  //printing new value of n which is 24
  printf("Hello World %d\n", n);

  //changing value of n to 4
  n = 4;

  /*
  1. Declared new variable newInt
  2. Assigned to the existing n variable and multiplied it by 3
  */
  int newInt = n * 3;

//printing  value of newInt which is 12
  printf("Hello World %d\n", newInt);

  return 0;
}