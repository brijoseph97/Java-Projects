/**
This program reads data from a file that incluedes
a list of strings that represent a list of ints. The
program goes through this list of data, using a try
catch block catches if their is an exception thrown
because of a non-int is written, and assuming it is
an integer value, uses the parseInt method to convert
the string to an integer. These integers are then checked
against the current min and maxes in the list to determine
what the min and max numbers in the file are, which is
returned when the program completes.
**/

import java.util.*;
import java.io.*;

public class SearchText {
   public static void main(String args[]) throws IOException {
      //Declare Variables
      int maxNumber;
      int minNumber;
      int nextNum;
      
      //Open the file
      try {
         
         File file = new File("numbers.txt");
         Scanner inputFile = new Scanner(file);
         
         //Nested try loop if file is successfully opened
         //Converts String values in file to Int's
         try {
            //Set starting values of min and max
            maxNumber = Integer.parseInt(inputFile.nextLine()); //Set Max to first number in file
            minNumber = maxNumber; //Set min to first number in file
            
            while(inputFile.hasNextLine()) {
               nextNum = Integer.parseInt(inputFile.nextLine()); //Reads data from file line by line
               
               //Check if number is smaller than current min value
               if (minNumber > nextNum)
                  minNumber = nextNum;
                  
               //Check if number is bigger than current max value
               if (maxNumber < nextNum)
                  maxNumber = nextNum;
            }
         
         //Display output
         System.out.println("The biggest number in the file is " + maxNumber + ".");
         System.out.println("The smallest number in the file is " + minNumber + ".");
         }
         
         //Catch error if non int value is in line of file
         catch(InputMismatchException e) {
            System.out.println("Non-numeric data was entered.");
         }
         
         //Close the file
         finally {
            inputFile.close();
         }
      }
      
      //Catch error if file does not exist
      catch(FileNotFoundException error) {
         System.out.println("This file doesn't exist.");
      }
      

   }
}