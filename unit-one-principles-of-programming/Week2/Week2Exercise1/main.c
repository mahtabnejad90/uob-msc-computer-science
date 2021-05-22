#include <stdio.h>
#include <math.h>

/*
 * Using the math.h library (imported already), 
 * 
 * 1. Complete the pow3 function below so that takes as an argument a double and 
 * returns that value raised to the power of 3 
 * (hint use the pow function in the math library)
 *
 * 2. Create a function that takes as an argument a double and return the natural log 
 * of that value.  
 *
 * Demonstrate your functions by calling them the main function and printing out the
 * values returned 
*/

double pow3(double value){
  //pow() method used to calculate the square root of the defined integer in the arguments
  return pow(value, 3);
}

//function that calculates the power to which a numerical value should be raised
double logNatural(double val){
return log(val); 
}

//main function that calls other functions
int main(void) {
  printf("Hello World\n");
   //prints square root of 3 -- not using decimals in formaters as its not required for now 
  printf("Square root of 3 is %.f\n", pow3(3));
  //prints natural log -- not using decimals in formaters as its not required for now
  printf("Natural log of 10 is %.f\n", logNatural(10));
  return 0;
}