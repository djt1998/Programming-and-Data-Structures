/*
CSE 17
Jitong Ding
jid221
Program #3 DEADLINE: November 7, 2018
Program Description: Conversational Arithmetic
*/

import java.util.ArrayList;

public class NumberConvertor{
  
  /** A private constant containing the word forms for the
numbers 0 through 19, inclusive.*/
  private static final String[] FIRST_NUMBERS = new String[]
  {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven",
    "twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
  /** A private constant containing the word forms for all of
the multiples of 10 between 20 and 90 inclusive.*/
  private static final String[] TENS_NUMBERS = new String[]{"twenty","thirty","forty","fifty",
  "sixty","seventy","eighty","ninety"};
  /** A private ArrayList containing NumberWords for 0-
19 and the multiples of 10 from 20-90.*/
  private ArrayList<NumberWord> numbersList = new ArrayList<>();
  
  /** Construct a new NumberConvertor initializing numbersList */
  public NumberConvertor(){
    for(int i =0; i<FIRST_NUMBERS.length;++i){
      numbersList.add(new NumberWord(i,FIRST_NUMBERS[i]));
    }
    for(int j =0; j<TENS_NUMBERS.length;++j){
      numbersList.add(new NumberWord((j+2)*10,TENS_NUMBERS[j]));
    }
    java.util.Collections.sort(numbersList);
}
  
  /** A method to use binary search to look it up and return the associated int valueGiven a single number word, 
    * by giving a single number word. If not found, returns -1.*/
   private int lookupValueOfWord(String numberWord){
     int low = 0;
     int high = numbersList.size()-1;
     
     while(high>=low){
       int mid = (high+low)/2;
       if(numberWord.compareToIgnoreCase(numbersList.get(mid).getInWords())<0){
         high = mid -1;
       }
       else if(numberWord.equalsIgnoreCase(numbersList.get(mid).getInWords())){
         return numbersList.get(mid).getValue();
       }
       else{
         low = mid +1;
  }
     }
     return -1;
}
   
   /** A method to use the numbersList, converts the words for any number between 0 and 99 inclusive into
its integer equivalent. Returns -1 for any number that it does not recognize.*/
   public int toNumber(String numberWords){
     NumberConvertor numConvertor = new NumberConvertor();
     if(numberWords.contains("-")){
       String[] numWords = numberWords.split("-",2);
       int a = numConvertor.lookupValueOfWord(numWords[0]);
       int b = numConvertor.lookupValueOfWord(numWords[1]);
       return (a+b);
     }
     else{
       return numConvertor.lookupValueOfWord(numberWords);
     }
   }
   
   /** A method to converts a numeric value between 0 to 99 intothe equivalent word(s). If the number is
outside the range, returns “not a number I can put into words (value)”*/
   public String toWords(int value){
     NumberConvertor aNumConvertor = new NumberConvertor();
     if(value>0 && value<100){
       if(value>=0 && value<=19){
         return FIRST_NUMBERS[value];
     }
       else if (value%10==0 && value!=10){
         return TENS_NUMBERS[(value/10)-2];
   }
       else{
         String words = "-";
         for(int i = 0; i<2;++i){
           if(i==1){
             return words = TENS_NUMBERS[value-2] + words;
           }
           int remain = value%10;
           words = words + FIRST_NUMBERS[remain];
           value/=10;
         }  
       }
}
     return "not a number I can put into words ("+ value+")";
   }
   
}
       
