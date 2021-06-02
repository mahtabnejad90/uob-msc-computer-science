#include <stdio.h>

/*
 * Modify the function below so that it prints out each character in the string
 * on a new line.  Hint: the end of a string is signified by the '\0' char
 */

void printCharsInString(char string[]){
  
  //iteration variable
  int i = 0;

  //while loop to print out each element (or character) of an string [i] being an element, != excludes end of the string
  while (string[i] != '\0') {

    //print statement print out one elements from the string array
    printf("%c\n", string[i]);

    //iteration to add one until the string ends
    i++;
  }
}

int main(void) {
  //test string 
  char my_string[] = "This is a string";

  //calls function
  printCharsInString(my_string);
  return 0;
}