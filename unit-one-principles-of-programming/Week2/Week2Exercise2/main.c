#include <stdio.h>

/*
 * Create a function that contains a local variable n.  Initialise this variable to 
 * 100 and print to the screen the value of n*n.  
 * 
 * Modify your code so that you can print out the result of this calculation
 * in the main function?  Do this both via a return in the function you have defined
 * and by using a global variable.
*/

//global variable
int pubVarialble = 100;

//custom function
int mahtabsFunction(){
//value of into a to 100 
int a=100;
//int a calculation
int returnOutcome = a*a;
//return local variable
return returnOutcome;
}

int main(void) {
  //prints global variable
  printf("The Global Variable is: %d\n", pubVarialble);
  //prints mahtabs function
  printf("Mahtabs Function returns: %d\n", mahtabsFunction());
  return 0;
}