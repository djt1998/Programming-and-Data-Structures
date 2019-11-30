/*
CSE 17  
Jitong Ding
jid221
Homework #3 DEADLINE: October 29, 2018
Program: Decimal and Binary transition
*/

 /** A class called BinaryFormatException is a subclass of NumberFormatException */
public class BinaryFormatException extends NumberFormatException{
  
  /** Private data field */
  private char badChar;
  private int charPos;
  
  /** Construct a new BinaryFormatException with charPos, badChar and a super class constructor */
  public BinaryFormatException(int charPos, char badChar){
    super("Binary numbers consist only of 0's and 1's");
    this.charPos = charPos;
    this.badChar = badChar;
  }
  
  /** A method to return badChar*/
  public char getBadChar(){
    return badChar;
  }
  
  /** A method to return charPos*/
  public int getCharPos(){
    return charPos;
  }
  
}