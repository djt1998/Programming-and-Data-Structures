/*
CSE 17  
Jitong Ding
jid221
Program #5 DEADLINE: December 8, 2018
Program Description: Doubly Linked List and Priority Queue
*/
public class DoublyLinkedNode<E>{
  
  /** Private data filed */
  private E element;
  private DoublyLinkedNode<E> previous;
  private DoublyLinkedNode<E> next;
  
  /** Construct a new DoublyLinkedNode with element and initialize the previous and next fields to null. */
  public DoublyLinkedNode(E element){
    this.element = element;
    previous = null;
    next = null;
  }
  
  /** A method to return previous*/
  public DoublyLinkedNode<E> getPrevious(){
    return previous;
  }
  
  /** A method to return next*/
  public DoublyLinkedNode<E> getNext(){
    return next;
  }
  
  /** A method to set the previous node for this node.*/
  public void setPrevious(DoublyLinkedNode<E> node){
    this.previous = node;
  }
  
  /** A method to set the next node for this node.*/
  public void setNext(DoublyLinkedNode<E> node){
    this.next = node;
  }
  
  /** A method to return element.*/
  public E getElement(){
    return element;
  }
  
  /** A method to set the node’s content.*/
  public void setElement(E value){
    this.element = value;
  }
}