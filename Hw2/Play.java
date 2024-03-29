/**
CSE 17
Jitong Ding
jid221
Homework #2    Deadline: September 11, 2018 
Program:  A class for theatrical plays
*/
import java.util.Scanner;

/** A class can represent aspecific production in the theaterís season and 
  * can print out the total revenue of the theater's seson*/
public class Play{
  
  /** Date field*/
  /** A data field named title for the name of the play. */
  String title;
  /** A data field named director for the director of the play. */
  String director;
  /**A data field named dateList of the performed dates */ 
  String[] dateList;
  
  /** Construct a new Play with title, director and dateList[] */
  public Play(String aName, String aDirector, String[] aDateList){
    title = aName;
    director = aDirector;
    dateList = aDateList;
    }
  
  /** Construct a new Play with title and dateList[] */
  public Play(String playName, String[] playDateList){
    title = playName;
    dateList = playDateList;
    director = "TBD";
  }
  
  /** An instance method return the length of the dateList[] */
  public int getNumberOfDates(){
    return dateList.length;
  }
  
  /** Return the total revenue based on all of the plays and the percentage of tickets sold */
  public static double estimateRevenue(Play[] playsList, double ticketPrice, int seatNumbers, double ticketsSell){
    int sum = 0;
    for(int i =0; i< playsList.length; ++i){
      sum += playsList[i].dateList.length;
    }
    
    double revenue = seatNumbers * ticketsSell * ticketPrice * sum;
    return revenue;
  }
  
  /** Print a table of the total revenue based on the different percentage tickets sold */
  public static void printRevenueTable(Play[] aPlaysList, double aTicketsPrice, int aSeatNumbers){
    System.out.println("Seats Sold   Revenue");
    System.out.println("-----------  ----------");
    int seats = aSeatNumbers;
    int i =70; 
    /** A while loop to print the revenue table */
    while(i<=100){ 
      if(i<100){ 
        System.out.printf(" %d ( %d%%)\t  %6.2f\n", seats*i/100, i, 
                          estimateRevenue(aPlaysList, aTicketsPrice, seats, (double)i/100));
      }
      else {
        System.out.printf(" %d (%d%%)\t  %6.2f\n", seats*i/100, i, 
                          estimateRevenue(aPlaysList, aTicketsPrice, seats, (double)i/100));
      }
      
        i += 5;
   
    }
  }
  
  /** The main method */
  public static void main(String[] args){
    
    /** Creat five Play Objects */
    Play[] show = new Play[5];
    show[0] = new Play("The Royal Family", "Robert Callan Adams", 
      new String[]{"1/31", "2/1", "2/7", "2/8", "2/9", "2/13", "2/14", "2/15", "2/16"});
    show[1] = new Play("La Cage aux Folles", "Brenda McGuire", 
      new String[]{"3/28", "3/29", "4/4", "4/5", "4/6", "4/10", "4/11", "4/12", "4/13"});
    show[2] = new Play("To Kill a Mockingbird", "George Miller", 
      new String[]{"5/30", "5/31", "6/6", "6/7", "6/8", "6/12", "6/13", "6/14" , "6/15"});
    show[3] = new Play("Annie Get Your Gun", "Mark Breiner", 
      new String[]{"7/25", "7/26", "8/1", "8/2", "8/3", "8/7", "8/8", "8/9", "8/10"});
    show[4] = new Play("I Love You, You're Perfect, Now Change", 
      new String[]{"9/26", "9/27", "10/3", "10/4", "10/5", "10/9", "10/11", "10/12", "10/13"});
    
    /** Print a list of the title the plays with the number */
    for(int i=0; i<show.length; ++i){
      System.out.printf("%d:%s\n", i+1, show[i].title);
    }
    /** Create a scanner that takes scan from the standard input device */
    Scanner scan = new Scanner(System.in);
    
    /** Ask the user to enter the number of a play, and prints its director */
    System.out.println("Enter a show's number and I'll tell you the director:");
    int m = scan.nextInt();
    System.out.println(show[m-1].director);
    
    /** Ask the user to enter the number of a play, and prints its dateList[] */
    System.out.println();
    System.out.println("Enter a show's number and I'll tell you it's dates:");
    int n = scan.nextInt();
    /** A for loop to print the data in dateList */
    for (int j = 0; j< show[n-1].dateList.length; ++j){
      System.out.print(show[n-1].dateList[j]);
      if (j==show[n-1].dateList.length-1){
        System.out.print("\n\n");
      }
      else{
          System.out.print(", ");
    }
      
    } 
    

    int totalSeats = 160;
    
    /** Ask the user to enter the price of the play and print the revenue table */
    System.out.println("Enter a ticket price:");
    double p = scan.nextDouble();
    printRevenueTable(show, p, totalSeats);
 
  
  
}
}
                          

                         

                        

  