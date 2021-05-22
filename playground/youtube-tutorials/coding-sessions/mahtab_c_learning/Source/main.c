//build in functions, these are libraries that are required to run build in functions
//pre processor directives
#include <stdio.h>
#include <stdlib.h>
#include "MahtabsInfo.h"
#define MYNAME "Mahtab Nejad"
//every computer program is made up of several functions
//functions tell computer programs to do something
//e.g. 1st function; tell the program to move the mouse to chrome 2nd function; click on the icon 3rd function click on address bar


//everytime you run a program, the computer will look for a function called main() , so its required
// every line between the curly brackets is what goes in your main function
int main()
{
    //\n is a new line, \t is a tab, \a is a alert nose
    printf("Mahtab Nejad is my name! \n");

    printf("Mahtab Nejad is 30 years old!");

    printf("Mahtab Nejad is 30 years old!\n");

    //%s is a placeholder for a string
    //Mahtab will replace %s in the output
    printf("%s %s is a string placeholder\n", "Mahtab", "Nejad");

    printf("%s %s is a string placeholder\n", "Mahtab", "Nejad");
    //%d hold a whole number or an integer wherever its placed within the quotes ""
    printf("Mahtab is %d old\n", 30);

    //A int or number with a decimal point uses the %f format
    //default of %f is to print out 6 decimal places unless specified otherwise
    printf("Mahtab %f\n", 2.0);

    //%* are also known as conversion characters or format specifiers
    printf("Pi is %.11f\n", 3.14159265359);


    //variable is a placeholder for a data type value
    //variables cannot start from _ or numbers
    //variables cannot use other symbols other than _
    // valid: mahtab_age mahtabAge mahtab30
    //invalid mahtab nejad , 30Mahtab
    //don't declare variables that use prebuild or existing functions; e.g. main

    //declare age int
    int age;
    //assign a value
    age = 30;
    //print the integers value
    printf("Mahtab is %d years old \n", age);

    int calculateAge;
    calculateAge = 2021-1990;
    printf("Mahtabs is %d years old \n", calculateAge);

    int ageTwo;
    int birthYear;
    int currentYear;

    //calculate using variables
    currentYear = 2021;
    birthYear = 1990;
    ageTwo = currentYear-birthYear;
    printf("Mahtabs current age in 2021 is: %d \n", ageTwo);


    // \0 is a string terminator, basically a special symbol to tell C that this is the end of the string

    // helps to calculate the number of a string

    //so if a string contains 13 characters, the computer will need 14 bytes to

    // computer sees strings as a list of character arrays

    //in the array you need to specify how many bytes are required for the entire string including one for the string terminator
    char firstName[7] = "Mahtab";

    printf("My First Name is: %s \n", firstName);

    //access individual elements within an array
    //each item in an array is called an element.
    firstName[0] = 'B';
    printf("My First Name is: %s \n", firstName);

    //no need to explicitly define how many bytes is required
    char surname[] = "Bahman Nejad";
    printf("My Surname is: %s \n", surname);

    strcpy(firstName, "MAHTAB");
    printf("My First Name is: %s \n", firstName);


    //constant variable in print statement
    printf("The MYNAME const variable is %s\n", MYNAME);

    //used code from custom made header file
    int legalAge = (AGE / 2) + 7;
    printf("%s can date others %d or \n", PEOPLE, legalAge);


//user user input
    char fName[20];
    char partnerName[20];
    int noOfChildren;

    printf("What is your name \n");
    scanf("%s", firstName);

    printf("Who is your Partner \n");
    scanf("%s", partnerName);

    //use & for every variables except for arrays
    printf("How many children do you want? \n");
    scanf("%d", &noOfChildren);
    //prints stored information
    printf("%s and %s want to have %d children\n", firstName, partnerName, noOfChildren);










    //must return something, if returning 0 to main it means that the program is running correctly
    return 0;

    //computer ignores comments, compiler ignores it as well

    /*
        this is a block comment
    */



}
