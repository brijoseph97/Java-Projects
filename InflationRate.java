/**
This program calculates the estimated price of an item after inflation years later. The program
begins by asking for the user to input the current price of the item, how many years later the
product will be purchased, and the inflation rate. I then used a while loop to increase the cost
by the inflation rate once every year as inflation rate is a compound rate. I then used a formatted
print statement to round the new cost to two decimal points and displayed it to the user.
**/

import java.util.Scanner;
 
public class InflationRate {
   public static void main(String[] args) {
   // Declare variables
   Scanner userInput = new Scanner(System.in); //User input
   double cost = 0.0; //Price of item, double allows for cents input
   int years = 0; //How far from now item will be purchased
   double inflationRate = 0.0; //Inputted inflation rate
   int counter = 0; //Used to progress through iterations of loop
   
   //Ask user input
   //Ask for the price of the item
   System.out.println("What is the current price of the item? ");
   cost = userInput.nextDouble();
   
   //Ask for how many years from now the item will be purchased
   System.out.println("How many years from now will the item be purchased? ");
   years = userInput.nextInt();
   
   //Ask for the inlation rate
   System.out.println("Enter the inflation rate as a percentage: ");
   inflationRate = userInput.nextDouble();
   inflationRate /= 100.00; //Changes inflation rate to decimal value
   
   //Processing
   while (counter < years) {
      cost = cost + (cost * inflationRate);
      counter++;
   }
   //Display output
   System.out.printf("This item after %d years will cost approximately: $%.2f", years, cost);
   }
}