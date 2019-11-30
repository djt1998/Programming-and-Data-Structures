/**
CSE 17
Jitong Ding
jid221
Homework #1    Deadline: August 30, 2017
Program: My Autobiography 
*/


public class Hw1{
  public static void main (String [] args){
    String arr []= new String []{"I am a Lehigh University Computer Science Major Student","I am from China", "I am a sophomore"};
    for (int i=0; i< arr.length; ++i){
      if(arr[i].length()<80){
      System.out.println(arr[i]);
      }
      }
}
} 