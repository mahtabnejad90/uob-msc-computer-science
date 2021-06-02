class Main {

  public static void main(String[] args) {
    Main newMain = new Main();
    String exampleString = "I am an example string";
    newMain.printCharsInString("I am an example string");
    newMain.printStringInReverse("I am an example string");
    newMain.printStringInUppercase(exampleString);
    int s = 3;
    String e = new String(newMain.encryptText(exampleString, s));
    System.out.println("Encoded: " + e);
    System.out.println("Decrypted: " + newMain.decryptText(e, s));
  }

  /*
  * Modify the method below so that it prints out each character in the string
  * on a new line.
  */

public void printCharsInString(String exampleString){
  int i;
    for(i=0; i < exampleString.length(); i++){
      System.out.println(exampleString.charAt(i));
    }
  }


  /*
  * Modify the method below so that it prints out
  * the string in reverse order
  */

  public void printStringInReverse(String exampleString){
    char aArray[] = exampleString.toCharArray();
    int i;
    for(i=exampleString.length() - 1; i>=0; i--){
      System.out.print(aArray[i]);
    }
    System.out.println(" ");
  }

  /*
  * Modify the method below so that it prints out
  * the string as all uppercase
  */

  public void printStringInUppercase(String exampleString){
    System.out.println(exampleString.toUpperCase());
  }

  /*
  * Implement the method below which encrypts the
  * text passed in as an argument using a 
  * Ceaser cypher.  
  * 
  * https://en.wikipedia.org/wiki/Caesar_cipher
  * 
  * This is illustrated below 
  *
  * input string = "ABC"
  * shift by = 3
  * encrypted text = "DEF"
  */
  public String encryptText(String exampleString, int shiftBy){
    char aArray[] = new char[exampleString.length()];
    int m, acsii, adjust;
    int i;
    for(i=0;i<exampleString.length();i++){
      if(exampleString.charAt(i) == ' '){
        aArray[i] = ' ';
      }
      else{
        acsii = exampleString.codePointAt(i);
        if(acsii < 97){adjust = 65;}
        else{adjust = 97;}
        m = Math.floorMod((acsii - adjust - shiftBy), 26) + adjust;
        aArray[i] = (char)m;
        }
    }
    String outPut = new String(aArray);
    return outPut;
  }

  /*
  * Implement the method below which decrypts a
  * Ceaser cypher encrypted message
  *
  */

  public String decryptText(String exampleString, int shiftBy){
    return encryptText(exampleString, -shiftBy);
  }

}