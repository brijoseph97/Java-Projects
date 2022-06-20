/**
Created a program that takes a user's package weight and calculates the shipping
cost. Asked the user to input the weight of their package and then multiplied the
given weight by the given multipliers to calculate the cost of shipping. Used the 
printf method to round the price to two digits for the decimals to display correctly
as a price.
**/

import java.util.Scanner;

public class Shipping {
   public static void main(String[] args) {
      // Declare Variables
      Scanner inputWeight = new Scanner(System.in); //Scanner variable for user to enter weight
      //Will use double variable so that user can enter fractions of a pound and to display cost with cents included
      double weight;
      double shippingCost;
      
      // Ask User Input
      System.out.println("Enter the weight of your package: ");
      weight = inputWeight.nextDouble();
      
      // Processing and Display Output
      if (weight <= 5.0) {
         shippingCost = weight * 1.20; // $1.20 per pound
         System.out.print("Your package weight is " + weight + " pounds, ");
         System.out.printf("the cost of shipping is $%.2f", shippingCost); //Will display shippingCost to only two decimal places
      } else if (weight <= 10.0) {
         shippingCost = weight; // $1 per pound (will be the same as the weight
         System.out.print("Your package weight is " + weight + " pounds, ");
         System.out.printf("the cost of shipping is $%.2f", shippingCost);
      } else if (weight <= 20.0) {
         shippingCost = weight * 0.90; // $0.90 per pound
         System.out.print("Your package weight is " + weight + " pounds, ");
         System.out.printf("the cost of shipping is $%.2f", shippingCost);
      } else {
         shippingCost = weight * 0.80; // $0.80 per pound
         System.out.print("Your package weight is " + weight + " pounds, ");
         System.out.printf("the cost of shipping is $%.2f", shippingCost);
      }
   }
}