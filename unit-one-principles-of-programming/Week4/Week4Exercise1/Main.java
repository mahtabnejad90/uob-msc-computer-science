
/*
 * Modify the code below so that 
 * 
 * 1. So that numbers less than 10 are padded when printed 
 * i.e. 01 : 59 : 59 rather than 1 : 59 : 59
 *
 * 2. So that the time includes miliseconds 
 * e.g. 01 : 59 : 59 : 999
*/

public class Main {

  public static void main(String[] args) {
		Counter hours = new Counter(24, 1);
		Counter mins = new Counter(60, 59);
		Counter sec = new Counter(60, 58);
    Counter miliseconds = new Counter(1000,999);

		int i = 0;
		while(i < 10){
      System.out.println(hours.getFirstCountDisplay() + " : " + 
                          mins.getFirstCountDisplay() + " : " + 
                          sec.getFirstCountDisplay() + " : " + miliseconds.getSecondCountDisplay());
			
      miliseconds.tick();
      if(miliseconds.getCount()==0){
        sec.tick();
			if(sec.getCount() == 0){
				mins.tick();
        if(mins.getCount() == 0){
				  hours.tick();
			  }
      }
			}

			i++;
		}
  }
}