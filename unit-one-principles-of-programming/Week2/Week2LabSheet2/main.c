#include <stdio.h>
#include <math.h>

/* 
 * Lab Sheet 2:
 */

/* Question 1: 
 
 Complete the function below which takes in an integer input between zero and one hundred (0 ≤ n ≤ 100) and prints out the number expressed in English text, with spaces and no dashes (–), e.g. for the number “33”, we would expect to see “thirty three”. Hint: you may want to create additional functions to help.
 
 Call this function from the main to test your program.
 */

void numberToText(int originalVal){

int numberOne = originalVal/10;
int numberTwo = originalVal%10;
char *a[] = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"} ;
char *b[] = {"Zero","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"} ;
char *c[] = {"Zero","Zero","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"} ;
if (originalVal <= 10){
  printf("%s",a[originalVal]);
}
else if (originalVal < 20){
  printf("%s\n", b[numberTwo]);
}
else if (originalVal == 100){
  printf("%s\n","100");
}
else {
  printf("%s-%s\n",c[numberOne],a[numberTwo]);
}

}

/* Question 2: 
 
 Complete the function below that calculates, and returns, the distance between two points.
 
 Call this function from the main to test your program. Hint: may wish to use the following print statement in your main function, or similar: 

 printf("%1.2f\n", calculateDistance(0, 0, 4, 3));
 */

double calculateDistance(int x1, int y1, int x2, int y2){
float x, y;
x = pow(x2 - x1, 2);
y = pow(y2 - y1, 2);
return sqrt(x + y);
}

/* Question 3: 
 
 Complete the function below that is given an integer, n, where 1 ≤ n ≤ 9999 and prints whether it is even, odd, or/and prime.  The output should be whole sentences for example, 

 1 is odd and not prime.
 2 is even and prime.
 3 is odd and prime.
 4 is even and not prime.
 5 is odd and prime
 
 Call this function from the main to test your program.
 */

 void printOddEvenAndOrPrime(int n){

if (n % 2 == 0) {
     printf("%d is even ", n);
   } else {
     printf("%d is Odd ", n);
   }
   int counter = 2;
   while (counter <= n - 1) {
     if (n % counter == 0) {
       break;
     }
     //iterate
     counter++;
   }
   if (counter == n) {
     printf("And is prime");
   } else {
     printf("And is not prime");
   }
   printf("\n");
 }


int main(void) {

printf("Q1 - Prints number to text:\n");
numberToText(89);

printf("\n");

printf("Q2 - Returns Distance:\n");
printf("%1.2f\n", calculateDistance(0, 0, 4, 3));

printf("\n");

printf("Q3 - Returns odd/even & prime/not prime :\n");
printOddEvenAndOrPrime(3);
printOddEvenAndOrPrime(6);
printOddEvenAndOrPrime(9);
printOddEvenAndOrPrime(12);
printOddEvenAndOrPrime(15);
  
  return 0;
}