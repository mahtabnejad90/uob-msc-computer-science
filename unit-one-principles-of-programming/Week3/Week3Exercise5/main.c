#include <stdio.h>

/* 
 * Complete the function printDate below so that it prints out the data
 * in a struct Date in the format 
 * 
 * DD:MMM:YYYY - e.g. 01:JAN:2019
 */

struct Date
{
	int day;
	char month[4];
	int year;
};

void printDate(struct Date d){
  if(d.day <= 10){
    printf("0%d:%s:%d", d.day, d.month, d.year);
  }
  else{
  printf("incorrect value\n");
  }
}

int main(void) {
  struct Date date1;
  date1.day = 1;
  date1.month[0] = 'J';
  date1.month[1] = 'A';
  date1.month[2] = 'N';
  date1.month[3] = '\0';
  date1.year = 2019;
  printDate(date1);
  return 0;
}