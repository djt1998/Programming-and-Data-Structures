/*
CSE 17
Jitong Ding
jid221
Program #3 DEADLINE: November 7, 2018
Program Description: Conversational Arithmetic
*/


public class NumberWord implements Comparable<NumberWord>{
  
  /** Private data field */
  private int value;
  private String inWords;
  
  /** Construct a new NumberWord with value and inWords */
  public NumberWord(int value,String inWords){
    this.value= value;
    this.inWords = inWords;
  }
  
  /** A method to return value*/
  public int getValue(){
    return value;
  }
  
  /** A method to return inWords*/
  public String getInWords(){
    return inWords;
  }
  
  /** A method to compare two String*/
  public int compareTo(NumberWord obj){
    return inWords.compareToIgnoreCase(obj.getInWords());
  }
  
}