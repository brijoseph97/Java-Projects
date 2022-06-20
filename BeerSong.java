/**
Created a program that asks user to input a number, and then printed
the lyrics for the beer on the wall song starting from that number.
For numbers twenty to ninety-nine, since all the numbers are structured
the same way, I could use two switch's to get the tens place value
and the ones place value to make the quantitative number into a word;
however, since number's one to twenty are not structured the same way,
I made to different switch's for numbers in this range as well. Then printed
out the song lyrics by making a beer song object by using a constructor I made
and then went called a method on that object to print out all the lines of the
song.
**/

import java.util.Scanner;

public class BeerSong {
   
   //Create variable to store the quantitative number
   private int bottlesNumber;

   /**
   Constructor
   @param startingNumber Number user Enter's
   */
   public BeerSong (int startingNumber) {
      if (startingNumber < 0)
         bottlesNumber = 0;
      else if (startingNumber > 99)
         bottlesNumber = 99;
      else
         bottlesNumber = startingNumber;
   }
   
   /**
   Method used to get word form of ones place value
   @param ones Takes the result of bottlesNumber % 10
   @return The word form of the ones place value
   */
   public String getOnesPlaceValue (int ones) {
      switch (ones) {
         case 0: 
            return "Zero";
         case 1:
            return "One";
         case 2:
            return "Two";
         case 3:
            return "Three";
         case 4:
            return "Four";
         case 5:
            return "Five";
         case 6:
            return "Six";
         case 7:
            return "Seven";
         case 8:
            return "Eight";
         case 9:
            return "Nine";
         default:
            return "Error";
      }
   }
   
   /**
   Method for the word form of numbers ten to nineteen
   @param doubleDigitTeens takes any bottlesNumber value between 10 and 19
   @return Word value of numbers ten through nineteen
   */
   public String getTenToTwenty(int doubleDigitTeens) {
      switch (doubleDigitTeens) {
         case 0: 
            return "Ten";
         case 1: 
            return "Eleven";
         case 2: 
            return "Twelve";
         case 3: 
            return "Thirteen";
         case 4: 
            return "Fourteen";
         case 5: 
            return "Fifteen";
         case 6:
            return "Sixteen";
         case 7:
            return "Seventeen";
         case 8:
            return "Eighteen";
         case 9:
            return "Nineteen";
         default:
            return "Error";
      }
   }
   
   /**
   Method returns the word form of the tens place value of numbers above 20
   @param tens takes result of bottlesNumber / 10
   @return Word form of tens place value of numbers above 20
   */
   public String getTensPlaceValue (int tens) {
      switch (tens) {
         case 2:
            return "Twenty";
         case 3:
            return "Thirty";
         case 4:
            return "Forty";
         case 5:
            return "Fifty";
         case 6:
            return "Sixty";
         case 7:
            return "Seventy";
         case 8:
            return "Eighty";
         case 9:
            return "Ninety";
         default:
            return "Error";
      }
   }
   
   /**
   Method that calls the methods with the switch statements to change the number
   @param num Takes the number of bottles
   */
   public String digitToWord(int num) {
      int onesPlaceValue = num % 10; //Returns the ones place value of a number
      int tensPlaceValue = num / 10; //Returns the tens place value of a number
      
      if (num >= 20) { //Numbers 20-99
         if (onesPlaceValue == 0)
            return getTensPlaceValue(tensPlaceValue);
         else 
            return getTensPlaceValue(tensPlaceValue) + "-" + getOnesPlaceValue(onesPlaceValue);
      } else if (num >= 10) { //Numbers 10-19
         return getTenToTwenty(onesPlaceValue);
      } else { //Numbers 1-9
         return getOnesPlaceValue(onesPlaceValue);
      }
   }
   
   /**
   Method to compose the lyrics of the song
   */
   public void printSong () {
      String bottlesOrBottle = "bottles";
      String numberWord = "";
      //Display output
      while (bottlesNumber > 1) { //Stanzas 2-99
         if (bottlesNumber == 1) //Used to be gramatically correct
            bottlesOrBottle = "bottle";
         numberWord = digitToWord(bottlesNumber);
         System.out.printf("%s %s of beer on the wall,\n", numberWord, bottlesOrBottle);
         System.out.printf("%s %s of beer!\n", numberWord, bottlesOrBottle);
         System.out.printf("Take one down,\n");
         System.out.printf("Pass it around,\n");
         bottlesNumber--; //Decrease value by one for last line of stanza
         numberWord = digitToWord(bottlesNumber);
         if (bottlesNumber == 1) //Used to be gramatically correct
            bottlesOrBottle = "bottle";
         System.out.printf("%s %s of beer on the wall!\n\n", numberWord, bottlesOrBottle);
      }
      if (bottlesNumber == 1) { //Stanza 1
         numberWord = digitToWord(bottlesNumber); //In case user enters the number one
         bottlesOrBottle = "bottle";
         System.out.printf("%s %s of beer on the wall,\n", numberWord, bottlesOrBottle);
         System.out.printf("%s %s of beer!\n", numberWord, bottlesOrBottle);
         System.out.printf("Take it down,\n");
         System.out.printf("Pass it around,\n");
         System.out.printf("No more bottles of beer on the wall");
      }
    }
   
   
   
   public static void main(String args[]) {
      // Declare Variables
      Scanner input = new Scanner(System.in);
      int bottles = 0;
      
      //Ask User Input
      System.out.println("Please enter a number between 1 and 99:");
      bottles = input.nextInt();
      
      //Check if user entered a valid number for the song lyrics
      //Number must be one or higher since their isn't a stanza for zero bottles
      while (bottles < 1) {
         System.out.println("Please enter a value of at least one.");
         bottles = input.nextInt();
      }
      //Create a beer song object using the constructor with the inputted value
      BeerSong song = new BeerSong(bottles);
      
      //Call the print Song method of the beer song object
      song.printSong();
   }
}

