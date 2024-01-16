/*
CSE 17
Jitong Ding
jid221
Program #4 DEADLINE: November 16, 2018
Program Description: Word Jumble Solver
*/

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Jumble{
  
  /** A method to return the String array of all s's permutations*/
  public static String[] findPermutations(String s){
    ArrayList<String> permutation = new ArrayList<>();
    findPermutations(s,"",permutation);
    String[] list = new String[permutation.size()];
    for(int i = 0; i<list.length;++i){
      list[i] = permutation.get(i);
  }
    return list;
  }
  
  /** A recursive helper method to permute the String s1*/
  private static void findPermutations(String s1,String s2, ArrayList<String> permutations){
    if(s2.length()==s1.length()){
      String s3="";
      for(int i=0;i<s2.length();i++){
        s3+=s1.charAt(Integer.parseInt(""+s2.charAt(i)));
      }
      for(int i=0;i<permutations.size();i++){
        if(permutations.get(i).equals(s3)){
          return;
        }
      }
      permutations.add(s3);
      return;
    }
    ArrayList<String> notUsed =new ArrayList<String>();
    for(int i=0;i<s1.length();i++){
      if(s2.length()==0){
        notUsed.add(Integer.toString(i));
      }
      for(int j=0;j<s2.length();j++){
        if(i==Integer.parseInt(""+s2.charAt(j))){
          break;
        }
        if(j==s2.length()-1){
          notUsed.add(Integer.toString(i));
        }
      }
    }
    for(int i = 0; i<notUsed.size();++i){
      String s = notUsed.get(i);
      findPermutations(s1,s2+s,permutations);
    }
  }
  
  
  /** A main method */
  public static void main(String[] args) throws FileNotFoundException{
    Dictionary dictionary;
    File dictionaryFile;
    int wordNums = 0; /** Number of words in dictionary */
    int wordLength; /** Length of the longest word */
    /** An If statement to figure out whether there is one argument or two argument */
    if(args.length != 1 && args.length != 2){
      System.out.println("Usage: java Jumble (maxWordLength) filename");
      System.exit(0);
    }
    /** An if-else statement to initialize Dictionary and File */
    if(args.length==1){
      wordLength = 10;
      dictionary = new Dictionary();
      dictionaryFile = new File(args[0]);
  }
    else{
      wordLength = Integer.parseInt(args[0]);
      dictionary = new Dictionary(wordLength);
      dictionaryFile = new File(args[1]);
    }
    /** A try-catch to find the FileNotFoundException*/
    try{
      Scanner scan = new Scanner(dictionaryFile);
      while(scan.hasNextLine()){
      String Line = scan.nextLine();
      if(Line.length() > wordLength){
        break;
      }
      dictionary.addEntry(Line);
      ++wordNums;
}
      System.out.printf("Read in %d words\n",wordNums);
    }
    catch(FileNotFoundException ex){
      System.out.println("I don't find the file");
    }
    /** An while loop to repeate the whole thing*/
    while(true){
      System.out.println();
      System.out.println("Enter a scrambled word: ");
      Scanner input = new Scanner(System.in);
      String scrWord = input.nextLine();
      int fail = 0;
      ArrayList<String> fitWords = new ArrayList<>();
      if(scrWord.length() > wordLength){   /** A if statement to test if it is wrong*/
        System.out.printf("Please enter a String whose length is between 1 to %d.\n",wordLength);
      }
       /** When "Enter" comes in, end the program*/
      else{
        if("".equals(scrWord)){
          System.out.println();
          System.out.println("Goodbye!");
          break;
      }
        else{
          String[] permutations = findPermutations(scrWord); 
          for(int j = 0; j<permutations.length;++j){
            if(dictionary.lookup(permutations[j])){
              fitWords.add(permutations[j]);
          }  /** If fall == the length of the permutation array the string does not fit*/
          else{
            fail++;
            if(fail == (permutations.length)){
              System.out.printf("No words are formed from '%s'",scrWord);
              System.out.println();
          }
          }
  }
  }
      }
       /** A if statement to print out all of the fit words*/
      if(fitWords.size() != 0){
        System.out.printf("The words formed from '%s' are:\n", scrWord);
        for(int m = 0; m<fitWords.size();++m){
          System.out.println(fitWords.get(m));
}
      }
      }
  }
  }
  
