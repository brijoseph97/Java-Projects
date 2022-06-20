/**
Created a program that asks for user to input a line of text. Then used toUpperCase and toLowerCase
methods to change text to all uppercase and lowercase respectively. The uppercase and lowercase
strings are then displayed to the console.
**/

import java.util.Scanner;

public class OutputText
{
   public static void main(String[] args)
   {
   //Declare variables
   Scanner text = new Scanner(System.in);
   String uppercase, lowercase, originalText; //originalText will store user input
   
   //Ask User input
   System.out.println("Enter line of text: ");
   
   //Processing
   originalText = text.nextLine(); //Entire line of text is assigned to originalText
   uppercase = originalText.toUpperCase(); //Changes originalText to uppercase
   lowercase = originalText.toLowerCase(); //Changes originalText to lowercase
   
   //Display output
   System.out.println(uppercase);
   System.out.println(lowercase);
   }
}