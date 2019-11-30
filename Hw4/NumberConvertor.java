/*
CSE 17
Jitong Ding
jid221
Homework #3 DEADLINE: October 29, 2018
Program: Decimal and Binary transition
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class NumberConvertor{
  
  /** A method tansfers the Binary number in string form to Decimal number and returns 
    * the decimal integer equivalent. Also throw the BinaryFormatException*/
  public static int binaryToDecimal(String binText) throws BinaryFormatException{
    int decimal = 0;
    for(int i =0; i< binText.length(); ++i){
      if(binText.charAt(i)=='0'||binText.charAt(i)=='1'){
          int remain = (binText.charAt(binText.length()-(i+1)))-'0';
          decimal += (remain*Math.pow(2,i));
      }
      else{
        throw new BinaryFormatException(i,binText.charAt(i));
      }
    }
    return decimal;
  }
  
  /** A method transfers the decimal number into binary number and return equivalent binary number */
  public static String decimalToBinary(int decInt){
    String binaryNum = "";
    while(decInt != 0){
      binaryNum = (decInt%2) + binaryNum;
      decInt /= 2;
  }
    return binaryNum;
  }
  
  /** The main method */
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    /** A loop to type the thing and the loop wil not break until 'Q' or 'q' is entered */
    while(true){
      System.out.print("Enter a choice (B,D, or Q):");
      char c = scan.next().charAt(0);
      if(c=='B'||c=='b'){
        System.out.print("Enter a binary number:");
        /** A try-catch block to catch the exception */
        try{
          String bin = scan.next();
          System.out.println("The decimal equivalent is "+binaryToDecimal(bin));
        }
        catch (BinaryFormatException ex){
          System.out.printf("Character %s at index %d is not a valid binary digit\n",ex.getBadChar(), ex.getCharPos());
    }
        finally{
          System.out.println();
      }
        
      }
      else if (c=='D'||c=='d'){
        System.out.print("Enter a nonnegative decimal integer:");
        /** A try-catch block to catch the exception */
        try{
          int num= scan.nextInt();
          if(num <0){
            System.out.println("That’s a negative integer!");
          }
          else{
            System.out.println("The binary equivalent is "+decimalToBinary(num));
            }
          }
        catch(InputMismatchException ex){
         System.out.println("You did not enter a valid integer.");
         scan.next();
        }
        System.out.println();
    }
      else if (c=='Q'||c=='q'){
        System.out.println("Goodbye!");
        break;
    }
      else{
        System.out.printf("%s is not a valid option.\n",c);
        System.out.println();
    }
  }
}
}