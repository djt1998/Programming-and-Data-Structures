/*
CSE 17
Jitong Ding
jid221
Program #2 DEADLINE: October 16, 2018
Program Description: Simple Bank
*/

/** A subclass of the BankAccount class*/
public class CheckingAccount extends BankAccount{
  
  /** A private data field named monthlyFee for the monthlyFee of the CheckingAccount. */
  private double monthlyFee;
  
   /** Construct a new CheckingAccount with accountNum, customerName, balance and monthlyFee*/
  public CheckingAccount(int theAccountNum, String theCustomerName, double aBalance, double monthlyFee){
    super(theAccountNum,theCustomerName,aBalance);
    this.monthlyFee = monthlyFee;
  }
  
   /** A method to return monthlyFee*/
  public double getMonthlyFee(){
    return monthlyFee;
  }
  
  /** A method return the new monthlyFee.*/
  public void setMonthlyFee(double monthlyFee){
    this.monthlyFee = monthlyFee;
  }
  
  /** A method to subtracts monthlyFee from the balance.*/
  public void applyFee(){
    balance -= monthlyFee;
  }
  
   /** A method to print information about the checking account*/
  public void printAccountInfo(){
    System.out.printf("%-27s%8.2f   %-12s %1.2f\n", (accountNum)+" "+(customerName), balance,"Monthly fee:"+" $",monthlyFee);
}
}
 