/*
CSE 17
Jitong Ding
jid221
Program #3 DEADLINE: November 7, 2018
Program Description: Conversational Arithmetic
*/

/** A abstract class */
public abstract class Expression{
  
  /** Protected data field */
  protected int leftOpInt;
  protected int rightOpInt;
  /** A single NumberConvertor that can be used by any object that descends fromExpression. */
  public static NumberConvertor numConvertor = new NumberConvertor();
  
  /** Construct a new Expression with leftOp and rightOp and throws InvalidQuestionException */
  public Expression(String leftOp, String rightOp) throws InvalidQuestionException{
      if(numConvertor.toNumber(leftOp)==-1 || numConvertor.toNumber(rightOp) == -1){
        throw new InvalidQuestionException();
}
      else{
        leftOpInt = numConvertor.toNumber(leftOp);
        rightOpInt = numConvertor.toNumber(rightOp);
}
  }
  
  /** An abstract method to perform the arithmetic operation using the left
and right operands and return the result */
  public abstract int evaluate();
  
  /** An method to perform the arithmetic operation and return the
numeric result expressed as words. */
  public String evaluateInWords(){
     NumberConvertor a = new NumberConvertor();
     return a.toWords(evaluate());
  }
 

}