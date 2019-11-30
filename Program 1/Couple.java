/**
CSE 17
Jitong Ding
jid221
Program #1    Deadline: September 21, 2018 
Program:  A class for two people who are married
*/

public class Couple{
  /** A private data field named firstSpouse for the firstSpouse of the Couple. */
  private Person firstSpouse;
  /** A private data field named secondSpouse for the secondSpouse of the Couple. */
  private Person secondSpouse;
  
  /** Construct a new Couple with firstSpouse and  secondSpouse*/
  public Couple(Person aFirstSpouse, Person aSecondSpouse){
    firstSpouse = aFirstSpouse;
    secondSpouse = aSecondSpouse;
  }
  
  /** An instance method return the firstSpouse */
  public Person getFirstSpouse(){
    return firstSpouse;
  }
  
  /** An instance method return the secondSpouse */
  public Person getSecondSpouse(){
    return secondSpouse;
  }
  
  /** An instance method return the total income */
  public int getTotalIncome(){
    int sum = 0;
    return sum = firstSpouse.getIncome() + secondSpouse.getIncome();
  }
  
   /** An instance method return the string words of the title */
  public String toString(){
    return firstSpouse.getName() + " & " + secondSpouse.getName() 
      + ": $" + firstSpouse.getIncome() +" / $" + secondSpouse.getIncome();
  }
  
   /** An instance method return the saving */
  public double calculateSavings(TaxTable aBase, TaxTable aComparison){
    double differ = 0;
    double saving1 = 0;
    double saving2 = 0;
    saving1 = getTotalIncome()- aComparison.calculateTax(getTotalIncome());
    saving2 = getTotalIncome()- aBase.calculateTax(getTotalIncome());
    return differ = saving1-saving2;
  }
}