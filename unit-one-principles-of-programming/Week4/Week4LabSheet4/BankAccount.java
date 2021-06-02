class BankAccount{
  private String firstName;
  private String surName;
  private String accNumber;
  private String accountStatus;
  private int accountBalance;
  public BankAccount(String firstName, String surName, String accNumber, int accountBalance, String accountStatus){
    this.firstName = firstName;
    this.surName = surName;
    this.accNumber = accNumber;
    this.accountBalance = accountBalance;
    this.accountStatus = accountStatus;
}
//accessor
public String getFullName(){ 
   return firstName + " " + surName + " ";
 }
public String getAccountNumber(){
   return accNumber;
 }
public int getAccountBalance(){
   return accountBalance;
 }
public String getAllAccountInfo(){
   return firstName + " " + surName + " " + accNumber + " " + accountBalance + " " + accountStatus;
 }

public void depositMoney(int sumOfDeposit){
   accountBalance = accountBalance + sumOfDeposit;
}
public void withdrawMoney(int sumOfWithdrawal){
   accountBalance = accountBalance - sumOfWithdrawal;
}
public void RemoveBankAccount(){
   firstName = "";
   surName = "";
   accNumber = "";
   accountBalance = 0;
   accountStatus = "& this account has been Deactived";
}
}
