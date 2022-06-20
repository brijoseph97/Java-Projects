/**
This program gives the user two option's, whether they want to add all the numbers prior to 
and including that number up, or if they want a factorial of that number, which is the same
thing with multiplication instead of addition. For example, if a user entered 5 as their 
number, sum = 1 + 2 + 3 + 4 + 5 and factorial = 1 * 2 * 3 * 4 * 5. In order to complete this
program, I asked the user first which they want to do and put both choices into a switch 
statement along with a default case for if they put something besides the two options. The
switch cases call two distinct methods for the two options, both of which ask the user to
input a number and then find either the sum or factorial of that number respectively and 
return that value to the call in the main method.
**/

import java.util.Scanner;
 
public class SumOrFactorial {
   public static void main(String[] args) {
      // Declare variables
      Scanner userInput = new Scanner(System.in); //User input
      String userChoice; //Will store user's decision
      int finalValue = 0; //Will store the value returned by the two methods
      
      //Ask user input
      System.out.println("Enter \"sum\" for the sum or \"factorial\" for the factorial");
      System.out.println("Would you like to find the sum of numbers prior to your number or the factorial? ");
      userChoice = userInput.next();
      userChoice = userChoice.toUpperCase(); //Makes it so case entered by user doesn't matter
      
      //Switch statement to call specific method
      switch (userChoice) {
         case "SUM":
            //Call sum method
            finalValue = sum();
            
            //Display output
            System.out.println("The sum of the numbers up to your number is " + finalValue);
            break;
         
         case "FACTORIAL":
            //Call factorial method
            finalValue = factorial();
            
            //Display output
            System.out.println("The factorial of your number is " + finalValue);
            break;
         
         default:
            //Display output for if user enter's something besides sum or factorial
            System.out.println("Invalid Choice");
      
      }
   }
   
   /**
   The sum method will ask a user to enter a number and then will
   return the sum of the numbers up to that number.
   @return The total of the numbers added together.
   **/
   
   public static int sum() {
      int num = 0; //Will store number user picks
      int total = 0; //Will be used for the final value of the number's added
      Scanner sumInput = new Scanner(System.in);
      System.out.println("Enter the number that you'd like to find the sum up too: ");
      num = sumInput.nextInt();
      for (int previousNum = 1; previousNum <= num; previousNum++) {
         total += previousNum;
      }
      return total;
   }
   
   /**
   The factorial method will ask a user to enter a number and then will
   return the factorial of that number.
   @return The factorial of the user entered number
   **/
   
   public static int factorial() {
      int num = 0; //Will store number user picks
      int total = 0; //Will store the value of the factorial
      Scanner factorialInput = new Scanner(System.in);
      System.out.println("Enter the number that you'd like to find the factorial of: ");
      num = factorialInput.nextInt();
      if (num > 0)
         total = 1;
      else
         return total; //In case user enter's 0
      for (int previousNum = 1; previousNum <= num; previousNum++) {
         total *= previousNum;
      }
      return total;
   }
}

   
        