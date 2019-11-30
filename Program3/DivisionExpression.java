/*
CSE 17
Jitong Ding
jid221
Program #3 DEADLINE: November 7, 2018
Program Description: Conversational Arithmetic
*/

public class DivisionExpression extends Expression{
  /** Construct a new DivisionExpression with leftOp and rightOp and throws InvalidQuestionException */
  public DivisionExpression(String leftOp, String rightOp) throws InvalidQuestionException{
    super(leftOp,rightOp);
}
  /** A method to return the calculating result*/
  public int evaluate(){
    return (leftOpInt / rightOpInt);
  }
}