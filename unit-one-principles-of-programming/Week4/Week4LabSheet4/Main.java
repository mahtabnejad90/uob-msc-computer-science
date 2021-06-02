
/* 
 * Lab Sheet 4
 */

/* Question 1
 Make a BankAccount Class. This Class should provide a constructor, three mutators and three accessors of the type that a bank account might need. 
 
 In the Main class (i.e. this class) create two different BankAccount instances from its main method (i.e. two BankAccount objects). Demonstrate the use of your mutators and accessors within that same main method.
*/

class Main {
  public static void main(String[] args) {
  
    BankAccount firstAccount = new BankAccount("Mahtab","Nejad","012345678",3000, "Active");
    BankAccount secondAccount = new BankAccount("Jon","Doe","987654321",8000, "Active");

    //Account balance changes to account 1 & 2
    firstAccount.depositMoney(1500);
    firstAccount.withdrawMoney(3000);
    secondAccount.withdrawMoney(8000);
    //Prints account 1 info
    System.out.println("Account balace of first account is :" + firstAccount.getAllAccountInfo());
    //Prints account 2 info
    System.out.println("Account balace of second account is :"+ secondAccount.getAllAccountInfo());
    //Prints account 1 balance
    System.out.println(firstAccount.getAccountBalance());

    //Call delete account method to delete account 2
    secondAccount.RemoveBankAccount();
    System.out.println("The balance of the Second account is: " + secondAccount.getAllAccountInfo());
  }
}