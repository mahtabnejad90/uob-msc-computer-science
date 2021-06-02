#include <stdio.h>

/* Modify the function below so that it populates the array evenNumbers with
* calculated value rather than printing it out.
*
* Now create a function that prints out this evenNumbers array and call it from
* the main function
*/

int evenNumbersSize = 10;
int evenNumbers[10];

void populateArray(){
for(int i=0; i<evenNumbersSize; i++){
evenNumbers[i]=(i+1)*2;
}
for(int a=0; a<evenNumbersSize; a++) {
printf("%d\n", evenNumbers[a]);
}
}

int main(void) {
populateArray();
return 0;
}
