/**
Created a program that asks for user to input two integers using a scanner variable.
Output of the program will display the sum, difference and product of these two integers.
**/
import java.util.Scanner;
 
public class SimpleCalculator
{
   public static void main(String[] args)
   {
      //Declare variables
      Scanner calc = new Scanner(System.in); //Declares a scanner that will be used for console input
      int num1, num2, sum, difference, product;
      
      //Ask user input
      System.out.println("Enter first integer: ");
      num1 = calc.nextInt();
      System.out.println("Enter second integer: ");
      num2 = calc.nextInt();
      
      //Processing
      sum = num1 + num2;
      difference = num1 - num2;
      product = num1 * num2;
      
      //Display output
      System.out.println(num1 + " + " + num2 + " = " + sum);
      System.out.println(num1 + " - " + num2 + " = " + difference);
      System.out.println(num1 + " * " + num2 + " = " + product);
       }
}