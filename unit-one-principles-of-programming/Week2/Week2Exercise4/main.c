#include <stdio.h>

/* 
 * Complete the recursive function below which performs multiplication of two 
 * numbers without using the inbuilt * sign
 */

//function with two integers declared in args
int multiply(int number, int by){

//conditional statement if trye
if (number==0||by==0) {
return 0;
} 
//condition elseif statement
else if (by>0) {
return number+multiply(number,by-1);
} 
//final else conditional statement
else {
return -number+multiply(number,by+1);
}

}

int main(void) {
  //prints calculation
  printf("The multiplication of 2 by 3 is %d\n", multiply(2,3));
  return 0;
}
