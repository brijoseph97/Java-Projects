/**
Created a program with the provided multidimensional array which
includes all numbers from 1 to 25. Created three methods to do basic
math on the given array. The first method, calcTotal, adds all the 
values in the array. The second method, calcAverage, computes the
average of all the values in the array. The third method, calcRowAverage,
computes the average of a specific row in the array; for this method, I asked
the user to input what row to calculate the average for, and error checked their
input for a valid row entry.
**/

import java.util.Scanner;

public class MultidimensionArray {

   public static void main(String args[]) {
      //Declare Variables
      Scanner input = new Scanner(System.in);
      long [][] nums = {{1, 2, 3, 4, 5}, {6, 7, 8, 9},
                       {10, 11, 12, 13, 14, 15}, {16, 17, 18, 19, 20},
                       {21, 22, 23, 24, 25}};
      
      //Print result of calcTotal method
      System.out.println("The total of all the values in the array added together is " + calcTotal(nums));
      
      //Print result of calcAverage method
      System.out.println("The average of all the values in the array is " + calcAverage(nums));
      
      int rowNumber = 0; //Will store row number to average
      
      //Ask user for input of row number to average
      System.out.println("Enter which row, 1-5, you would like to calculate the average for: ");
      rowNumber = input.nextInt();
      while (rowNumber < 1 || rowNumber > 5) { //Error checking for valid row entry
         System.out.println("Invalid row number, enter a number between 1 and 5: ");
         rowNumber = input.nextInt();
      }
      
      //Print result of calcRowAverage method
      System.out.println("The average of the numbers in row " + rowNumber + " is " + calcRowAverage(nums, rowNumber));
      
   }
   
   /**
   calcTotal method adds all of the elements in the array, including all five rows
   @param array The multidimensional array of numbers 1 to 25
   @return The sum of all numbers from 1 to 25
   */
   public static long calcTotal(long array[][]) {
      //Declare variables
      long total = 0; //Accumulator that will store the sum
      
      for (int row = 0; row < array.length; row++) { //Loop through all the rows
         for (int column = 0; column < array[row].length; column++) { //Nested loop to go through the columns in each row
            total += array[row][column]; //Adds value to accumulator
         }
      }
      
      return total;
   }
   
   /**
   calcAverage method returns the average of all of the elements in the array
   by adding them together and then dividing by how many individual elements their are
   @param array The multidimensional array of numbers 1 to 25
   @return The average of all numbers from 1 to 25
   */
   public static double calcAverage(long array[][]) {
      //Declare Variables
      double average = 0; //Will be returned by the method
      double counter = 0; //Will store number of elements in the array
      double total = 0; //Accumulator that will store the sum of the elements
      
      for (int row = 0; row < array.length; row++) { //Loop through all the rows
         for (int column = 0; column < array[row].length; column++) { //Nested loop to go through the columns in each row
            total += array[row][column]; //Adds value to accumulator
            counter++; //Adds one to toal elements
         }
      }
      
      average = total / counter; //Computes the average
      return average;
   }
   
   /**
   calcRowAverage method returns the average of a specific row number chosen by the user
   @param array The multidimenstional array of numbers 1 to 25
   @param row The row that the user wants to calculate the average of
   @return The average of the chosen row
   */
   public static double calcRowAverage(long array[][], int row) {
      //Declare Variables
      double total = 0; //Accumulator
      double average = 0; //Will store row average to be returned
      double counter = 0; //Number of elements in chosen row
      
      for (int column = 0; column < array[row - 1].length; column++) { //Use row-1 as index's start at 0, so row 1 would be index 0
         total += array[row - 1][column]; //Add value for each element in row to accumulator
         counter++; //Add one to total elements in the row
      }
      
      average = total / counter; //Computes the average of the chosen row
      return average;
   }   
}