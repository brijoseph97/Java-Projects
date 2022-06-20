/**
Created a program with the two provided arrays of the five apple types
along with their prices. Made a method that determines what the lowest
value in the prices array is and used the correlated index number to
determine what type of apple that price corresponded too. The method
returns both the type of apple, along with the price, so that the user
knows what the cheapest option is.
**/


public class ApplePrices {
   
   public static void main(String args[]) {
      
      //Declare Variables
      String apples[] = {"HoneyCrisp", "DeliciousRed", "Gala", "McIntosh", "GrannySmith"};
      double prices[] = {4.50, 3.10, 2.45, 1.50, 1.20};
      
      //Call and display the result of the lowestPrice method
      System.out.println(lowestPrice(apples, prices));
      
      
   }
   
   /**
   lowestPrice method determines what apple type is the cheapest, and what the price of that apple is
   @param type Array of the five types of apple
   @param price Array of the prices for the five types of apple
   @return A string that states what type of apple is the cheapest and the price of the apple
   */
   public static String lowestPrice(String type[], double price[]) {
      //Declare Variables
      double low = price[0]; //Initializes the lowest price to the first value in the price array
      int placeHolder = 0; //Will hold which index has the lowest price
      for (int counter = 1; counter < price.length; counter++) {
         if (price[counter] < low) { //Check's if value at current index number in the price array is lower than the current value stored in low
            low = price[counter]; //Replaces value in low with the price at the current index number
            placeHolder = counter; //Stores index number that loop is currently at in order to know which apple it is
         }
      }
      //Use type[placeholder] to determine which apple is the cheapest and value in low to list the price
      return "The cheapest apple is the " + type[placeHolder] + " at " + low + " dollars."; 
   }
}