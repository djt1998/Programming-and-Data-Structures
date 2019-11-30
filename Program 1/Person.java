/**
CSE 17
Jitong Ding
jid221
Prpgram #1    Deadline: September 21, 2018 
Program:  A class for individual and their income
*/

public class Person{
  
  /** A private data field named name for the name of the person. */
  private String name;
  /** A private data field named income for the income of the person. */
  private int income;
  
  /** Construct a new Play with name and income */
  public Person(String aName, int aIncome){
    name = aName;
    income = aIncome;
  }
  
  /** An instance method return the name */
  public String getName(){
    return name;
  }
  
  /** An instance method return the income */
  public int getIncome(){
    return income;
  }
  
  /** An instance method return the new income */
  public void setIncome(int income){
    this.income = income;
  }
  
}