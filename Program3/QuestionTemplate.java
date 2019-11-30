/*
CSE 17
Jitong Ding
jid221
Program #3 DEADLINE: November 7, 2018
Program Description: Conversational Arithmetic
*/


public class QuestionTemplate{
  
  /** Private data field */
  private String preText;
  private String middleText;
  private String endText;
  private int operation;
  
   /** Construct a new QuestionTemplate with preText, middleText, endText, operation */
  public QuestionTemplate(String preText, String middleText, String endText, int operation){
    this.preText = preText;
    this.middleText= middleText;
    this.endText = endText; 
    this.operation = operation;
  }
  
  /** A method to returns true if question matches the template.*/
  public boolean isMatch(String question){
    String theQuestion = question.trim();
    int pre = theQuestion.indexOf(preText);
    int mid = theQuestion.indexOf(middleText);
    int end = theQuestion.indexOf(endText);
    if (pre==-1 || mid ==-1 || end==-1){
      return false;
    }
    if (end>mid&&mid>pre)
      return true;
    return false;
  }  
  
  /** A method is given a question for which isMatch() is known to be true, and returns the equivalent subtype of 
    * Expression for the question. The left operand for the expression is assumed to be the string between the pretext and the
middleText. The right operand is the string between middleText and endText. If either operand is invalid, then throw an
InvalidQuestionException.*/ 
  public Expression parseQuestion(String question) throws InvalidQuestionException{
    String theQuestion = question.trim();
    int pre = theQuestion.indexOf(preText);
    int mid = theQuestion.indexOf(middleText);
    int end = theQuestion.indexOf(endText);
    String preText1;
    String middleText1;
    String endText1;
    QuestionTemplate template;
    if(pre==0 && mid>0 && end>0){
      preText1 = theQuestion.substring(0,preText.length());
      middleText1 = theQuestion.substring(mid,(mid+middleText.length()));;
      endText1 = theQuestion.substring(end,(end+endText.length()));
      template = new QuestionTemplate(preText1,middleText1,endText1,operation);
      if(template.isMatch(question)){
        String Num1;
        String Num2;
        if(preText.length()==0){
          Num1 = theQuestion.substring(0,mid-1);
          Num2 = theQuestion.substring(mid+middleText.length()+1,end-1);
        }
        else{
          String theNum2;
          Num1 = theQuestion.substring(preText.length()+1,mid-1);
          theNum2 = theQuestion.substring(mid+middleText.length()+1,end);
          if(theNum2.charAt(theNum2.length()-1)==' '){
            Num2 = theNum2.substring(0,theNum2.length()-1);
          }
          else{
            Num2 = theNum2;
        }
        }
        if(operation==0){
          Expression addition = new AdditionExpression(Num1,Num2);
          return addition;
      }
        else if(operation==1){
          Expression subtraction = new SubtractionExpression(Num1,Num2);
          return subtraction;
      }
        else if(operation==2){
          Expression multiplication = new MultiplicationExpression(Num1,Num2);
          return multiplication;
      }
        else if(operation==3){
          Expression division = new DivisionExpression(Num1,Num2);
          return division;
      }
    }
    }
      throw new InvalidQuestionException();
}
}  
