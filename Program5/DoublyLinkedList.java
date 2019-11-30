/*
CSE 17  
Jitong Ding
jid221
Program #5 DEADLINE: December 8, 2018
Program Description: Doubly Linked List and Priority Queue
*/

import java.lang.IndexOutOfBoundsException;

public class DoublyLinkedList<E>{
  
  /** Private data filed */
  private DoublyLinkedNode<E> head;
  private DoublyLinkedNode<E> tail;
  private int size;
  
  /** Construct a new empty DoublyLinkedList. */
  public DoublyLinkedList(){
    head = null;
    tail = null;
    size = 0;
  }
  
  /** A method to return the node with the given index*/
  private DoublyLinkedNode<E> getNode(int index){
    if(index <= size/2){
      int i = 0;
      DoublyLinkedNode<E> current = head;
      while(i < index){
        current = current.getNext();
        ++i;
      }
      return current;
    }
    else if(index > size/2 && index < size){
      int j = size-1;
      DoublyLinkedNode<E> current = tail;
      while(j > index){
        current = current.getPrevious();
        j--;
      }
      return current;
    }
    return null;
  }
  
  /** A method to add a DoublyLinkedNode containing element to the end of the list.*/
  public void add(E element){
    DoublyLinkedNode<E> newNode = new DoublyLinkedNode<E>(element);  /** Create a new DoublyLinkedNode<E> with element.*/
    if(tail == null){ 
      head = tail = newNode;  /** The element is the only one in the list.*/
    }
    else{ 
      tail.setNext(newNode);   /** Link the new node with the last node.*/
      newNode.setPrevious(tail);
      tail = tail.getNext(); /** Tail now points to the last node.*/
      
    }
    size++;
  }
  
  /** A method to insert a DoublyLinkedNode at index containing element.*/
  public void add(int index, E element){
    if(index < 0 || index > size){
      throw new IndexOutOfBoundsException(); 
    }
    else{
      if(index == size){
        add(element);
      }
      else if(index <= size/2){
        int m = 0;
        DoublyLinkedNode<E> current = head;
        while(m < index){
          current = current.getNext();
          ++m;
        }
        DoublyLinkedNode<E> temp = current;
        current = new DoublyLinkedNode<E>(element);
        if(index == 0){
          current.setNext(temp);
          temp.setPrevious(current);
          head = current;
        }
        else{
          current.setNext(temp);
          current.setPrevious(temp.getPrevious());
          temp.setPrevious(current);
          current.getPrevious().setNext(current);
        }
        size++;
      }
      else if(index > size/2){
        int n = size-1;
        DoublyLinkedNode<E> current = tail;
        while(n > index){
          current = current.getPrevious();
          --n;
      }
        DoublyLinkedNode<E> temp = current; 
        current = new DoublyLinkedNode<E>(element);
        current.setNext(temp);/** Connect the new node's next with temp.*/
        current.setPrevious(temp.getPrevious());/** Connect the new node's previous with temp's previous.*/
        temp.setPrevious(current);/** Connect the temp with the new node .*/
        current.getPrevious().setNext(current);
        size++;
      }
    }
  }
  
  /** A method to return the value of the node at index in the list.*/
  public E get(int index){
    return getNode(index).getElement();
  }
  
  /** A method to return the index of the first node containing “element”*/
  public int indexOf(E element){
    DoublyLinkedNode<E> current = head;
    for(int m = 0; m < size; ++m){
      if(current.getElement().equals(element)){
        return m;
      }
      current = current.getNext();
    }
    return -1;
  }
  
  /** A method to remove the Node at the given index and return its element.*/
  public E remove(int index){
    if(index < 0 || index > size){
      throw new IndexOutOfBoundsException(); 
    }
    else{
      if(index <= size/2){
        int m = 0;
        DoublyLinkedNode<E> current = head;
        while(m < index){
          current = current.getNext();
          ++m;
        }
        DoublyLinkedNode<E> temp = current;
        if(index == 0){
          head = current.getNext();
        }
        else{
          temp.getPrevious().setNext(temp.getNext());
          temp.getNext().setPrevious(temp.getPrevious());
        }
        size--;
        return temp.getElement();
      }
      else{
        int n = size -1;
        DoublyLinkedNode<E> current = tail;
        while(n > index){
          current = current.getPrevious();
          n--;
        }
        DoublyLinkedNode<E> temp = current;
        if(index == size-1){
          tail = temp.getPrevious();
        }
        else{
          temp.getPrevious().setNext(temp.getNext());
          temp.getNext().setPrevious(temp.getPrevious());
        }
        size--;
        return temp.getElement();
      }
    }
  }
  
  /** A method to remove the first Node that contains element.*/
  public boolean remove(E element){
    DoublyLinkedNode<E> current = head;
    for(int i = 0; i< size; ++i){
      if(current.getElement().equals(element)){
        DoublyLinkedNode<E> temp = current;
        if(i == 0){
          head = current.getNext();
        }
        else if(i == size-1){
          tail = temp.getPrevious();
        }
        else{
          temp.getPrevious().setNext(temp.getNext());
          temp.getNext().setPrevious(temp.getPrevious());
        }
        size--;
        return true;
      }
      current = current.getNext();
    }
    return false;
  }
  
  /** A method to return the DoublyLinkedList's size*/
  public int size(){
    return size;
  }
  public static void main(String[] args){
    DoublyLinkedList<String> list= new DoublyLinkedList<>();
    list.add(0,"S");
    list.add(0,"D");
    System.out.println(list.get(1));
  }
}