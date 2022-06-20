/**
Edited a program that was provided which asks for user input
of a rating for a cafe. The program uses a while loop to allow the
user to enter as many scores as they want and uses a sentinel value
of -1 to end the loop. I replaced the switch that was given in the
program with a for loop that steps through all the possible values
one at a time. The output of the program lists how many time
each ranking was given
**/

import java.util.Scanner;
public class CafeRanking {
   public static void main(String [] args) {
      //Declare Variables
      Scanner input = new Scanner(System.in);
      int cafeScore = 0;
      int ranking[] = new int[11];
      
      //Sentinel Loop
      while(cafeScore != -1) {
         //Ask User input
         System.out.printf("Please enter your score for the EuroCafe or enter -1 to end the score tally: ");
         cafeScore = input.nextInt();
         
         // If statement that will be the end of the loop and display output
         // For every ranking in the array
         if (cafeScore == -1) {
            for (int i=1; i<11; i++) {
               System.out.printf("Ranking %d received %d times\n",i, ranking[i]);
            } 
               
            break;
         } else if (cafeScore >= 1 && cafeScore <= 10) { //Error checking that user entered valid entry
            
            for (int i=1; i<11; i++) { //For loop that steps through each possible ranking and adds one to that ranking if selected
               
               if (cafeScore == i) {
                  ranking[i]++;
                  System.out.println("Your score is:"+cafeScore);
               }
            }
         } else { //If user entered a number that wasn't -1 and wasn't between 1-10
            System.out.println("Invalid score was entered.");
         }
      }
   }
}