 /*
CSE 17
Jitong Ding
jid221
Homework #3 DEADLINE: October 1, 2018
Program: Text Messaging
*/

import io.github.pixee.security.BoundedLineReader;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;


/** A class that can read a series of text messages
  * from a file and then print out the decoded versions of them. */
public class TextDecoder{
  
  /** Date field*/
  /** A private data field named messages for the TextMessage[] of the TextDecoder and If there are fewer
messages than the size of the array, nulls appear at the end of the array.. */
  private TextMessage[] messages;
  /** A private data field named msgCount for the number of messages of the TextDecoder. */
  private int msgCount;
  
  /** Construct a new TextDecoder messages[10] and msgCount */
  public TextDecoder(){
    messages = new TextMessage[10];
    msgCount = 0;
  }
  /** A method for Reading messages from the file specified by the
msgFile object, updating messages and msgCount appropriately */
  public void readMessagesFromFile(File msgFile) throws Exception{    
    /** Using BufferedReader and FileReader to read the message from the File*/
    BufferedReader message = new BufferedReader(new FileReader(msgFile));
    String text;
    String[] textMessage = new String[messages.length];
    /** Using while loop to copy the messages from the file to the textMessage array*/
    while((text = BoundedLineReader.readLine(message, 5_000_000)) != null){
      textMessage[msgCount] = text;
      msgCount +=1;
      if(msgCount==9){
        break;
      }
    }
    /** For loop to split the String into two parts */
    for (int i = 0; i< msgCount; ++i){
      String[] parts  = textMessage[i].split(" ",2);
      messages[i] = new TextMessage(parts[0],parts[1]);
    }
    if (msgCount<messages.length){
      for (int m = msgCount; m<messages.length; ++m){
        messages[m] = new TextMessage(null,null);
      }
    }
    message.close();
  }
  
  /** A method for printing all of the messages */
  public void printMessages(){
    for(int i =0; i<msgCount;++i){
      System.out.printf("%s   %s\n",messages[i].getRecipient()+":",messages[i].getDecodedMessage());
    }
  }
  
  /** Checks if there is one command-line argument and exits with a helpful error message if
    * not. Otherwise, reads a set of messages from the specified file and then prints out
    * the decoded messages in the form above */
  public static void main(String[] args) throws Exception{
    
    if(args.length != 1){
      System.out.println("Usage: java TextDecoder filename");
      System.exit(0);
    }
    
    File messageFile = new File(args[0]); 
    TextDecoder decoder = new TextDecoder();
    decoder.readMessagesFromFile(messageFile);
    decoder.printMessages();
  }
}
