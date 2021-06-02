//ctype library used for conversion
#include <ctype.h>
//standard libraries
#include <stdio.h>
#include <math.h>
#include <string.h>


  /* 
  * Lab Sheet 3
  */

  /* Question 1
  
  Complete the function below which converts a hexadecimal string into its decimal value. (Do not use a C standard library function.) 

  The main function calls this function with an example hexadecimal value. Change this value to test your program.
  */
  int hexToDec(char hex[]){
   char hValues[16] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    int result, i, num, v;
    result = 0;
    for (i = 0; i < strlen(hex); i++) {
      int num = strlen(hex) - 1 - i;
      for (int v = 0; v < 16; v++) {
        if (hex[i] == hValues[v]) {
          result = result + v * pow(16, num);
          break;
        }
      }
    }
    return result;
  }

/* Question 2
 Complete the function below that print out a tree shape such as the following: 

    *
   ***
  *****
 *******
*********
   ***
   ***
   ***
   ***

  Note you can (and probably should) implement additional functions to help.

  You can assume that the width of the tree will be odd and hence every line will have an odd number of asterisks. The trunk will always have a width of three.

  Call this function from the main to test your program.
*/

void outputCharIteration(char charac, int recurring) {
  int i;
  for (i = 0; i < recurring; i++) {
    printf("%c", charac);
  }
}
void outputUpperTree(int w) {
  int i;
  for (i = 0; i < w/2 + 1; i++) {
    outputCharIteration(' ', w/2 - i);
    outputCharIteration('*', i * 2 + 1);
    printf("\n");
  }
}
void outputLowerTree(int w, int l) {
  int i;
  for (i = 0; i < l; i++) {
    outputCharIteration(' ', w/2 - 1);
    outputCharIteration('*', 3);
    printf("\n");
  }
}
void printTree(int w, int trunkLength) {
   outputUpperTree(w);
   outputLowerTree(w, trunkLength);
}

int main(void) {
  //test value will be FF3
  char hex[4] = "FF3";
  //calls function in print statement
  printf("The hex value %s is %d in decimal\n", hex, hexToDec(hex));
  //printing 3 different sizes, width always stays as 3
  printTree(10, 3);
  printTree(30, 3);
  printTree(50, 3);
  return 0;
}