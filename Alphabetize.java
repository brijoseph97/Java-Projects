/**
This program alphabetizes three names inputted by the user. With the three names given, their are six possible
conditions for the order the names could go in. I made multiple nested if statements as well as else if statements
in order to reach all six of these outcomes.
**/

import java.util.Scanner;
 
public class Alphabetize {
   public static void main(String[] args) {
      // Declare variables
      Scanner inputNames = new Scanner(System.in);
      String name1, name2, name3;
      
      //Ask User Input
      System.out.println("Enter the first name: ");
      name1 = inputNames.next();
      System.out.println("Enter the second name: ");
      name2 = inputNames.next();
      System.out.println("Enter the third name: ");
      name3 = inputNames.next();
      
      //Processing and display output
      if (name1.compareTo(name2) <= 0) { //Tests if name 1 comes before name 2, if true three possible conditions
         if (name1.compareTo(name3) <= 0) { //Name 1 comes before name 2, tests if name 1 comes before name 3, if true two conditions
            if (name2.compareTo(name3) <= 0) { //name1 is less than name2 and name3, this will determine order of name2 and name3
               System.out.printf("FIRST: %s SECOND: %s THIRD: %s",name1, name2, name3); //name1, name2, name3 alphabetically
            } else {
               System.out.printf("FIRST: %s SECOND: %s THIRD: %s",name1, name3, name2); //name1, name3, name2 alphabetically
            }
         } else { //name1 is before name2 but after name3
            System.out.printf("FIRST: %s SECOND: %s THIRD: %s",name3, name1, name2); //name3, name 1, name2 alphabetically
         }
      } else if (name1.compareTo(name3) <= 0) { //Rest will be else if statements to get last three conditions met
         System.out.printf("FIRST: %s SECOND: %s THIRD: %s",name2, name1, name3); //name2, name1, name3 alphabetically
      } else if (name2.compareTo(name3) <= 0) {
         System.out.printf("FIRST: %s SECOND: %s THIRD: %s",name2, name3, name1); //name2, name3, name1 alphabetically
      } else { //Only remaining order, name3, name2, name1
         System.out.printf("FIRST: %s SECOND: %s THIRD: %s",name3, name2, name1); //name3, name2, name1 alphabetically
      }
   }
}