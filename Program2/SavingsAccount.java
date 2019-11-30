/*
CSE 17
Jitong Ding
jid221
Program #2 DEADLINE: October 16, 2018
Program Description: Simple Bank
*/

/** A subclass of the BankAccount class*/
public class SavingsAccount extends BankAccount{
  
  /** A private data field named interestRate for the interestRate of the SavingsAccount. */
  private double interestRate;
  
   /** Construct a new SavingsAccount with accountNum, customerName, balance and interestRate*/
  public SavingsAccount(int theAccountNum, String theCustomerName, double aBalance, double interestRate){
    super(theAccountNum,theCustomerName,aBalance);
    this.interestRate = interestRate;
  }
  
  /** Construct a new SavingsAccount with accountNum, customerName, balance which equals 0 and interestRate*/
  public SavingsAccount(int anAccountNum, String theCostomerName, double interestRate){
    super(anAccountNum,theCostomerName);
    this.interestRate = interestRate;
  }
  
   /** A method to return interestRate*/
  public double getInterestRate(){
    return interestRate;
  }
  
  /** A method to add interestRate * balance to the balance.*/
  public void accrueInterest(){
    balance += (balance * interestRate);
  }
  
   /** A method to print information about the checking account*/
  public void printAccountInfo(){
    System.out.printf("%-27s%8.2f   %-14s%3.1f%%\n", (accountNum)+" "+(customerName), balance,"Interest Rate:  ",interestRate*100);
}
}