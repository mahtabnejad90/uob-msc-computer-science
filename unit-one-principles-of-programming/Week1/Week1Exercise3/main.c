#include <stdio.h>

/*
 * The code below contains some errors.
 *
 * Debug the code to get it to run.
 * 
 * Question: what types of errors have been made? logical, runtime or syntax?
*/

// this function takes a double n and returns n multiplied by itself 
int my_function(double n){
  
  //Syntax error, needs to have a semicolon
  double n2 = n*n; 

  //Logical error, needs to return variable from within the function rather than what's within the arguments.
  return n2; 
}

int main(void) {
  //Syntax error, needs to have a semicolon
  int value = 42; 

  //Runtime error, processed_value needs to be declared as an int as value variable within this function is an int
  int processed_value = my_function(value); 

  //No errors here
  printf("The initial value was %d", value); 

  //Error here specifies that variable type in line 26 was incorrect, fixing line 26 will also fix this error
  printf(" and the processed value is %d\n", processed_value);
  return 0; 
}