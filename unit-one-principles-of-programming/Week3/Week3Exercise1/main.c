#include <stdio.h>
/* 
 Modify the function below so that it prints out the square multiplication tables for any number.  How might you modify this function, or add a new function, so it prints out the multiplication tables for any range of numbers?

 */

void squareMultTable(int n){

//variables declared
int i, c;

//for loop for the columns
printf("%4c|",' ');
for (i=1; i<=n; i++){
  printf("%4d", i);
}
printf("\n");

//for loop for the row (calculation inside)
for(i=1;i<=n;i++){

  printf("%4d|",i);
  for(c=1;c<=n;c++){
  printf("%4d",i*c);
}
printf("\n");
}

}

int main(void) {
  //test value in parameters of called function
  squareMultTable(10);
  return 0;
}