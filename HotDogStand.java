/**
Created a program that creates HotDogStand objects that
track the sales for multiple hotdog stands. For this exercise
I created three hotdog stands, but the program supports an
unlimited amount. The program asks a user to enter the ID number
of their stand, along with their daily sales up to that point. The
program then displays this information along with the total sales 
for all hot dog stands combinec, which would allow for someone who
owns multiple hotdog stands to keep track of the total sales. The 
program then asks how many more hot dogs are expected to be sold
and an estimate is displayed for the given hotdog stand for the day
along for the estimate of all the stands combined,
*/

import java.util.Scanner;

public class HotDogStand {

   //Declare Member Variables   
   private int idNumber;
   private int dailySales;
   
   /**
   Constructor
   @param id will hold objects id number and 
   sales will hold objects daily sales
   */ 
   public HotDogStand(int id, int sales) {
      idNumber = id;
      dailySales = sales;
      totalHotDogs += dailySales; //Adds the individual stands sales to the total
   }
   
   /**
   Increments daily sales by one and also adds one to the total count
   for all stands. Meant to be used to add one sale to a given stand.
   */
   public void justSold() {
      dailySales++;
      totalHotDogs++;
   }
   
   /**
   Returns the daily sales for a give stand
   @return The total daily sales for a given stand
   */
   public int getHotdogs() {
      return dailySales;
   }
   
   private static int totalHotDogs;
   
   /**
   Used to return the combined sales of all stands
   @return Hotdogs sold by all stands
   */
   public static int getTotalHotDogs() {
      return totalHotDogs;
   }
   
   /**
   Used to convert the hot dog stand's constructor data to an output
   @return A string output of a hot dog stand's ID number and daily sales
   along with total sales.
   */
   public String toString() {
      return "The hotdog stand with ID number " + idNumber
             + " has sold " + dailySales + " hot dogs, All stands together sold "
             + HotDogStand.getTotalHotDogs() + " hot dogs.";
   }
   
   public static void main(String[] args) {
      //Declare variables
      Scanner input = new Scanner(System.in);
      int oneId, twoId, threeId;
      int oneSales, twoSales, threeSales;
      
      //Ask user input and create hot dog stand objects
      System.out.println("Enter the ID for stand one: ");
      oneId = input.nextInt();
      System.out.println("Enter the total hot dogs sold by stand one: ");
      oneSales = input.nextInt();
      HotDogStand one = new HotDogStand(oneId, oneSales);
      
      System.out.println("Enter the ID for stand two: ");
      twoId = input.nextInt();
      System.out.println("Enter the total hot dogs sold by stand two: ");
      twoSales = input.nextInt();
      HotDogStand two = new HotDogStand(twoId, twoSales);
      
      System.out.println("Enter the ID for stand three: ");
      threeId = input.nextInt();
      System.out.println("Enter the total hot dogs sold by stand three: ");
      threeSales = input.nextInt();
      HotDogStand three = new HotDogStand(threeId, threeSales);
      
      //Display output
      System.out.println(one.toString());
      System.out.println(two.toString());
      System.out.println(three.toString());
      
      //Test justSold and getHotdogs methods
      
      //Stand One Estimated Sales
      System.out.println("Enter how many more hot dogs you expect stand one to sell today: ");
      int estimate = input.nextInt();
      int counter;
      for (counter = 0; counter < estimate; counter++) {
         one.justSold();
      }
      System.out.println("The expected total sales for stand one at the end of the day is "
                        + one.getHotdogs() + " hot dogs, \nmaking the estimated total hot dogs sold by all stands "
                        + HotDogStand.getTotalHotDogs() + ".\n");
                        
      //Stand Two Estimated Sales
      System.out.println("Enter how many more hot dogs you expect stand two to sell today: ");
      estimate = input.nextInt();
      for (counter = 0; counter < estimate; counter++) {
         two.justSold();
      }
      System.out.println("The expected total sales for stand two at the end of the day is "
                        + two.getHotdogs() + " hot dogs, \nmaking the estimated total hot dogs sold by all stands "
                        + HotDogStand.getTotalHotDogs() + ".\n");
      
      //Stand Three Estimated Sales
      System.out.println("Enter how many more hot dogs you expect stand three to sell today: ");
      estimate = input.nextInt();
      for (counter = 0; counter < estimate; counter++) {
         three.justSold();
      }
      System.out.println("The expected total sales for stand three at the end of the day is "
                        + three.getHotdogs() + " hot dogs, \nmaking the estimated total hot dogs sold by all stands "
                        + HotDogStand.getTotalHotDogs() + ".");
   }
}