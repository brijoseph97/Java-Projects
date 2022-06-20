/**
Created a program that creates the score for a competitor's dive.
Program begins by creating an array that can store seven values,
which will store the values of the seven judges scores. User inputs
the seven judges scores. Program then asks for the user to enter
the degree of difficulty of the dive. After receiving all of the user
input, the main method calls the overallScore method, passing the scores
array and the level of difficulty. The overallScore array calls the minScore
and maxScore method which determines the lowest and highest scores given to the
dive which will be subtracted from the total. The total, minus the lowest and
highest score is multiplied by the level of difficulty and 0.6 to determine
the overall score of the dive. This final calculation is then returned to the main
method to display the score to the output console.
**/

import java.util.Scanner;

public class Diving {
   public static void main(String[] args) {
      
      //Declare variables
      double[] scores = new double[7];
      Scanner input = new Scanner(System.in);
      
      //Initialize the Array
      for (int index = 0; index < 7; index++) {
         double judgeScore; //Store's judge score for each iteration of the loop
         //Ask user input for judge's scores
         System.out.println("Enter the score for judge " + (index + 1) + ": "); 
         judgeScore = input.nextDouble();
         
         while (judgeScore < 0.0 || judgeScore > 10.0) { //Error checking for entry between 0 and 10
            System.out.println("Invalid entry for judge " + (index + 1) + ".");
            System.out.println("Enter score that is between 0.0 and 10.0: ");
            judgeScore = input.nextDouble();
         }
         scores[index] = judgeScore; //Stores judge's score in the array
      }
      
      //Ask user for input of degree of difficulty
      System.out.println("Enter the degree of difficulty of the dive: "); 
      double difficulty = input.nextDouble();
      
      while (difficulty < 1.2 || difficulty > 3.8) { //Error checking for entry betweem 1.2 and 3.8
         System.out.println("Invalid entry for level of difficulty.");
         System.out.println("Enter level of difficulty that is between 1.2 and 3.8: ");
         difficulty = input.nextDouble();
      }
      
      System.out.printf("The overall score for this dive was %.2f", overallScore(scores, difficulty)); //Calls overallScore method for the dive score
   }
   
   
   /**
   Method that determines the highest value in the array
   @param scores Array of the judges scores
   @return The highest value in the array
   */
   public static double maxScore(double[] scores) {
      double max = scores[0]; //Set's the beginning value to the value stored in the first spot of the array
      
      for (int index = 1; index < scores.length; index++) { //Loops through array to determine the highest value
         if (scores[index] > max)
            max = scores[index];
      }
      return max;
   }
   
      /**
   Method that determines the lowest value in the array
   @param scores Array of the judges scores
   @return The lowest value in the array
   */
   public static double minScore(double[] scores) {
      double min = scores[0]; //Set's the beginning value to the value stored in the first spot of the array
      
      for (int index = 1; index < scores.length; index++) { //Loops through the array to determine the lowest value
         if (scores[index] < min)
            min = scores[index];
      }
      return min;
   }
   
   /**
   Calculates the score of the dive
   @param scores Array of the judges scores
   @param difficulty The level of difficulty of the dive
   @return The overall score of the dive
   */
   public static double overallScore(double[] scores, double difficulty) {
      final double MULTIPLE = 0.6; //Constant used for overall score formula
      
      //Determine lowest and highest value of judge's scores
      double min = minScore(scores); //Call's minScore method and stores the lowest score
      double max = maxScore(scores); //Call's maxScore method and stores the highest score
      
      //Add up all of the scores
      double total = 0.0;
      for (int index = 0; index < scores.length; index++) {
         total += scores[index];
      }
      
      //Subtract the highest and lowest score from the total
      total = total - min - max;
      
      //Multiply the total by the level of difficulty and the constant to get overall score
      double overall = total * difficulty * MULTIPLE;
      return overall;
   }
}