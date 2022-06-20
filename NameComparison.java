/**
Created a program that compares two names entered by the user to determine if they are the same.
I solved this problem with two seperate methods, one that takes case into account, and one that 
does not. The equals method is case sensitive so if capitalization was different, even if the names
were the same, the method would view them as being different. For this reason, I created a nested if
statement to change both the entered names to all uppercase to check to see if they were the same
once the case of the characters was out of the problem. The second way to solve this problem, which
ignores case, uses the equalsIgnoreCase method.
**/

import java.util.Scanner;
 
public class NameComparison {
   public static void main(String[] args) {
      // Declare variables
      Scanner nameInput = new Scanner(System.in);
      String name1, name2;
      
      // Ask user input
      System.out.println("Enter the first name: ");
      name1 = nameInput.next();
      System.out.println("Enter the second name: ");
      name2 = nameInput.next();
      
      //Processing 
      
      //First method of solving problem, is case sensitive
      if (name1.equals(name2)) {
         System.out.println("The names entered were the same.");
      } else {
         //Convert the strings to uppercase
         String name1Uppercase = name1.toUpperCase();
         String name2Uppercase = name2.toUpperCase();
         if (name1Uppercase.equals(name2Uppercase)) {
            System.out.println("The names entered are equal if case is ignored.");
         } else {
            System.out.println(name1 + " and " + name2 + " are not the same.");
         }
      }
      
      //Other way to compare names by ignoring case
      System.out.println(); //Skipping line for clear output seperation
      if (name1.equalsIgnoreCase(name2)) {
         System.out.println("The names entered were the same.");
      } else {
         System.out.println(name1 + " and " + name2 + " are not the same.");
      }
   }
}