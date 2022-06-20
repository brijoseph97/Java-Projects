/**
Created a basic counter program that asks the user to enter a value.
This value, if it's either positive or 0 gets stored in the counter variable,
if negative the number gets changed to 0. The class also includes methods
to increment and decrement the counter variable by one, set the counter variable
to zero and to return the counter variable. I also created an equals method to 
compare two instances of the class and a toString object to make a statement
that would be constantly displayed on the console easier to write in the code.
 I used the main method to test all of these methods.
**/

import java.util.Scanner;

public class Counter {
   
   private int counter;
   
   /**
   Constructor
   @param num Number user entered
   */
   public Counter(int num) {
      if (num < 0)
         counter = 0;
      else
         counter = num;
   }
   
   /**
   Changes the counter variable to 0
   */
   public void setCountToZero() {
      counter = 0;   
   }
   
   /**
   Increases counter variable by one
   */
   public void incrementCount() {
      counter++;
   }
   
   /**
   Decreases counter variable by one
   If the decrease causes the counter
   become a negative number the 
   setCountToZero method is called to
   return the counter variable to 0
   */
   public void decrementCount() {
      counter--;
      if (counter < 0)
         setCountToZero();
   }
   
   /**
   Used to access the counter variable
   @return The value of the counter variable
   */
   public int getCount() {
      return counter;
   }
   
   /**
   Used to make a string out of a console output that would be used often
   @return A string that can be used instead of typing an entire output
   */
   public String toString() {
      String str = "The value of counter is: " + counter;
      return str;
   }
   
   /**
   Tests if the counter in two different objects are equal
   @param A second counter object to compare to another counter object
   @return True if they're the same, false if different
   
   */
   public boolean equals(Counter object2) {
      boolean status;
      
      if (counter == object2.counter)
         return true;
      else
         return false;
   }
   
   public static void main(String[] args) {
      //Create Scanner object
      Scanner test = new Scanner(System.in);
      
      //Ask User for Input to Test Methods
      System.out.println("Enter number to test methods: ");
      
      //Create Counter object and passes the value entered by
      //the user to the constructor
      Counter testMethods = new Counter(test.nextInt());
      
      //Ask User to enter a second Number
      System.out.println("Enter either the same number or a different number: ");
      
      //Create a Second Counter object to test equals method
      Counter testMethods2 = new Counter(test.nextInt());
      if (testMethods.equals(testMethods2) == true)
         System.out.println("The number's you entered were the same.");
      else
         System.out.println("The number's you entered were different.");
      
      //Test's getCount method
      System.out.println("\nThe first number you entered was: ");
      System.out.println(testMethods.getCount());
      
      //Test toString method
      System.out.println("\nTesting toString method.");
      System.out.println(testMethods.toString());
      
      //Test's incrementCount method
      System.out.println("\nYour number incremented by one is: ");
      testMethods.incrementCount();
      System.out.println(testMethods.getCount());
      
      //Change number back to number user entered
      testMethods.decrementCount();
      
      //Test's decrementCount method
      System.out.println("\nYour number decremented by one is: ");
      testMethods.decrementCount();
      System.out.println(testMethods.getCount());
      
      //Test's setCountToZero method
      System.out.println("\nSetting number to zero.");
      testMethods.setCountToZero();
      System.out.println(testMethods.getCount());
      
      //Makes sure counter variable can't be negative
      System.out.println("\nTesting that negative numbers get set back to zero.");
      testMethods.decrementCount();
      System.out.println(testMethods.getCount());
   }
}