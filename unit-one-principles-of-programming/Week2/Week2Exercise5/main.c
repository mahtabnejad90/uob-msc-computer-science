#include <stdio.h>

void fibonacci(void);
/*
 * Complete the fibonacci function below such that it calculates the 
 * nth term of the Fibonacci sequence using iteration.
 * 
 * The first 4 terms of the Fibonacci sequence in this example 
 * are  1, 1, 2, 3
 *
 * For example if we call fibonacci(1) we should get the value 1 returned,
 * if we call fibonacci(4) we should get the value 3 returned. 
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

int main(void) {

  //calling and printing function here
  printf("Fibonacci \n");
  fibonacci();
  return 0;
}