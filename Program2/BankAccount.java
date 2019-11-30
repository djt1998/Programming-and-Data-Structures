/*
CSE 17
Jitong Ding
jid221
Program #2 DEADLINE: October 16, 2018
Program Description: Simple Bank
*/

public class BankAccount{
  
  /**  Protected data field */
  protected int accountNum;
  protected String customerName;
  protected double balance;
  
  /** Construct a new BankAccount with accountNum, customerName, balance */
  public BankAccount(int theAccountNum, String aCostomerName, double aBalance){
    accountNum = theAccountNum;
    customerName = aCostomerName;
    balance = aBalance;
  }
  
  /** Construct a new BankAccount with accountNum, customerName, balance equals to 0*/
  public BankAccount(int anAccountNum, String theCostomerName){
    accountNum = anAccountNum;
    customerName = theCostomerName;
    balance = 0;
  }
  
  /** A method to return accountNum*/
  public int getAccountNum(){
    return accountNum;
  }
  
   /** A method to return customerName*/
  public String getCustomerName(){
    return customerName;
  }
  
   /** A method to return balance*/
  public double getBalance(){
    return balance;
  }
  
   /** A method to add depositAmt to the account’s balance*/
  public void makeDeposit(double depositAmt){
    balance += depositAmt;
  }
  
  /** A method to print information about the Bank account*/
  public void printAccountInfo(){
    System.out.printf("%-27s%8.2f\n", accountNum+customerName, balance);
}
}
    
