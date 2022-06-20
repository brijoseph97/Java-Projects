/**
Created program that asks user to enter a test score. The output of the program
displays both the numeric score that they entered as well as the corresponding
letter grade. To create this I made a compound IF-ELSE IF statement to work through
all the potential scores.
**/

import java.util.Scanner;

public class TestScore {
   public static void main(String[] args) {
      //Declare variables
      Scanner inputScore = new Scanner(System.in); // Makes scanner to use for user input
      char letterGrade; //Declared letter grade as a char since it only takes one letter
      int score;
      
      //Ask User Input
      System.out.println("Enter your test score: ");
      score = inputScore.nextInt(); //User enters their test score
      
      //Processing and output
      if (score >= 90) { //Will include scores 90 and above
         letterGrade = 'A';
         System.out.println("Your test score is a: " + score);
         System.out.println("Your letter grade is: " + letterGrade);
      } else if (score >= 80) { //Will include scores 80 and above that are less than 90
         letterGrade = 'B';
         System.out.println("Your test score is a: " + score);
         System.out.println("Your letter grade is: " + letterGrade);
      } else if (score >= 70) { //Will include scores 70 and above that are less than 80
         letterGrade = 'C';
         System.out.println("Your test score is a: " + score);
         System.out.println("Your letter grade is: " + letterGrade);
      } else if (score >= 60) { //Will include scores 60 and above that are less than 70
         letterGrade = 'D';
         System.out.println("Your test score is a: " + score);
         System.out.println("Your letter grade is: " + letterGrade);
      } else { // Will include all other scores (Below 60)
         letterGrade = 'F';
         System.out.println("Your test score is a: " + score);
         System.out.println("Your letter grade is: " + letterGrade);
      }
   }
}