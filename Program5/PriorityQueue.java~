/*
CSE 17  
Jitong Ding
jid221
Program #5 DEADLINE: December 8, 2018
Program Description: Doubly Linked List and Priority Queue
*/

import java.io.File;
import java.util.Scanner; 
import java.io.FileNotFoundException;

public class PriorityQueue<E extends Comparable<E>>{
  /** Private data filed */
  private DoublyLinkedList<E> elements;
  
  /** Construct a new PriorityQueue. */
  public PriorityQueue(){
    elements = new DoublyLinkedList<E>();
  }
  
  /** A method to add elements in sorted order to the list.*/
  public void enqueue(E element){
    int size = elements.size();
    if(size == 0){   /** If the queue is empty, just add the element.*/
      elements.add(element);
    }
    else if(element.compareTo(elements.get(size-1)) > 0){  /** If the element is bigger than thelast element from the list and just add the element to the last.*/
      elements.add(element);
    }
    else{     
      for(int m = 0; m < size; ++m){
        if(element.compareTo(elements.get(m)) < 0){
          elements.add(m,element);
          break;
        }
      }
    }
  }
  
  /** A method to return the element at the front of the priority queue (the one with the highest priority) but does not remove it..*/
  public E peek(){
    if(elements.size()==0){  /** If the queue is empty, returns null.*/
      return null;
    }
    else{
      return elements.get(0);
    }
  }
  
  /** Returns the element at the front of the priority queue (the one with the highest priority) and removes it.*/
  public E dequeue(){
    if(elements.size() == 0){  /** If the queue is empty, returns null.*/
      return null;
    }
    else{
      return elements.remove(0);
    }
  }
  
  /** A method to remove all elements from the priority queue.*/
  public void clear(){
    int length = elements.size();
    for(int i = 0; i< length; ++i){
      elements.remove(0);
    }
  }
  
  /** A method to return the number of elements in the priority queuet.*/
  public int size(){
    return elements.size();
  }
  
  /** The main method.*/
  public static void main(String[] args){
    if(args.length != 1){ /** Check whether there is only one command line argument.*/
      System.out.println("Usage: Please enter one command line argument");
      System.out.println("Usage: java PriorityQueue filename");
      System.exit(0);
    }
    
    File file = new File(args[0]);
    PriorityQueue<String> queue = new PriorityQueue<>();
    if(!file.canRead()){ /** Check the file can be opened and read.*/
      System.out.println("Usage: Please enter a vaild file");
      System.out.println("Usage: java PriorityQueue filename");
      System.exit(0);
    }
    
    try{    /** Try-catch block to deal with the FileNotFoundException*/
      Scanner scan = new Scanner(file);
      while(scan.hasNextLine()){
        String line = scan.next();
        queue.enqueue(line);
      }
    }
    catch(FileNotFoundException ex){
      System.out.println("Usage: Please enter a vaild file");
      System.out.println("Usage: java PriorityQueue filename");
      System.exit(0);
    }
    
    for(int m = 0; m < queue.elements.size(); ++m){
      System.out.println(queue.elements.get(m));
    }
  }
}
