/*
CSE 17
Jitong Ding
jid221
Homework #3 DEADLINE: October 1, 2018
Program: Text Messaging
*/

/** A class for a single text message */
public class TextMessage{
  
  /** Date field*/
  /** A private data field named recipient for the recipient of the TaxTable. */
  private String recipient;
  /** A private data field named keyPresses for the keyPresses of the TaxTable. */
  private String keyPresses;
  
  /** Construct a new TextMessage recipient and keyPresses */
  public TextMessage(String aRecipient, String aKeyPresses){
    recipient = aRecipient;
    keyPresses =aKeyPresses;
  }
  
  /** An instance method return the recipient */
  public String getRecipient(){
    return recipient;
  }
  
 /** An instance method return the DecodedMessage */
  public String getDecodedMessage() {
    String decodeMsg = "";
    /** A two-dimension array for the decoded letters */
    String[][] decodeArray = new String[][]{{" "},{"."},{"A","B","C"},{"D","E","F"},{"G","H","I"},
      {"J","K","L"},{"M","N","O"},{"P","Q","R","S"},{"T","U","V"},{"W","X","Y","Z"}};
    int i =0;
   /** A while loop to transfer the message from the File to the decoded messages */
    loop: while(i<keyPresses.length()){
      int numCount = 0;
     /** A if-statement to find the char'2' in keyPresses */
      if(keyPresses.charAt(i)=='2'){
        for(int k =1; k<4; ++k){
         /** A if-statement to find the i = keyPresses.length-1 in keyPresses */
          if(i==keyPresses.length()-1){
            decodeMsg += decodeArray[2][0];
            break loop;
          }
          else{
          /** A if-statement to find the i+k > keyPresses.length-1 in keyPresses */
            if(i+k>keyPresses.length()-1){
              decodeMsg += decodeArray[2][k-1];
              numCount += k; 
              break loop;
            }
            else if(keyPresses.charAt(i+k)!=keyPresses.charAt(i)){
              decodeMsg += decodeArray[2][k-1];
              numCount +=k;
              break;
            }
          }
        }
      }
    /** else A if-statement to find the char'3' in keyPresses */
      else if(keyPresses.charAt(i)=='3'){
        for(int k =1; k<4; ++k){
          /** A if-statement to find the i = keyPresses.length-1 in keyPresses */
          if(i==keyPresses.length()-1){
            decodeMsg += decodeArray[3][0];
            break loop;
          }
          else{
           /** A if-statement to find the i+k > keyPresses.length-1 in keyPresses */
            if(i+k>keyPresses.length()-1){
              decodeMsg += decodeArray[3][k-1];
              numCount += k; 
              break loop;
            }
            else if(keyPresses.charAt(i+k)!=keyPresses.charAt(i)){
              decodeMsg += decodeArray[3][k-1];
              numCount +=k;
              break;
            }
          }
        }
      }
    /** A else if-statement to find the char'4' in keyPresses */
      else if(keyPresses.charAt(i)=='4'){
        for(int k =1; k<4; ++k){
         /** A if-statement to find the i = keyPresses.length-1 in keyPresses */
          if(i==keyPresses.length()-1){
            decodeMsg += decodeArray[4][0];
            break loop;
          }
          else{
           /** A if-statement to find the i+k > keyPresses.length-1 in keyPresses */
            if(i+k>keyPresses.length()-1){
              decodeMsg += decodeArray[4][k-1];
              numCount += k; 
              break loop;
            }
            else if(keyPresses.charAt(i+k)!=keyPresses.charAt(i)){
              decodeMsg += decodeArray[4][k-1];
              numCount +=k;
              break;
            }
          }
        }
      }
    /** A else if-statement to find the char'5' in keyPresses */
      else if(keyPresses.charAt(i)=='5'){
        /** A if-statement to find the i = keyPresses.length-1 in keyPresses */
        for(int k =1; k<4; ++k){
          if(i==keyPresses.length()-1){
            decodeMsg += decodeArray[5][0];
            break loop;
          }
          else{
          /** A if-statement to find the i+k > keyPresses.length-1 in keyPresses */
            if(i+k>keyPresses.length()-1){
              decodeMsg += decodeArray[5][k-1];
              numCount += k; 
              break loop;
            }
            else if(keyPresses.charAt(i+k)!=keyPresses.charAt(i)){
              decodeMsg += decodeArray[5][k-1];
              numCount +=k;
              break;
            }
          }
        }
      }
     /** A else if-statement to find the char'6' in keyPresses */
      else if(keyPresses.charAt(i)=='6'){
       /** A if-statement to find the i = keyPresses.length-1 in keyPresses */
        for(int k =1; k<4; ++k){
          if(i==keyPresses.length()-1){
            decodeMsg += decodeArray[6][0];
            break loop;
          }
          else{
          /** A if-statement to find the i+k > keyPresses.length-1 in keyPresses */
            if(i+k>keyPresses.length()-1){
              decodeMsg += decodeArray[6][k-1];
              numCount += k; 
              break loop;
            }
            else if(keyPresses.charAt(i+k)!=keyPresses.charAt(i)){
              decodeMsg += decodeArray[6][k-1];
              numCount +=k;
              break;
            }
          }
        }
      }
     /** A else if-statement to find the char'9' in keyPresses */
      else if(keyPresses.charAt(i)=='9'){
      /** A if-statement to find the i = keyPresses.length-1 in keyPresses */
        for(int k =1; k<5; ++k){
          if(i==keyPresses.length()-1){
            decodeMsg += decodeArray[9][0];
            break loop;
          }
          else{
          /** A if-statement to find the i+k > keyPresses.length-1 in keyPresses */
            if(i+k>keyPresses.length()-1){
              decodeMsg += decodeArray[9][k-1];
              numCount += k; 
              break loop;
            }
            else if(keyPresses.charAt(i+k)!=keyPresses.charAt(i)){
              decodeMsg += decodeArray[9][k-1];
              numCount += k;              
              break;
            }
          }
        }
      }
    /** A else if-statement to find the char'7' in keyPresses */
      else if(keyPresses.charAt(i)=='7'){
      /** A if-statement to find the i = keyPresses.length-1 in keyPresses */
        for(int k =1; k<5; ++k){
          if(i==keyPresses.length()-1){
            decodeMsg += decodeArray[7][0];
            break loop;
          }
          else{
          /** A if-statement to find the i+k > keyPresses.length-1 in keyPresses */
            if(i+k>keyPresses.length()-1){
              decodeMsg += decodeArray[7][k-1];
              numCount += k; 
              break loop;
            }
            else if(keyPresses.charAt(i+k)!=keyPresses.charAt(i)){
              decodeMsg += decodeArray[7][k-1];
              numCount += k;              
              break;
            }
          }
        }
      } 
    /** A else if-statement to find the char'8' in keyPresses */
      else if(keyPresses.charAt(i)=='8'){
     /** A if-statement to find the i = keyPresses.length-1 in keyPresses */
        for(int k =1; k<4; ++k){
          if(i==keyPresses.length()-1){
            decodeMsg += decodeArray[8][0];
            break loop;
          }
          else{
          /** A if-statement to find the i+k > keyPresses.length-1 in keyPresses */
            if(i+k>keyPresses.length()-1){
              decodeMsg += decodeArray[8][k-1];
              numCount += k; 
              break loop;
            }
            else if(keyPresses.charAt(i+k)!= keyPresses.charAt(i)){
              decodeMsg += decodeArray[8][k-1];
              numCount += k; 
              break;
            }
          }
        }   
      }
    /** A else if-statement to find the char'0' in keyPresses */
      else if ("0".equals(keyPresses.substring(i,i+1))){
        decodeMsg += decodeArray[0][0];
        numCount +=1;
      }
    /** A else if-statement to find the char'1' in keyPresses */
      else if ("1".equals(keyPresses.substring(i,i+1))){
        decodeMsg += decodeArray[1][0];
        numCount +=1;
      }
     /** A else statement*/
      else {
        numCount += 1;
      }
  
      i += numCount;
      
}
    
    return decodeMsg;
  }
  
}
  
