/*
CSE 17
Jitong Ding
jid221
Program #3 DEADLINE: November 7, 2018
Program Description: Conversational Arithmetic
*/

import java.util.ArrayList;
import java.util.Scanner;

public class WordMath{
  /** Public static final data field */
  public static final int ADDITION =0;
  public static final int SUBTRACTION =1;
  public static final int MULTIPLICATION =2;
  public static final int DIVISION =3;

   /** A method to attempt to match question to one of the entries in templates. For the first match
found, parses the question using the template and returns the resulting Expression. If no matching template is
found, throws an InvalidQuestionException.*/
  public static Expression parseQuestion(String question, ArrayList<QuestionTemplate> templates) throws InvalidQuestionException{
    for(int i = 0; i<templates.size();++i){
      try{
        Expression temp = templates.get(i).parseQuestion(question);
        return temp;
      }
      catch(InvalidQuestionException ex){
        continue;
      }
    }
      throw new InvalidQuestionException();
     
  }
  
   /** The main method */
  public static void main(String[] args){
    ArrayList<QuestionTemplate> templateList = new ArrayList<>();
    templateList.add(new QuestionTemplate("What is","plus","?",ADDITION));
    templateList.add(new QuestionTemplate("Tell me the sum of","and","?",ADDITION));
    templateList.add(new QuestionTemplate("What do I get if I add","and","together?",ADDITION));
    templateList.add(new QuestionTemplate("What is","minus","?",SUBTRACTION));
    templateList.add(new QuestionTemplate("","less","is what?",SUBTRACTION));
    templateList.add(new QuestionTemplate("What is","times","?",MULTIPLICATION));
    templateList.add(new QuestionTemplate("What do I get when I multiply","and","?",MULTIPLICATION));
    templateList.add(new QuestionTemplate("What is","divided by","?",DIVISION));
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a question:");
    String questionWords = scan.nextLine();
    try{
      Expression temp = parseQuestion(questionWords,templateList);
      System.out.println("The answer is "+temp.evaluateInWords());
  }
    catch(InvalidQuestionException ex){
      System.out.println("I'm sorry, I don't understand the question. Please rerun and rephrase your question.");
}
  }

}