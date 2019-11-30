/*
CSE 17
Jitong Ding
jid221
Program #2 DEADLINE: October 16, 2018
Program Description: Simple Bank
*/

import java.io.File;
import java.util.Scanner; 

public class Bank{
  
  /** Private data field */
  private String name;
  private BankAccount[] accounts;
  private int totalAccounts;
  public int MAX_ACCOUNTS = 20;
  
  /** Construct a new Bank with name, totalAccounts, accounts */
  public Bank(String aName){
    name = aName;
    totalAccounts =0;
    accounts = new BankAccount[MAX_ACCOUNTS];
  }
  
  /** A method to return name*/
  public String getName() throws Exception{
    return name;
  }
  
  /** A method to add the given account to accounts and update totalAccounts accordingly*/
  public void addAccount(BankAccount newAcct) throws Exception{
    accounts[totalAccounts] = newAcct;
    totalAccounts++;
  }
  
  /** A menthod for printing the bank name and information about each account*/
  public void printBankSummary() throws Exception{
    System.out.println("Bank Name: "+name);
    for(int i =0;i<totalAccounts;++i){
      accounts[i].printAccountInfo();
  }
  }
  
  /** A method to accrue one month’s interest to each savings account, using its interestRate.*/
  public void accrueInterestToSavingsAccounts() throws Exception{
    for(int i =0;i<totalAccounts;++i){
      if (accounts[i] instanceof SavingsAccount){
        ((SavingsAccount)accounts[i]).accrueInterest();
    }
  }
  }
  
  /** A method to subtract the monthlyFee from the balance of each CheckingAccount. */
  public void applyFeesToCheckingAccounts() throws Exception{
    for(int i =0;i<totalAccounts;++i){
      if (accounts[i] instanceof CheckingAccount){
        ((CheckingAccount)accounts[i]).applyFee();
    }
  }
  }
  
  /** A method to read the messages from the file by using scanner and adding the checking or savings account to a BankAccount Array.*/
  public void loadAccountsFromFile(File acctFile) throws Exception{
    Scanner scan = new Scanner(acctFile);
    scan.useDelimiter("\\t|[\\n\\r\\f]+");
    BankAccount[] account = new BankAccount[20];
    int i = 0;
    /** A while loop to add the information read from the file into the decleared variables */
    while(scan.hasNextLine()){
      String line = scan.next();
      int accNum = scan.nextInt();
      String accOwner = scan.next();
      double accBanlance = scan.nextDouble();
      double num = scan.nextDouble();
      /** An if-else statement to tell whether is checking or savings accounts*/
      if(line.equals("C")){
        account[i] = new CheckingAccount(accNum,accOwner,accBanlance, num);
      }
      else{
        account[i] = new SavingsAccount(accNum,accOwner,accBanlance, num);
      }
      i++;
    }
    for(int j=0; j<i;++j){
      addAccount(account[j]);
    }
    scan.close();
  }
  
  
   /** The main method */
  public static void main(String[] args) throws Exception{
     if(args.length != 1){
      System.out.println("Usage: java Bank filename");
      System.exit(0);
    }
     File messageFile = new File(args[0]); 
     Bank aBank = new Bank("Java S&L");
     aBank.loadAccountsFromFile(messageFile);
     aBank.printBankSummary();
     aBank.accrueInterestToSavingsAccounts();
     aBank.applyFeesToCheckingAccounts();
     System.out.println();
     aBank.printBankSummary();
}
}